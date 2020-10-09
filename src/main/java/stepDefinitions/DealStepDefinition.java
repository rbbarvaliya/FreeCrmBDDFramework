//package stepDefinitions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DealStepDefinition {
//
//	
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_alredy_on_login_page() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://ui.cogmento.com/");
//	}				
//		
//	@When("^title of login page is Cogmento CRM$")
//	public void title_of_login_page_is_Cogmento_CRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Cogmento CRM", title);			
//	}
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials){
//		List<List<String>> data = credentials.raw();
//	 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//	 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	 }
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		String title = driver.getTitle();
//		System.out.println("Home Page Title:" + title);
//		Assert.assertEquals("Cogmento CRM", title);	
//	}
//	
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() {
//	  driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//	  driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
//	}
//	
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable dealData){
//		 List<List<String>> dealValues =  dealData.raw(); 
//	  driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//	  driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
//	  driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
//	  driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
//	  driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//	}
//	
//	@Then("^Close the browser$")
//	public void Close_the_browser() throws InterruptedException {
//		Thread.sleep(4000);
//		driver.quit();
//	}
//	
//	
//}
//	
