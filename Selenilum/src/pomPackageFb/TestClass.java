package pomPackageFb;


public class TestClass extends MainClass{
	
	public static void signup () throws InterruptedException {
		
		
		Signup signup = new Signup(driver);
		
		
		signup.create_new_acc();
		
		String name= "Mahesh";
		signup.sendUserName(name);
		
		String lname = "Pawar";
		signup.sendLastName( lname);
		
		String email = "asdf@gmail.com";
		signup.sendEmailId(email);
		
		signup.sendConfirmEmail(email);
		
		String pwd = "Password";
		signup.sendPwd(pwd);
		
		String day = "22";
		signup.selecttDate(day);
		
		String mon = "May";
		signup.selectMonth(mon);
		
		String year = "2013";
		signup.selectYear(year);
		
		String gender = "male";
		signup.selectGender(gender);
		
		signup.submit();
		
		
		
	}
	

}
