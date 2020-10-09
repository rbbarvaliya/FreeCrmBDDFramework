//package stepDefinitions;
//
//import java.util.Map;
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
////data table with maps : for parameterization of test cases
//
//@SuppressWarnings("deprecation")
//public class DealsStepWithMapDefinition {
//
//	
//WebDriver driver;
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
//	public void user_enters_username_and_password(DataTable credentials) {
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//
//			driver.findElement(By.name("email")).sendKeys(data.get("username"));
//			driver.findElement(By.name("password")).sendKeys(data.get("password"));
//
//		}
//
//	}
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
//	public void user_enters_deal_details(DataTable dealData) throws InterruptedException{
//		
//		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
//			
//			  driver.findElement(By.name("title")).sendKeys(data.get("title"));
//			  driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
//			  driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
//			  driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
//			  driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//			  Thread.sleep(2000);
//			//move to new deal page:
//			  driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
//			  driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
//				}
//	
//	}
//	
//	@Then("^Close the browser$")
//	public void Close_the_browser() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.quit();
//	}
//	 
//}
