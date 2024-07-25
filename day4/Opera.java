package week2.day4;

public class Opera extends Safari{
	
	
	public void adBlocker() {
		System.out.println("Protected privacy");
	}
	
	public static void main(String[] args) {
		Opera objOpera = new Opera();
		objOpera.adBlocker();
		
		objOpera.browserName = "Opera";
		objOpera.browserVersion = 10;
				
		System.out.println("Browser Name:- " + objOpera.browserName);
		System.out.println("Browser Version:- "+ objOpera.browserVersion);
		
		//Methods calling from Safari Class
		objOpera.readMode();
		objOpera.fullScreenMode();
		
		//Methods calling from Parent Class (Super)
		objOpera.openURL();
		objOpera.closeBrowser();
	}

}
