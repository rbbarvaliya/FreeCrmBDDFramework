package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_alredy_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
	}				
		
	@When("^title of login page is Cogmento CRM$")
	public void title_of_login_page_is_Cogmento_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);			
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
	    driver.findElement(By.name("email")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page Title:" + title);
		Assert.assertEquals("Cogmento CRM", title);	
	}
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() {
	  driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	  driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	}
	
	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details(String firstname, String lastname, String position){
	  driver.findElement(By.name("first_name")).sendKeys(firstname);
	  driver.findElement(By.name("last_name")).sendKeys(lastname);
	  driver.findElement(By.name("position")).sendKeys(position);
	  driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	}
	
	@Then("^Close the browser$")
	public void Close_the_browser() {
		driver.quit();
	}

	
	
	
}
