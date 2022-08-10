package testPack02;

public class W3school_child_scroll_ss_excel {
	
	
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	
	WebElement alert_box = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));
	alert_box.click();
	
	WebElement confirm_box = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']"));
	confirm_box.click();
	
	WebElement prompt_box = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']"));
	prompt_box.click();
	
	WebElement line_break = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']"));
	line_break.click();
	
//	System.out.println("Current URL of driver at browser "+driver.getCurrentUrl());
	
	//WebElement run = driver.findElement(By.xpath("//button[@id='runbtn']"));
	//run.click();
	
	Thread.sleep(3000);
////	WebElement flight_ad = driver.findElement(By.xpath("//div[@id='a4a-K']"));
////	flight_ad.click();
////			
//	ArrayList <String> all_add = new ArrayList<String>(driver.getWindowHandles());
//	System.out.println("all_add.get(0) = "+all_add.get(0)+ " == "+driver.getWindowHandle());
//	
//	String mainpage = driver.getWindowHandle();
//	System.out.println("Actual mainpage add = "+mainpage);
//	
//	driver.switchTo().window(all_add.get(0));
//	Thread.sleep(1000);
//	
//	driver.switchTo().window(all_add.get(4));
//	System.out.println("First click,alert_box "+driver.getCurrentUrl()+" == "+all_add.get(4)+" == "+driver.getWindowHandle());
//	
//	Thread.sleep(1000);
//	driver.switchTo().window(all_add.get(3));
//	System.out.println("Second click, confirm_box = "+driver.getCurrentUrl()+" == "+all_add.get(3)+" == "+driver.getWindowHandle());
//	
//	Thread.sleep(1000);
//	driver.switchTo().window(all_add.get(2));
//	System.out.println("3rd click, prompt_box == "+driver.getCurrentUrl()+" == "+all_add.get(2)+" == "+driver.getWindowHandle());
//	
//	Thread.sleep(1000);
//	driver.switchTo().window(all_add.get(1));
//	System.out.println("4th click, line_break == "+driver.getCurrentUrl()+" == "+all_add.get(1)+" == "+driver.getWindowHandle());
//	
////	//switching to Iframe and then finding the requested webelement which is inside iframe,		
//	WebElement ifrm1 = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));			// finding iframe
//	
//	driver.switchTo().frame(ifrm1);					// switching to iframe
//	System.out.println(driver.getCurrentUrl());
//	driver.findElement(By.xpath("/html/body/button")).click();		//finding required webelement
//	
////	//Alert pop up handling, have to create obj of Alert class & then few methods of it as mention below.
//
////	Alert alt2 = driver.switchTo().alert();
////	alt2.accept();
////	alt2.dismiss();
////	alt2.sendKeys(mainpage);;
////	alt2.getText();
////	
//	Thread.sleep(1000);
//	System.out.println(driver.switchTo().alert().getText());
//	driver.switchTo().alert().accept();
//
//	
////	//scrolling
//	driver.switchTo().window(all_add.get(0));
//	
//	JavascriptExecutor js = ((JavascriptExecutor)driver);
//	js.executeScript("window.scrollBy(0,-3000)");
//	js.executeScript("arguments[0].scrollIntoView(true);", alert_box);
//	//Thread.sleep(1000);
//	js.executeScript("window.scrollBy(0,-200)");
//	//Thread.sleep(1000);
//	alert_box.click();
//	
//	
////	// Mouse Actions
//	
////	Thread.sleep(3000);
//	ArrayList<String> new2 = new ArrayList<String> (driver.getWindowHandles());
//	System.out.println("All current browsers-after clicking alert_box from main again = "+new2.size());
//	driver.switchTo().window(new2.get(5));
//	System.out.println(driver.getCurrentUrl());
//	Thread.sleep(3000);
//	
//	WebElement ad_img_iframe = driver.findElement(By.xpath("//iframe[@aria-label='Advertisement']"));
//	
//	
////	driver.switchTo().frame(ad_img_iframe);	
////	Thread.sleep(2000);
////	WebElement ad_img= driver.findElement(By.xpath("//div[@class='GoogleActiveViewInnerContainer']"));
////	ad_img.click();
//	
//	//practice as iframe webelement are there sometimes(eg. 4-5 times refresh)there in html but after some refresh it goes aways, becoz he(iframe) is itself was dynamic iframe webelement!
//	//driver.switchTo().frame(ad_img_iframe2);
//	//WebElement ad_img = driver.findElement(By.xpath("//div[@id='google-center-div']"));
//	//ad_img.click();
//
////	Actions act = new Actions(driver);
////	act.moveToElement(ad_img).click().build().perform();
//	
//	ArrayList<String> new3 = new ArrayList<String> (driver.getWindowHandles());
//	System.out.println(new3.size());
//	
//	driver.switchTo().window(new3.get(0));
//	System.out.println(driver.getCurrentUrl());	
////	
//	JavascriptExecutor js2 =  ((JavascriptExecutor)driver);
//	
//	js2.executeScript("window.scrollBy(0,7000)");
////	
////	
//	
//	

}
