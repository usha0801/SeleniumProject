package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sailpoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		ChromeDriver Test = new ChromeDriver();
		Test.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Test.get("http://localhost:8080/identityiq");
		
		Test.findElement(By.id("loginForm:accountId")).sendKeys("spadmin");
		Test.findElement(By.name("loginForm:password")).sendKeys("admin");
		Test.findElement(By.id("loginForm:loginButton")).click();
		//Test.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav/ul[1]/li[4]/a")).click();
		//Test.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav/ul[1]/li[4]/ul/li[1]/a")).click();
		Test.findElement(By.xpath("//*[@id=\"quicklinkButton\"]/i[1]")).click();
		Test.findElement(By.id("quickLinkCategoryManage")).click();
		Test.findElement(By.xpath("//*[@id=\"quickLinkCategoryManage_list\"]/ul/li[2]")).click();
		//Test.findElement(By.id("searchInput")).sendKeys("Aaron.Nichols");
		//Test.findElement(By.className("btn")).click();
			
				
		Thread.sleep(2000);
		Test.close();
		
		
		
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
