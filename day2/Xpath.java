package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
				
		ChromeDriver objBrw = new ChromeDriver();// launch Chrome brower
		
		objBrw.get("http://leaftaps.com/opentaps/control/main"); // Enter the URL and navigate to Facebook
		objBrw.manage().window().maximize();//Maximize the window
		
		Thread.sleep(2000);//throws InterruptedException
		
		String strUN = "demosalesmanager";
		String strPw = "crmsfa";
	/*	String strCompNanme ="TestCompany";
		String StrFName = "FName";
		String StrLName = "LName";*/
								
		//Enter the username as ‘demosalesmanager
		objBrw.findElement(By.xpath("//input[@id='username']")).sendKeys(strUN);
		
		//Enter the password as 'crmsfa'
		objBrw.findElement(By.xpath("//input[@id='password']")).sendKeys(strPw);
		
		
		//Click on the Login button.
		objBrw.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		Thread.sleep(4000);//throws InterruptedException
		//Close the browser window.
		objBrw.close();
	}

}
