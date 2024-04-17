import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='benz']")).getText());
		String name=driver.findElement(By.cssSelector("label[for='benz']")).getText();
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(name);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String text=driver.switchTo().alert().getText();
		if(text.contains(name)) {
			System.out.println("Yes");
		}
		driver.switchTo().alert().accept();
		driver.close();

		
	}

}
