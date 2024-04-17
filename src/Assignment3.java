import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		String[] items={"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		WebDriver driver= new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(3000));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("form-control")));
		Select s=new Select(driver.findElement(By.cssSelector("select.form-control")));
		s.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-body']/h4/a")));
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='card-body']/h4/a"));
		int j=0;
		for(int i=0;i<products.size();i++) {
			String item=products.get(i).getText();
			List<String> l=Arrays.asList(items);
			if(l.contains(item)) {
				driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
				j++;
				if(j==items.length) {
					break;
				}
			}
		}
		driver.findElement(By.cssSelector("a[class*='btn-primary']")).click();
		driver.close();
		
	}

}
