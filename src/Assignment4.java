import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li/a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//div/a[text()='Click Here']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.quit();

		

		
		
	}

}
