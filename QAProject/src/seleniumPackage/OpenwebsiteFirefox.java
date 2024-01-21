package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenwebsiteFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		// FirefoxDriver driver = new FirefoxDriver();
		// driver.get("http://www.amazon.com");
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 ChromeDriver sailpoint = new ChromeDriver();
		 sailpoint.get("http:localhost:8080/identityiq");
		 //sailpoint.close();
	}

}
