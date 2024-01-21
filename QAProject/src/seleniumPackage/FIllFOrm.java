package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FIllFOrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Usharani");
	        browserObject.findElement(By.id("eml")).sendKeys("usharani.sudharshan@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("www.amazon.com");
	        browserObject.findElement(By.name("comment")).sendKeys("Shopping");
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        browserObject.findElement(By.xpath("//input[@value='boat']")).click();
	        
	        Select se = new Select(browserObject.findElement(By.name("country")));
	        Thread.sleep(4000);
	        se.selectByVisibleText("India");
	        browserObject.findElement(By.name("submit")).click();
	        
	        browserObject.findElement(By.id("alert")).click();
	       Alert alert = browserObject.switchTo().alert();
	       alert.accept();
	       
	       browserObject.findElement(By.id("confirm")).click();
	       Alert alert1= browserObject.switchTo().alert();
	       alert1.dismiss();
	       
	       browserObject.findElement(By.id("prompt")).click();
	       Alert alert2=browserObject.switchTo().alert();
	       alert2.sendKeys("Hello ");
	       Thread.sleep(4000);
	       alert2.accept();
	        
	      
	        
	        
	        
	       
	}

}
