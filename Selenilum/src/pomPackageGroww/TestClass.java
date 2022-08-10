package pomPackageGroww;


public class TestClass extends MainClass1 {
	
	public static void loginPage() throws Exception {
		
		

		
		Login login = new Login(driver);
		
		login.clickLogin();
		login.sendEmail("snkg13@gmail.com");
		login.clickContinue();
		login.sendPassword("Zhakshim@13");
		login.clickSubmit();
		login.sendPin1("2");
		login.sendPin2("2");
		login.sendPin3("1");
		login.sendPin4("3");
		
		Homepage homepage = new Homepage(driver);
		
		homepage.clickInvestment1();
		homepage.clickExplore();

		String ss = new String ("Tata Motors");
		homepage.clickSearch(ss);	
		homepage.searchEle(ss);
		homepage.fourthSelection();
		//homepage.logout();
		homepage.sharePrice();
		
		
	}
	
	public static void reloginPage() throws Exception {
		
		
		loginPage();
		
	}
		
		
		
		
		
	
	
	
	
	
	
	
	
	

}
