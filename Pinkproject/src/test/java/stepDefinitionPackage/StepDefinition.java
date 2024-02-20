package stepDefinitionPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	ChromeDriver browserObject;
	@Given("I am on the demo site login {string}")
		public void i_am_on_the_demo_site_login(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		browserObject = new ChromeDriver(op);
		browserObject.manage().window().maximize();
		browserObject.get(string);
	}

	@When("I enter userName = {string} and password = {string}")
	public void i_enter_user_name_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement username = browserObject.findElement(By.name("Email"));
		WebElement password = browserObject.findElement(By.name("Password"));
		username.clear();
		username.sendKeys(string);
		password.clear();
		password.sendKeys(string2);
	}

	@When("I click login button")
	public void i_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		submitBtn.click();
	}

	@Then("text to display {string} text")
	public void text_to_display_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue=browserObject.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		assertEquals(actualValue,string);
	}

}
