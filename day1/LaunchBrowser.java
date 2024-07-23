package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
				
		ChromeDriver objBrw = new ChromeDriver();// launch Chrome brower
		
		objBrw.get("http://leaftaps.com/opentaps/control/main"); // Enter the URL and navigate to Facebook
		objBrw.manage().window().maximize();//Maximize the window
		
		Thread.sleep(2000);//throws InterruptedException
		
		String strUN = "demosalesmanager";
		String strPw = "crmsfa";
		String strCompNanme ="TestCompany";
		String StrFName = "FName";
		String StrLName = "LName";
								
		//Enter the username as ‘demosalesmanager
		objBrw.findElement(By.id("username")).sendKeys(strUN);
		
		//Enter the password as 'crmsfa'
		objBrw.findElement(By.id("password")).sendKeys(strPw);
		
		//Click on the Login button.
		objBrw.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA link
		objBrw.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);//throws InterruptedException
		
		//Click on the Leads tab.
		objBrw.findElement(By.linkText("Leads")).click();
		
		//Click on the Create Lead link from shortcuts.
		objBrw.findElement(By.linkText("Create Lead")).click();
		
		//Enter the mandatory fields on the web page.
		objBrw.findElement(By.id("createLeadForm_companyName")).sendKeys(strCompNanme);
		objBrw.findElement(By.id("createLeadForm_firstName")).sendKeys(StrFName);
		objBrw.findElement(By.id("createLeadForm_lastName")).sendKeys(StrLName);
		
		//Select Employee in the source dropdown (using index)
		WebElement sourceDropdpwn = objBrw.findElement(By.id("createLeadForm_dataSourceId"));
		Select data1 = new Select(sourceDropdpwn);
		data1.selectByIndex(1);
		
		//Select Automobile in the Marketing Campaign (using visibleText)
		WebElement campaignDropdpwn = objBrw.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select data2 = new Select(campaignDropdpwn);
		data2.selectByVisibleText("Automobile");
		
		//Select Corporation in Ownership (using value)
		WebElement OwnershipDropdpwn = objBrw.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select data3 = new Select(OwnershipDropdpwn);
		data3.selectByValue("OWN_CCORP");
		
		//Click on the Create Lead button.
		objBrw.findElement(By.name("submitButton")).click();
		
		//Verify the title of the current web page.
		String strTitle = objBrw.getTitle();
		System.out.println(strTitle);
		
		//Close the browser window.
		objBrw.close();
	}

}
