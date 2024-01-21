package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		ChromeDriver nop = new ChromeDriver();
		nop.get("https://admin-demo.nopcommerce.com/login");
		
		nop.findElement(By.name("Email")).clear();
		nop.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		nop.findElement(By.id("Password")).clear();
		nop.findElement(By.id("Password")).sendKeys("admin");
		nop.findElement(By.className("button-1")).click();
		
		nop.close();
		
		
	}

}
