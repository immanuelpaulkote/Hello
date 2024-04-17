import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		String[] items = { "Cucumber", "Brocolli" };
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver,items);
		Thread.sleep(2000);
		//driver.close();
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


	}

	public static void addItems(WebDriver driver,String[] items) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String fname = name[0].trim();
			List l = Arrays.asList(items);

			if (l.contains(fname)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if (j == items.length) {
					break;
				}

			}

		}
	}

}
