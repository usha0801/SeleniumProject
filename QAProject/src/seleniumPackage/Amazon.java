package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.target.Target;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver amazon = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	       amazon.get("https://www.amazon.com");
	       amazon.findElement(By.id("twotabsearchtextbox")).sendKeys("hdmi cable for macbook");
	       amazon.findElement(By.id("nav-search-submit-button")).click();
	       //amazon.findElement(By.id("lists-createlist-createAndAddAsin")).click();
	       WebElement link = amazon.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	       link.click();
	       amazon.findElement(By.id("add-to-cart-button")).click();
	       	        
	     //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	     //ChromeDriver Walmart = new ChromeDriver();
	     //Walmart.get("https://www.walmart.com");
	     //Walmart.findElement(By.name("q")).sendKeys("pajamas boys");
	     
	     
	        
	}

}
