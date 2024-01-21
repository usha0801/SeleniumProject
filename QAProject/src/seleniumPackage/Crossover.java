package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Crossover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver mw = new ChromeDriver();
		mw.get("https:\\www.amazon.com");
		System.out.println("this is " + mw.getTitle() + "website");
		System.out.println("url is " + mw.getCurrentUrl());
		
		mw.navigate().to("https:\\www.target.com");
		System.out.println("this is " + mw.getTitle() + "website");
		System.out.println("url is" + mw.getCurrentUrl());
				
		
		mw.navigate().to("https:\\www.macys.com");
		mw.navigate().back();
		System.out.println("this is " + mw.getTitle() + "website" );
		System.out.println("url is " + mw.getCurrentUrl());
		mw.navigate().back();
		mw.navigate().forward();
		Thread.sleep(5000);
		mw.close();
	}

}
