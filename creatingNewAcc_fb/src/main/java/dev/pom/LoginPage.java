package dev.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.*;  


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
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
	
	@FindBy (xpath = "//div[@class='otpinput88item'][1]/input[@autocomplete='new-password']")  
	private WebElement pin1;
	
	@FindBy (xpath = "//div[@class='otpinput88item'][2]/input[@autocomplete='new-password']")
	private WebElement pin2;
	
	@FindBy (xpath = "//div[@class='otpinput88item'][3]/input[@autocomplete='new-password']")
	private WebElement pin3;
	
	@FindBy (xpath = "//div[@class='otpinput88item'][4]/input[@autocomplete='new-password']")
	private WebElement pin4;
	
	@FindBy(xpath="(//div[@itemscope='true'])[1]")		//(//div[@class='valign-wrapper cur-po pos-rel'])[1]
	private WebElement growwHomebtn;
	
	private WebDriver driver;
	private static WebDriverWait wait;
	private File file;
	private FileInputStream fileInput;
//	private FileReader filerdr;
	private Properties prop;
	
	


	public LoginPage (WebDriver driver) //throws FileNotFoundException, IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
//		wait=new WebDriverWait( 10,TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		file= new File("J:\\Eclipse old data\\eclipse-workspace_2\\groww.com-maven-testNG\\src\\main\\java\\dev\\pom\\data.properties");
//		fileInput= new FileInputStream(file);
//		filerdr= new FileReader (file);	
//		prop.load(filerdr);
//		prop.load(new FileInputStream("J:\\Eclipse old data\\eclipse-workspace_2\\groww.com-maven-testNG\\src\\main\\java\\dev\\pom\\data.properties"));
//		System.out.println(prop.getProperty("pwd1"));
		try 
		{
			fileInput= new FileInputStream(file);
//			filerdr= new FileReader("data.properties");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("file not found!");
		}
		prop= new Properties();
		try
		{
			prop.load(fileInput);
//			prop.load(filerdr);
			System.out.println(prop.getProperty("pwd1"));		//checking value!
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("getting IOException");
		}
	}
	
	
	public static WebElement waitUntilWebEle(WebElement xyz)
	{
		WebElement waitCall= wait.until(ExpectedConditions.visibilityOf(xyz));
		return waitCall;
	}
	
	
	public void login()
	{
//		wait.until(ExpectedConditions.visibilityOf(login)).click();
		
		LoginPage.waitUntilWebEle(login).click();
		LoginPage.waitUntilWebEle(email).sendKeys(prop.getProperty("email"));
//		wait.until(ExpectedConditions.visibilityOf(continue_btn)).sendKeys(Keys.ENTER);		//.sendKeys(Keys.ENTER)==.click()  dosent click on webElement becoz in previous line it waited until entering the email String and when execution comes to this line physically clicking the Enter dosent give any response !
		LoginPage.waitUntilWebEle(continue_btn).click();
		LoginPage.waitUntilWebEle(passwd).sendKeys(prop.getProperty("passwd"));
		LoginPage.waitUntilWebEle(submit).click();
		LoginPage.waitUntilWebEle(pin1).sendKeys(prop.getProperty("pin1"));
		LoginPage.waitUntilWebEle(pin2).sendKeys(prop.getProperty("pin2"));
		LoginPage.waitUntilWebEle(pin3).sendKeys(prop.getProperty("pin3"));
		LoginPage.waitUntilWebEle(pin4).sendKeys(prop.getProperty("pin4"));
		//LoginPage.waitUntilWebEle(growwHomebtn).click();
	}

}
