import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Ravi");
		driver.findElement(By.name("email")).sendKeys("Ravi@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ravi@123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staDropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("12052001");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-dismissible']")).getText());
		driver.close();
		
	}

}
