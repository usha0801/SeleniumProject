package seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		ChromeDriver Testlink = new ChromeDriver();
		Testlink.get("http://training.qaonlinetraining.com/testPage.php");
		
		Testlink.findElement(By.name("name")).sendKeys("Sudharshan");
		Testlink.findElement(By.id("eml")).sendKeys("testmail@abc.com");
		Testlink.findElement(By.name("website")).sendKeys("www.target.com");
		Testlink.findElement(By.name("comment")).sendKeys("Home Appliances");
		Testlink.findElement(By.xpath("/html/body/form/input[5]")).click();
		Testlink.findElement(By.name("boat")).click();
		
		
		Select dp = new Select(Testlink.findElement(By.name("country")));
		dp.selectByVisibleText("India");
		Select kn = new Select(Testlink.findElement(By.name("skill")));
		kn.selectByValue("qa");
		kn.selectByVisibleText("Programming");
		Thread.sleep(4000);
		Testlink.findElement(By.name("submit")).click();
		
		Testlink.findElement(By.id("alert")).click();
		Alert alert = Testlink.switchTo().alert();
		Thread.sleep(1500);
		alert.accept();
				
		Testlink.findElement(By.id("confirm")).click();
		Alert alert1 = Testlink.switchTo().alert();
		Thread.sleep(1500);
		alert1.dismiss();
		
		Testlink.findElement(By.id("prompt")).click();
		Alert alert2 = Testlink.switchTo().alert();
		alert2.sendKeys("Sudharshan");
		Thread.sleep(1500);
		alert2.accept();
		
		

		
	}

}
