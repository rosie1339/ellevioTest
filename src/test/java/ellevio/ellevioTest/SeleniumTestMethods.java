package ellevio.ellevioTest;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumTestMethods {

	private WebDriver webDriver; 
	  	public SeleniumTestMethods() { 
			System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
	} 
	  	public void init() {
	  		webDriver = new ChromeDriver(); 
	  		webDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
	 		webDriver.manage().window().maximize();
	  	}
	  	public void goToStartPage(String url) {
	  	webDriver.get(url);
	  	
	  	}
	  
	  	public boolean startPage(String xpath, String text) {
	  	 WebElement element = webDriver.findElement(By.xpath(xpath));
	  	 return element.getText().equals(text);
	  	 		
	  	}
	  	
	  	
	  	
	  	public void loginTest(String username, String password) {
	  		webDriver.switchTo().frame(webDriver.findElement(By.id("loginFrame")));
	  		// När man vill spara till element kan skriva på två rader 
	  		WebElement element = webDriver.findElement(By.id("username"));
	  				element.sendKeys("rosie.rahmati@alten.se");
	  				//När man behöver inte jobba mycket lägga till eler gör ändringar
	  				//i passowrd fältet räcker det att skriva på en rad.
	  		 webDriver.findElement(By.id("password")).sendKeys("Lyckani2012");
	  		 webDriver.switchTo().defaultContent();
	  	}
	  	
	  	public void loginButton() {
	  		webDriver.switchTo().frame(webDriver.findElement(By.id("loginFrame")));
	  		webDriver.findElement(By.className("button")).click();
	  		webDriver.switchTo().defaultContent();
	  		
	  		
	  		
	  	}
	  	
	  	public boolean ValidteWelcomePage(String xpath, String text) {
	  		 WebElement element = webDriver.findElement(By.xpath(xpath));
	  		 return element.getText().equals(text);
	  	}
	  	
	  	
	  	public void goInstallerPage(String url) {
	  	
	  	webDriver.get(url);
	  	
	  	}
	  	
	  	
	 public void clickNewCaseButton() throws InterruptedException {
		 WebElement element = webDriver.findElement(By.id("newErrand"));
		 element.click();
			 		
	 }
	 
	
	
	 
	 public void clickExistingConnection() {
		 WebElement element = webDriver.findElement(By.id("existingErrand"));
			element.click(); 
	 }
	 
	 public void clickChangesOnEstablishmentsOrService() {
		 WebElement element = webDriver.findElement(By.id("existingDelSite"));
			element.click(); 
	 }
	 
	 public void enterEstablishmentOrServiceTest() {
		 WebElement element = webDriver.findElement(By.id("searchAddress"));
			element.sendKeys("Storgatan 12"); 
	 }
	 
	 
	 public void searchAddressInMenu(String xpath, String text) {
		 
		 WebElement element = webDriver.findElement(By.xpath(xpath));
		 element.click();
			
			 
		 }
		
	 
	 public void chooseApartment() {
		 
		 WebElement element = webDriver.findElement(By.id("checkbox_6"));
			element.click();  
	 }
	 
	 public void nextButton() {
		 WebElement element = webDriver.findElement(By.id("nextButton"));
			element.click(); 
	 }
	 
	 public boolean validteChangesToMeasurementAndServicingPage(String text) {
		 
		 WebElement element = webDriver.findElement(By.id("draftDialogDiv"));
  		 return element.getText().equals(text);
  	}
	 
	 public void changesToMeasurmentLocation() {

		 WebElement element = webDriver.findElement(By.id("delSiteGroupHeader"));
		 element.click();
			 
	 }

	 public void changeFuseSize() {
		 Select fuseSize = new Select(webDriver.findElement(By.id("fuseSize_0")));
		 fuseSize.selectByVisibleText("35A");
		 
	 }
	 
	 public void popUpQuestionWindow() {
		 
		 WebElement element = webDriver.findElement(By.xpath("/html/body/div[5]"));
		 String text = element.findElement(By.id("servisAffectedDialog")).getText();
		 if(text.contains("Kommer inkommande")) {
			 System.out.println("contain");
			 
		 } else {
			 System.out.println("not contain");
		 } 
		 
	 }
	 
	 public void clickJaButton() {
		 
		 WebElement element = webDriver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[2]")); 
			element.click(); 
	 }
	public void clickPopUpJaButton() {
		WebElement element = webDriver.findElement(By.xpath("/html/body/div[5]/div[3]/div/button[2]")); 
		element.click(); 
	}
		 

	 

}

