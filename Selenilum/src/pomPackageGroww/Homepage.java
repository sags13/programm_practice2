package pomPackageGroww;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class Homepage {
	
	@FindBy (xpath = "//a[@href='/stocks/user/investments']")
	private WebElement investment;
	
	@FindBy (xpath = "//a[@href='/stocks/user/explore']")
	private WebElement exeplore;
	
	@FindBy (xpath = "//input[@id='globalSearch23']")
	private WebElement search;
	
	@FindAll({@FindBy(xpath = "//div[@class='gsc23SuggestionText']")})
	private List<WebElement>  searchList;
	
//	@FindBy (xpath = "//div[@class='fs14 fsAuto cur-po se27SeSuggestion']")	//wrong syntax!
//	private ArrayList<WebElement>  searchList;
	
//	@FindAll({@FindBy(xpath = "yourpath")})
//	public List<WebElement> networks;
	
	@FindBy (xpath= "//div[@class='fs14 fsAuto cur-po se27SeSuggestion'][4]")
	private WebElement fourthEle;
	
	@FindBy (xpath="(//img[@class='circle'])[1]")
	private WebElement logout;
	
	@FindBy (xpath= "(//div[@class='settingItem valign-wrapper'])[5]")
	private WebElement logoutbtn;
	
	@FindBy (xpath= "//span[@style='height: 33px;']")
	private WebElement sharePr;
	
	private WebDriver driver;
	private WebDriverWait wait;
	private SoftAssert soft;
	
	
	public Homepage (WebDriver driver)
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	}
	
	
	public void clickInvestment1() throws InterruptedException 
	{									  
		wait.until(ExpectedConditions.visibilityOf(investment)).click();
		//Thread.sleep(1500);
		//investment.click();	
	}
	
	public  void clickExplore() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(exeplore)).click();
		//Thread.sleep(1500);
		//exeplore.click();
	}
	
	public void clickSearch(String ss) throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(search)).sendKeys(ss);
		//Thread.sleep(2000);
		//search.sendKeys(ss);
		Thread.sleep(2000);
	}
	
	public void searchEle (String str)
	{
		str=str.toLowerCase();
		System.out.println("str = lower case str "+str);
		//String str_web = null;
		int i= 0;
		wait.until(ExpectedConditions.visibilityOfAllElements(searchList));
		System.out.println("size of search list WebElements"+searchList.size());
		for ( i=0; i<=(searchList.size()-1); i++) {
			
			//System.out.println("all elements from search box "+i+" "+searchList.get(i).getText());
		
			//str_web= searchList.get(i).getText().toLowerCase();		//similar syntax for below line, by referance and changing the value of that string variable
			String str_web = new String (searchList.get(i).getText().toLowerCase());	//by creating new object everytime for loops runs
			
			if (str_web.startsWith(str))
					
			{
				System.out.println("match contain "+i+" is = "+str_web);
			}
		
		}
	}
	
//	public void searchEleAssertion(String stra) {
//	
//	wait.until(ExpectedConditions.visibilityOfAllElements(searchList));
//	SoftAssert soft = new SoftAssert();
//	for (int i=0; i<searchList.size(); i++) {
//		
//		String strGet = searchList.get(i).getText().toLowerCase(); 
//		
//		System.out.println("strGet = "+strGet);
//		if(stra.startsWith(strGet))
//		{
//			soft.assertEquals(stra, );
//		
//		}
//	}
//	
//}
	
	public void fourthSelection ()
	{
		
		wait.until(ExpectedConditions.visibilityOf(fourthEle)).click();
		//fourthEle.click();
	}
	
	public void logout()
	{
		wait.until(ExpectedConditions.visibilityOf(logout)).click();
		wait.until(ExpectedConditions.visibilityOf(logoutbtn)).click();
//		logout.click();
//		logoutbtn.click();
		
		
	}
	
	public void sharePrice()
	{
		String str1 = wait.until(ExpectedConditions.visibilityOf(sharePr)).getText();
		System.out.println("Share price is "+str1);
	}

}
