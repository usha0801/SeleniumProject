package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://www.itlearn360.com/");
	        
	        int count = 0;
	        
	        //5. List is applied on WebElement to collect all the <a> tag in alllinks reference
	        List<WebElement> allLinks = browserObject.findElements(By.tagName("a"));
		
		//6. Now pass the alllinks values to link reference and for loop is applied on link reference to fetch value one by one using getAttribute method.
	        for (WebElement link : allLinks) {
	          
	            System.out.println(link.getAttribute("href"));
	            count ++;
	            
	        }
		//7. Calculate number of links and print in all.
	        System.out.println("total number of links present: "+count);
		
		//8. Closing the driver using close method.
	        browserObject.close();
	}

}
