import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class JavaStreamsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		it.next();
		String c=it.next();
		driver.switchTo().window(c);
		driver.findElement(By.xpath("//th[@aria-sort='descending']/span[1]")).click();
		List<WebElement> items=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> oitems=items.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sitems=oitems.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(oitems.equals(sitems));
		
		List<String> price;
		//scanning multiple pages of web table(Pagination)
		do {
			List<WebElement> items1=driver.findElements(By.xpath("//tr/td[1]"));

			price=items1.stream().filter(s->s.getText().contains("Rice")).map(s->getVegPrice(s)).collect(Collectors.toList());
			price.stream().forEach(s->System.out.println(s));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}while(price.size()<1);
		
		driver.quit();
		
	}

	private static String getVegPrice(WebElement s) {
		String p=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return p;
	}

}
