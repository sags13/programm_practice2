package pomPackageGroww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClassGroww {
	
	private Login login;
	private WebDriver driver;
	private Homepage homepage;
	private SoftAssert soft;
	
	
	@BeforeClass
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groww.in");
		login =new Login(driver);
	}
	
	
	@BeforeMethod
	public void loginGroww() throws InterruptedException {
		
		login.clickLogin();
		login.sendEmail("snkg13@gmail.com");
		login.clickContinue();
		login.sendPassword("Zhakshim@13");
		login.clickSubmit();
		login.sendPin1("2");
		login.sendPin2("2");
		login.sendPin3("1");
		login.sendPin4("3");
		
		homepage = new Homepage(driver);
		soft = new SoftAssert();

	}
	
	@Test
	public void navigateToInvestment() throws InterruptedException {
		
		homepage.clickInvestment1();
		homepage.clickExplore();
		homepage.clickSearch("tata motors");
		homepage.searchEle("tata motor");
		//homepage.searchEleAssertion("tata motors");
		String url = driver.getCurrentUrl();
		String exptUrl = "https://groww.in/stocks/user/exploree";
		soft.assertEquals(url,exptUrl);
		soft.assertAll();
		homepage.fourthSelection();
		
	}

	
	@AfterMethod
	public void logout() {
		
		homepage.logout();
		
	}
}

//