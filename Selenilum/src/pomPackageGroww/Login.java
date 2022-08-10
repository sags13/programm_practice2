package pomPackageGroww;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends MainClass1 {
	
	@FindBy (xpath="//div[@class='btn51Btn btn51RipplePrimary btn51Primary']")
	private WebElement login;
	
	@FindBy (xpath ="//input[@id ='login_email1']")
	private WebElement email;
	
	@FindBy (xpath = "//div[@class='absolute-center btn51ParentDimension']")
	private WebElement continue_btn;
	
	@FindBy (xpath ="//input[@id='login_password1']")
	private WebElement passwd;
	
	@FindBy (xpath = "//div[contains(@class,'absolute-center btn51ParentDimension')]")
	private WebElement submit;
	
	@FindBy (xpath = "(//input[@type='number'])[1]")
	private WebElement pin1;
	
	@FindBy (xpath = "(//input[@type='number'])[2]")
	private WebElement pin2;
	
	@FindBy (xpath = "(//input[@type='number'])[3]")
	private WebElement pin3;
	
	@FindBy (xpath = "(//input[@type='number'])[4]")
	private WebElement pin4;
	
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public Login (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(9));
	}
	
	public void clickLogin () throws InterruptedException
	{
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait3.until(ExpectedConditions.visibilityOf(login)).click();
		//Thread.sleep(3000);
	}
	
	public void sendEmail(String email_name)
	{
		wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(email_name);
		//email.sendKeys(email_name);
	}

	public void clickContinue () throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(continue_btn)).click();
		//continue_btn.click();
		//Thread.sleep(2000);
	}
	
	public void  sendPassword(String pwd)
	{
		wait.until(ExpectedConditions.visibilityOf(passwd)).sendKeys(pwd);
		//passwd.sendKeys(pwd);
	}
	
	public void clickSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit)).click();
		//submit.click();
		//Thread.sleep(5000);
	}
	
	public void sendPin1 (String p)
	{
		wait.until(ExpectedConditions.visibilityOf(pin1)).sendKeys(p);
		//pin1.sendKeys(p);
	}
	
	public void sendPin2 (String q)
	{
		pin2.sendKeys(q);
	}
	
	public void sendPin3 (String r)
	{
		pin3.sendKeys(r);
	}
	
	public void sendPin4 (String s) throws InterruptedException
	{
		pin4.sendKeys(s);
		
		//Thread.sleep(3000);
		//driver.switchTo().window()
		
		
	}
	


	
}
