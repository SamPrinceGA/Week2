package week2.day4;

public class Edge extends Browser {
	
	
	public void takeSnap() {
		System.out.println("Sanap Taken Successfully");
	}
	
	public void clearCookies() {
		System.out.println("Cookies Cleared");

	}
	
	public static void main(String[] args) {
		Edge objEdge = new Edge();
		
		objEdge.browserName = "Edge";
		objEdge.browserVersion = 7;
		
		System.out.println("Browser Name:- " + objEdge.browserName);
		System.out.println("Browser Version:- "+objEdge.browserVersion);
		
		objEdge.openURL();
		objEdge.takeSnap();
		objEdge.clearCookies();
		objEdge.navigateBack();
		objEdge.closeBrowser();
	}

}
