package week2.day4;

public class Safari extends Browser{
	
	
	public void readMode() {
		System.out.println("ReaderMode from Full Access");

	}
	
	public void fullScreenMode() {
		System.out.println("Change to Full Screen mode");

	}
	
	public static void main(String[] args) {
		Safari objSafari = new Safari();
		
		objSafari.browserName = "Safari";
		objSafari.browserVersion = 14;
		
		System.out.println("Browser Name:- " + objSafari.browserName);
		System.out.println("Browser Version:- "+ objSafari.browserVersion);
		
		objSafari.openURL();
		objSafari.readMode();
		objSafari.fullScreenMode();
		objSafari.navigateBack();
		objSafari.closeBrowser();
	}

}
