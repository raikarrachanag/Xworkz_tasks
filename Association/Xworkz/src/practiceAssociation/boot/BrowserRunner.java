package practiceAssociation.boot;

import practiceAssociation.app.Browser;

public class BrowserRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking main in BrowserRunner");
		Browser browser=new Browser();
		browser.search();
		browser.information();
	}
}
