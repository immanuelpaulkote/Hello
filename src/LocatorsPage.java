import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsPage {
	WebDriver driver;
	By Uname=By.id("inputUsername");
	By Upass=By.name("inputPassword");
	By SignIn=By.className("signInBtn");
	By FPass=By.linkText("Forgot your password?");
	By Nname=By.xpath("//input[@placeholder='Name']");
	By NPass=By.cssSelector("input[placeholder='Email']");
	By Num=By.xpath("//form/input[3]");
	By ReLogin=By.cssSelector(".reset-pwd-btn");
	By GoLogin=By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]");
	By R1=By.id("chkboxOne");
	By R2=By.name("chkboxTwo");
	
	public LocatorsPage(WebDriver d) {
		driver=d;
	}
	
	public void username(String un) {
		driver.findElement(Uname).sendKeys(un);
	}
	public void password(String ps) {
		driver.findElement(Upass).sendKeys(ps);
	}
	public void signin() {
		driver.findElement(SignIn).click();
	}
	public void fpass() {
		driver.findElement(FPass).click();
	}
	public void nname(String nnm) {
		driver.findElement(Nname).sendKeys(nnm);
	}
	public void npass(String nps) {
		driver.findElement(NPass).sendKeys(nps);
	}
	public void num1(String numb) {
		driver.findElement(Num).sendKeys(numb);
	}
	public void rlogin() {
		driver.findElement(ReLogin).click();
	}
	public void glogin() {
		driver.findElement(GoLogin).click();
	}
	public void username1(String un) {
		driver.findElement(Uname).sendKeys(un);
	}
	public void password1(String ps) {
		driver.findElement(Upass).sendKeys(ps);
	}
	public void r1() {
		driver.findElement(R1).click();
	}
	public void r2() {
		driver.findElement(R2).click();
	}
	public void signin1() {
		driver.findElement(SignIn).click();
	}
	
	
	
	

}
