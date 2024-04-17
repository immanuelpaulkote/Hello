import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//		SoftAssert s=new SoftAssert();
//		for (WebElement link : links) {
//			String url = link.getAttribute("href");
//			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//			conn.setRequestMethod("HEAD");
//			conn.connect();
//			int resCode = conn.getResponseCode();
//			System.out.println(resCode);
//			s.assertTrue(resCode<400, "The link with text" + link.getText() + "is broken with code" + resCode);
//			
//		}
//		s.assertAll();
		
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		System.out.println("Total links are "+links.size());

		for(int i=0;i<links.size();i++)

		{

		WebElement ele= links.get(i);

		String url=ele.getAttribute("href");

		verifyLinkActive(url);

		}
		driver.close();

		}

		public static void verifyLinkActive(String linkUrl)

		{

		try

		{

		URL url = new URL(linkUrl);

		HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();

		httpURLConnect.setConnectTimeout(3000);

		httpURLConnect.connect();
		
		System.out.println(httpURLConnect.getResponseCode());


//		if(httpURLConnect.getResponseCode()==200)
//
//		{
//
//		System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
//
//		}
//
//		if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
//
//		{
//
//		System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
//
//		}

		} 
		catch (Exception e) {



		}

	}


}
