import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("display: block; opacity: 0.5;")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
    	int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.cssSelector("input[id*='FindFlights']")).click();
		
		driver.close();
	}

}
