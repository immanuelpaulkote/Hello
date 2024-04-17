import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		//June 19
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		while(!driver.findElement(By.cssSelector("div[class*='flatpickr-calendar'] div[class='flatpickr-current-month']")).getText().contains("July")) {
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] svg[viewBox='0 0 17 17']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector(".flatpickr-day "));
		for(int i=0;i<dates.size();i++) {
			String text=driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();
			if(text.equalsIgnoreCase("24")) {
				driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();
				break;
			}
		}
		
	}

}
