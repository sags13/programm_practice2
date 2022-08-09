//package dev.pom;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class SignupFB {
//	
//	@FindBy (xpath = "(//a[@role='button'])[2]")
//	private WebElement new_acc;
//	
//	@FindBy (xpath = "//input[@name='firstname']")
//	private WebElement firstname;
//	
//	@FindBy (xpath = "//input[@name='lastname']")
//	private WebElement lastname;
//	
//	@FindBy (xpath = "//input[@name='reg_email__']")
//	private WebElement emailid;
//	
//	@FindBy (xpath = "//input[@name= 'reg_email_confirmation__']")
//	private WebElement hiddenConfirmEmail;
//	
//	@FindBy (xpath = "//input[@name='reg_passwd__']")
//	private WebElement newpwd;
//	
//	@FindBy (xpath = "//select[@id='day']")
//	private WebElement day;
//	
//	
//	@FindBy (xpath = " //select[@id='month']")
//	private WebElement month;
//	
//	@FindBy (xpath= "//select[@id='year']")
//	private WebElement year;
//	
//	@FindBy (xpath = "//input[@value='2']")
//	private WebElement male;
//	
//	@FindBy (xpath = "//input[@value='1']")
//	private WebElement female;
//	
//	@FindBy ( xpath = "//button[@name='websubmit']")
//	private WebElement submit;
//	
//	private WebDriver driver; 
//	private WebDriverWait wait;
//	
//	SignupFB (WebDriver driver){
//		
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//		wait = new WebDriverWait(driver, Duration.ofSeconds(7));
//		
//		
//	}
//	
//	
//	public void create_new_acc () throws InterruptedException 
//	{
//		wait.until(ExpectedConditions.visibilityOf(new_acc));
//		//new_acc.click();		
//		//Thread.sleep(5000);
//	}
//	
//	
//	public void sendUserName (String name)  
//	{
//		wait.until(ExpectedConditions.visibilityOf(firstname));
//		//firstname.sendKeys(name);
//	}
//	
//	
//	public void sendLastName (String lname)
//	{
//		lastname.sendKeys(lname);
//	}
//	
//	
//	public void sendEmailId (String email)
//	{
//		emailid.sendKeys(email);
//	}
//	
//	
//	public void sendConfirmEmail (String cemail) 
//	{
//		hiddenConfirmEmail.sendKeys(cemail);
//	}
//	
//	
//	public void sendPwd (String passwd)
//	{
//		newpwd.sendKeys(passwd);
//	}
//		
//	
//	public void selecttDate (String  date)
//	{
//		Select dd = new Select (day);
//		dd.selectByVisibleText(date);	
//	}
//	
//	
//	public void selectMonth (String months)
//	{
//		Select mm = new Select (month);
//		mm.selectByVisibleText(months);
//	}
//	
//	
//	public void selectYear (String years)
//	{
//		Select yy = new Select (year);
//		yy.selectByVisibleText(years);
//	}
//	
//	
//	public void selectGender (String genders)
//	{
//		genders = genders.toLowerCase();
//		if(genders == "male" )
//		{
//			if (male.isSelected () == false)
//			{
//				male.click();
//			}
//		}
//		else if (genders == "female")
//		{
//			if(female.isSelected() == false )
//			{
//				female.click();
//			}
//		}
//	}
//	
//	
//	public void submit ()
//	{
//		submit.click();
//	}
//}
