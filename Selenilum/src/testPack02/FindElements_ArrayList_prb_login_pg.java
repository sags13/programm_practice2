package testPack02;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_ArrayList_prb_login_pg{
	
	public static void main (String argd[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://groww.in/");
		
		WebElement login = driver.findElement(By.xpath("//div[@class='btn51Btn btn51RipplePrimary btn51Primary']"));
		login.click();
		WebElement email = driver.findElement(By.xpath("//input[@id ='login_email1']"));
		email.sendKeys("snkg13@gmail.com");
		WebElement continue_btn = driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension']"));
		continue_btn.click();
		
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='login_password1']"));
		pwd.sendKeys("Zhakshim@13");
		
		WebElement submit = driver.findElement(By.xpath("//div[contains(@class,'absolute-center btn51ParentDimension')]"));

		submit.click();
		System.out.println("  "+submit.getText());
		
		List <WebElement> pin = driver.findElements(By.xpath("//div[@id='otpinput88parent']/div[@class='otpinput88item']"));
		
		List<Integer> k = new ArrayList <Integer> ();
		
		List <Integer> l = new ArrayList<Integer> ();
		
		int p [] = {11,22,33,44,};
		for (int j=0; j<=3; j++)
		{
			k.add(j, p[j]);
			l.add(p[j]);
			
		}
//above for loop or below manually.	
//		k.add(11);
//		k.add(22);
//		k.add(33);
//		k.add(44);
		System.out.println("hi "+k);
		System.out.println("Hi im l"+l);
		
		
		
		
//		for (int i=0; i<=3; i++)
//		{
//			String j = String.valueOf(k.get(i));
//			
//			pin.get(i).sendKeys(j);
//		}
//		
		                                                
		
		
		
	}

}








