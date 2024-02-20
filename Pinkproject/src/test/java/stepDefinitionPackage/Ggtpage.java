package stepDefinitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Ggtpage {
	ChromeDriver browserObject;
	@Given("user is on Google home page {string}")
	public void user_is_on_google_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
        browserObject = new ChromeDriver(op);
        browserObject.get(string);
        System.out.println(string + "\t is the site");
	}

	@Then("user enters keyword {string}")
	public void user_enters_keyword(String string) {
	    // Write code here that turns the phrase above into concrete actions
		browserObject.findElement(By.name("q")).sendKeys(string);
        System.out.println(string + "\t is the keyword");  
	}

	@Then("user submits the page")
	public void user_submits_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		browserObject.findElement(By.name("btnK")).submit();
        System.out.println("\t submit here"); 
	}

	@Then("user waits for {int} seconds for google")
	public void user_waits_for_seconds_for_google(Integer int1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(int1 * 1000);
        System.out.println("wait of 5 secs");
        browserObject.close();
	}

	@Given("user is on GitHub home page {string}")
	public void user_is_on_git_hub_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
        browserObject = new ChromeDriver();
        browserObject.get(string);
        System.out.println(string + "\t is the site");
	}

	@Then("user waits for {int} seconds for github")
	public void user_waits_for_seconds_for_github(Integer int1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(int1 * 1000);
        System.out.println("wait of 5 secs");
        browserObject.close();
	}

	@Given("user is on Twitter home page {string}")
	public void user_is_on_twitter_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
        browserObject = new ChromeDriver();
        browserObject.get(string);
        System.out.println(string + "\t is the site");
	}

	@Given("user waits for {int} seconds for twitter")
	public void user_waits_for_seconds_for_twitter(Integer int1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(int1 * 1000);
        System.out.println("wait of 5 secs");
        browserObject.close();
	}


}
