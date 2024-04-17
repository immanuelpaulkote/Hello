import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindow {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();   //[parentId,childId]
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		String username=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.quit();
		
		
	}

}
