package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionLoginPage {
	
	private static Logger log = null;

	@Before(order = 2)
	public void setup() {
		System.out.println("Global before 1");
		 System.setProperty("log4j.configurationFile","./resources/log4j.xml");
		 log = LogManager.getLogger(StepDefinitionLoginPage.class.getName());
		
	}

	@Before(order = 1)
	public void setup1() {
		System.out.println("Global before 2");
	}

	@After()
	public void tearDown() {
		System.out.println("Global after 1");
	}

	@After("@PositiveScenario")
	public void tearDown1() {
		System.out.println("Global after 2");
	}

	@Given("^User is at the login page$")
	public void user_is_at_the_login_page() {
		System.out.println("Hello1");
		int i =10;
		for (int j=1; j>i;j++) {
			System.out.println("Hello for loop");
		}
		//WebDriver driver = new ChromeDriver();
		
		log.debug("Debug message");
		log.error("Error message");
		log.info("Info message");
		
	}

	@When("^User enter the valid username and password$")
	public void user_enter_the_valid_username_and_password() throws Throwable {
		System.out.println("Hello2");
	}

	@When("^User hit login button$")
	public void user_hit_login_button() throws Throwable {
		System.out.println("Hello3");
	}

	@Then("^User should be redirected to the homepage$")
	public void user_should_be_redirected_to_the_homepage() throws Throwable {
		System.out.println("Hello4");
	}

	@When("^User enter the invalid username and password$")
	public void user_enter_the_invalid_username_and_password() {
		System.out.println("Negative Hello");
	}

}
