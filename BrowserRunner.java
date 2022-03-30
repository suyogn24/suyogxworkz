package com.xworkz.browser;
import com.xworkz.browser.sub.MozillaBrowser;
import com.xworkz.browser.parent.Browser;

public class BrowserRunner extends MozillaBrowser  {

	public static void main(String[] args) throws InterruptedException  {
		
		Browser browser=new MozillaBrowser();

		browser.connect();
		browser.developerTool();
		browser.equals(browser);
		browser.getClass();
		browser.getCompany();
		browser.getName();
		browser.getVersion();
		browser.getName();
		browser.hashCode();
		browser.notify();
		browser.notifyAll();
		browser.showTime();
		browser.toString();
		browser.cleanUp();
		browser.Browser("ANDROID","ANDROID 97.01","ANDROID 98.01");
		browser.wait(0, 0);
		browser.Browser();
		browser.showTime();


	}

}
