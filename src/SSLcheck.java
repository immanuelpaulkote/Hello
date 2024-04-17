import java.time.Duration;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
//		Proxy proxy=new Proxy();
//		proxy.setHttpProxy("ipaddress:4444");
//		options.setCapability("proxy", proxy);
		WebDriver driver= new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
	}

}
