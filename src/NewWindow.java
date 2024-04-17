import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Switching Tab
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com/");
		String data=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(parentId);
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys(data);
		//Screenshot
		File file=name.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("data.png"));
		//Get height&width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

		driver.quit();
	}

}
