package week2.day4;

public class Chrome extends Browser {
	
	
	public void openIncognito() {
		System.out.println("Open Chrome Browser in Incognito mode");	
	}
	
	public void clearCache() {
		System.out.println("ClearCache from Chrome Browser");
	}
	
	public static void main(String[] args) {
		
		Chrome objChrome = new Chrome();
		
		objChrome.browserName = "Chrome";
		objChrome.browserVersion = 6;
		
		System.out.println("Browser Name:- " + objChrome.browserName);
		System.out.println("Browser Version:- "+objChrome.browserVersion);
		
		objChrome.openIncognito();
		objChrome.clearCache();
		objChrome.openURL();
		objChrome.navigateBack();
		objChrome.closeBrowser();
		
	}
}

