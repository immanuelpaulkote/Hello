import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		LocatorsPage lp=new LocatorsPage(driver);
		lp.username("Immy");
		lp.password("hello123");
		lp.signin();
		lp.fpass();
		Thread.sleep(1000);
		lp.nname("Immy");
		lp.npass("immy@gmail.com");
		lp.num1("11235");
		lp.rlogin();
		lp.glogin();
		Thread.sleep(1000);
		lp.username("Immy");
		lp.password("rahulshettyacademy");
		lp.r1();
		lp.r2();
		lp.signin();
		Thread.sleep(2000);
		//driver.quit();

	}

}
