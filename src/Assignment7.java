import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		int rows=driver.findElements(By.cssSelector(".table-display td:nth-child(3)")).size()+driver.findElements(By.cssSelector(".table-display th:nth-child(3)")).size();
		int col=driver.findElements(By.cssSelector(".table-display th")).size();
		System.out.println("Rows:"+rows+" Columns:"+col);
		List<WebElement> text=driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		for(int i=0;i<text.size();i++) {
			System.out.println(text.get(i).getText());
		}
		
		
	}

}
