package stepDefenitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gift {
	WebDriver browserObject;
	@Given("I am on the JCP page {string}")
	public void i_am_on_the_jcp_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		browserObject = new ChromeDriver();
		browserObject.get(string);
	    
	}

	@When("Enter the search key {string}")
	public void enter_the_search_key(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 WebElement valentine = browserObject.findElement(By.id("searchInputId"));
	 valentine.sendKeys(string);
	}

	@When("Click on the search icon")
	public void click_on_the_search_icon() {
	    // Write code here that turns the phrase above into concrete actions
	 WebElement submit = browserObject.findElement(By.xpath("//*[@id=\"typeaheadInputContainer\"]/div/button"));
	 submit.click();
	}

	@When("select the option Bijoux Bar {int}-pc. Bracelet Set")
	public void select_the_option_bijoux_bar_pc_bracelet_set(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement brace = browserObject.findElement(By.xpath("//*[@id="gallery-product-list"]/div[3]/div/ul/li[2]/div/div/div/div/div[3]/a[1]"));
		Thread.sleep(int1*1000);
		brace.click();
	}	
}
