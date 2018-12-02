package ellevio.ellevioTest;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import org.openqa.selenium.JavascriptExecutor;


public class SeleniumTestMethods2 {
	

	private WebDriver webDriver; 
	  	public SeleniumTestMethods2() { 
			System.setProperty("webdriver.chrome.driver", "bin/chromedriver.exe");
	} 

  	public void init() {
  		webDriver = new ChromeDriver(); 
  		webDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
 		webDriver.manage().window().maximize();
  	}
  	
  	/**
  	 * 
  	 * @param driver
  	 */
    private void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).
                        		executeScript("return document.readyState").
                        		equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }
   
    /**
     * 
     */
    public void waitForLoad() {
    	this.waitForLoad(webDriver);
    }
    
  	
  	public void goToStartPage(String url) {
	  	webDriver.get(url);
	  	}
	  	
	  	
	public static boolean isURL(String url) {
	  	try {
	  		new URL(url);
	  		return true;
	  		
	  	}
		catch (Exception e) {
			return false;
		}
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
  		
  		/* När man behöver inte jobba mycket lägga till eller gör ändringar
  		   i passowrd fältet räcker det att skriva på en rad. */
  		 webDriver.findElement(By.id("password")).sendKeys("Lyckani2012");
  		 webDriver.switchTo().defaultContent();
  	}
  	
	public void loginButton() {
  		webDriver.switchTo().frame(webDriver.findElement(By.id("loginFrame")));
  		webDriver.findElement(By.className("button")).click();
  		webDriver.switchTo().defaultContent();
  		
  	}
	  
	public boolean validateWelcomePage(String xpath, String text) {
 		 WebElement element = webDriver.findElement(By.xpath(xpath));
 		 return element.getText().equals(text);
 	}
	
	
	public boolean validatePage(String xpath, String text) {
		 WebElement element = webDriver.findElement(By.xpath(xpath));
		 return element.getText().equals(text);
	}
 	
	

  	public void goInstallerPage(String url) {
  	
  	webDriver.get(url);
  	
  	}
  	
  	
  	public boolean isExistText(String text) {
  		boolean flag = false;
  		//wait for page load
  		
  		List<WebElement> elements  = webDriver.findElements(By.xpath(".//*"));
  		
  		for( WebElement e : elements) {
  			if ( e.getText().contains(text)){
  				flag = true;
  			}
  		}

  		return flag;
  	}
  	
  

 	
  	public boolean validateCreateNewCasePage(String xpath, String text) {
  		 WebElement element = webDriver.findElement(By.xpath(xpath));
  		 return element.getText().equals(text);
  	}
  	
  	public void clickExistingConnection() {
		 WebElement element = webDriver.findElement(By.id("existingErrand"));
			element.click(); 
	 }
	 
	 public void clickChangesOnEstablishmentsOrService() {
		 WebElement element = webDriver.findElement(By.id("existingDelSite"));
			element.click(); 
	 }
	 

  	
  	
  	 public void clickNewCaseButton() throws InterruptedException {
		 WebElement element = webDriver.findElement(By.id("newErrand"));
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
  	
  	public void selectApartment(){
  		WebElement element = webDriver.findElement(By.id("checkbox_1"));
		element.click();
  	}
  	
  	 public void nextButton() {
		 WebElement element = webDriver.findElement(By.id("nextButton"));
		 System.out.println("checking on next button "+element.getAttribute("value"));
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
		 fuseSize.selectByIndex(3);
		 fuseSize.selectByVisibleText("50A");
		 
	 }
	 
	 
	 
	 public void popUpQuestionWindow() {
		 
		 WebElement element = webDriver.findElement(By.xpath("/html/body/div[5]"));
		 //String text = element.findElement(By.id("servisAffectedDialog")).getText(); It doesn't work???
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
		WebElement element = webDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[2]")); 
		element.click(); 
	}
	
	public void clickCheckBox(String checkBoxId) {
		
		WebElement checkBoxElement = webDriver.findElement(By.id(checkBoxId));
		//checkBoxElement.click();
		System.out.println(checkBoxId);
		System.out.println(checkBoxElement==null);

		new Actions(webDriver).moveToElement(checkBoxElement).click().perform();
	}
	
	public void clickCheckBoxWithoutAction(String checkBoxId) {
		WebElement element = webDriver.findElement(By.id(checkBoxId)); 
		element.click(); 
	}
	
	
	//Titta och testa på måndag
	public void clickChildLinkOfParent(String id) {
		WebElement element = webDriver.findElement(By.id(id)); 
		List<WebElement> divs =element.findElements(By.tagName("div"));
		
		for(WebElement e : divs) {
			if(e.getAttribute("class").equals("resetFields")){
				WebElement link = e.findElement(By.tagName("p"));
				
				new Actions(webDriver).moveToElement(link).click().perform();

			}
		}
		
	}
	
	
	public boolean areClickedAllApartmentCheckbox() {
		boolean flag = true;
		WebElement tableProducts = webDriver.findElement(By.id("selectDeliverySites"));
		List<WebElement> tableRows = tableProducts.findElements(By.tagName("tr"));
	
		System.out.println("size of selectDeliverySites: " + tableRows.size());
		for(WebElement row : tableRows ) {
			
			String text = row.getText();
			String className = row.getAttribute("class");
			
			if(text == null || text.isEmpty())
				continue;
			
			if(text.contains("Lägenhet") ) {
				if(!className.contains("selectedRow")) {
						flag = false;
				}
			}  else {
				if(className.contains("selectedRow")) {
					flag = false;
				} 
			}

			
			System.out.println(text + " : " +className);
		}
		
		return flag;
	}
	
	
	
	public void enterText(String text, String id) {
		
		WebElement element = webDriver.findElement(By.id(id));
		element.sendKeys(text);
		
	}
	
	
	public void sendText(String arg1, String arg2) {
		
		WebElement element = webDriver.findElement(By.id(arg1));
		element.sendKeys(arg2);
		
	}
	
	public void previousButton() {
  		WebElement element = webDriver.findElement(By.id("previousButton"));
  		System.out.println("previousButton tillbaka");
		element.click(); 
  	 }

	public void cleanChangesLink() {
		
		WebElement element = webDriver.findElement(By.linkText("Rensa ändringar"));
		System.out.println("Rensa ändringar");
		element.click(); 
	}	
	
	public void clickChangeFuseButton() {
		 WebElement element = webDriver.findElement(By.id("powerConfigGroupHeader"));
			element.click();
		
	}
	
	public void changeFuseSize2() {
		 Select fuseSize = new Select(webDriver.findElement(By.id("powerConfigExistingFuseSize")));
		 fuseSize.selectByIndex(2);
		 fuseSize.selectByVisibleText("20A");
		 
	 }
	
	public void submit_button() {
		
			 WebElement element = webDriver.findElement(By.id("submitbutton"));
				element.click(); 
		 	
	}

		


	public void clickFunction(String id) {
		WebElement element = webDriver.findElement(By.id(id));
		element.click();
	}
	
	// Enter a valid date in the Desire engagement data field 
	public void enter_Desire_Engagement_Date() {
	  		
		WebElement element = webDriver.findElement(By.id("connectionDate"));
			element.sendKeys("2018-12-10");
	}
	
	

// Enter a invalid date in the Desire engagement data field
	public void invalid_Date() {
		
		WebElement element = webDriver.findElement(By.id("connectionDate"));
		element.sendKeys("2018-10-30");
		
		// To validate error message
	
		String expected_error = "Det valda datumet uppfyller inte kraven. Vänligen se över datum.";
		
		
		boolean result = isExistText(expected_error);
		
		Assert.assertTrue("There should be a error that contain :" + expected_error ,result);
		
		webDriver.findElement(By.id("connectionDate"));
		element.sendKeys(Keys.chord(Keys.CONTROL,"2018-10-30",Keys.CLEAR));
		
		
	}
	

	
	
	public void clearTextField() {
		
		WebElement element = webDriver.findElement(By.id("connectionDate"));
		element.clear(); 
		
	}
	
	public void clearTextFieldById(String id) {
		
		WebElement element = webDriver.findElement(By.id(id));
		System.out.println("clear text");
	
	element.clear();

		
	}
	
	
	// Ogiltigt Förnamn
	public void enter_Invalid_Firstname() {
		WebElement element = webDriver.findElement(By.id("contactPersonFirstName"));
		element.sendKeys("5609MnjiuiRosie&%##?0 _:;M");
		
	}
	
	
	// Giltigt Förnamn
	public void enter_Valid_Firstname() {
  		
		WebElement element = webDriver.findElement(By.id("contactPersonFirstName"));
			element.sendKeys("Rosie");
			element.sendKeys(Keys.TAB);
	}
// Giltigt Efternamn	
public void enter_Valid_Lastname() {
  		
		WebElement element = webDriver.findElement(By.id("contactPersonLastName"));
			element.sendKeys("Rahmati");
			element.sendKeys(Keys.TAB);
	}



// Giltig Telefonnummer
public void enter_Valid_PhoneNumber() {
	
	WebElement element = webDriver.findElement(By.id("contactPersonPhoneNumber"));
	element.sendKeys("0046-733221078");
	element.sendKeys(Keys.TAB);
}

// Giltig Epost
public void enter_Valid_Email() {
	
	WebElement element = webDriver.findElement(By.id("contactPersonEmailAddress"));
	element.sendKeys("rosie.rahmati@alten.se");
	element.sendKeys(Keys.TAB);
}

// Giltig text i Övriga upplysningar fält
public void enter_miscInfo_Text() {
	WebElement element = webDriver.findElement(By.id("miscInfo"));
	element.sendKeys("Ayuiiuoipopp\r\n" + 
			"ppppppppååååååååååååå\r\n" + 
			"åååkkkkkkkkdfffff\r\n" + 
			"ffff fgggggggggggggjh \r\n" + "ooo66699999\r\n" + "44444aattttiiiiii ppppppQpööööö Ööööö Köööjj66666");
	element.sendKeys(Keys.TAB);
}

public void enter_Errand_Name() {
	WebElement element = webDriver.findElement(By.id("errandName"));
	element.sendKeys("Testa uppgradering av mätarsäkring \r\n" + 
			"Testa uppgradering av mätarsäkring Testa uppgradering av mätarsäkring\r\n" + 
			"ååååååkkdffff\r\n" + 
			"ffff fggggggjh \r\n" + 
			"qqqqqq Testa Testa qqqqqqqqqe ghjkj uyiuo n,aaaaaadrtttööö öööööö Öööööööö Köööjjjj666");
	
}




	// Ogiltigt Efternamn
	public void enter_Invalid_Lastname() {
		System.out.println("invalid lastname");
		WebElement element = webDriver.findElement(By.id("contactPersonLastName"));
		element.sendKeys("Rthnn#¤%&()=,,09989823,d99");
		
	}

	
	// Ogiltigt Telefonnummer
	public void enter_Invalid_Phone_Number() {
		
		System.out.println("invalid phonenumber");
		WebElement element = webDriver.findElement(By.id("contactPersonPhoneNumber"));
		element.sendKeys("8765");
	}
	
	
	// Ogiltig Epost
	public void enter_Invalid_Email() {
		System.out.println("invalid email");
		WebElement element = webDriver.findElement(By.id("contactPersonEmailAddress"));
		element.sendKeys("rosie.rahmati:alten.com");
	}
	
	
	
	// Selecting date of December
	public void selecting_Desire_Engagement_Date() {
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"otherErrandDetails\"]/div[1]/div[4]/div/div/div/img"));
		element.click();
	
	}
	
	public void clickOn_uploadFile_Link() {
		WebElement element= webDriver.findElement(By.xpath("//*[@id=\"otherErrandDetails\"]/div[1]/div[6]/div[2]/div[1]/p/span"));
		element.click();
		
	}
	
	
	public void clickOn_file_upload_image() {
		
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"otherErrandDetails\"]/div[1]/div[6]/div[2]/div[1]/p/img"));
		element.click();
	}
	
	
	public void file_Upload() {

		
		WebElement chooseFile = webDriver.findElement(By.xpath("//*[@id=\"fileInput\"]"));
		
		try {
		chooseFile.sendKeys("C:\\Users\\rrahmati\\Pictures\\roses.jpg");
		Thread.sleep(300);
		Robot robot;
		robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ESCAPE);
		 robot.keyRelease(KeyEvent.VK_ESCAPE);
		}catch(IllegalArgumentException  e) {
			System.out.println("The file is not founded");
		}catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
	
	
	public void file_Upload2() {

		WebElement chooseFile = webDriver.findElement(By.xpath("//*[@id=\"fileInput\"]"));
		
		
		try {
			chooseFile.sendKeys("C:\\Users\\rrahmati\\Pictures\\roses.jpg");
			Thread.sleep(300);
			Robot robot;
			robot = new Robot();
			 robot.keyPress(KeyEvent.VK_ESCAPE);
			 robot.keyRelease(KeyEvent.VK_ESCAPE);
			}catch(IllegalArgumentException  e) {
				System.out.println("The file is not founded");
			}catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void create_Case_Button_link() {
		
		WebElement element = webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li[3]/a"));
		element.click();
	}

	
	public void click_On_ChangeFuseServicing() {
		WebElement element = webDriver.findElement(By.id("powerConfigGroupHeader"));
		element.click();
	}
	
	public void choose_Existing_fuse_Size() {
		 Select fuseSize = new Select(webDriver.findElement(By.id("powerConfigExistingFuseSize")));
		 fuseSize.selectByIndex(6);
		 fuseSize.selectByVisibleText("63A");
		 
	 }
	
	public void choose_New_fuse_Size() {
		 Select fuseSize = new Select(webDriver.findElement(By.id("powerConfigNewFuseSize")));
		 fuseSize.selectByIndex(8);
		 fuseSize.selectByVisibleText("100A");
		 
	 }
	
	public void click_on_Search_image() {
		
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"searchCustomerButtonOrderingCustomer\"]"));
		element.click();
	}
	
	public void personNumber_error_message() {
		WebElement element = webDriver.findElement(By.id("messageTextOrderingCustomer"));
		String expected_error = "Felaktigt format på personnummer. Format skall vara YYYYMMDDNNNN";
		
	
		boolean result = isExistText(expected_error);
		
		Assert.assertTrue(expected_error ,result);

	}
	
	public void clear_invalidPersonNumber() {
		webDriver.findElement(By.id("searchParamOrderingCustomerPerNo")).clear();
	}
	
	
	public void enter_invalid_personNumber() {
		
		System.out.println("invalid PersonNumber");
		WebElement element = webDriver.findElement(By.id("searchParamOrderingCustomerPerNo"));
		element.sendKeys("2018-10-06-0363");
		
	}

	
	public void enter_Valid_personNumber() {
		System.out.println("Valid PersonNumber");
		WebElement element = webDriver.findElement(By.id("searchParamOrderingCustomerPerNo"));
		element.sendKeys("196006100363");
	}
	
	public void enter_invalid_orderingCustomer_email() {
		
		System.out.println("invalid Customer email");
		WebElement element = webDriver.findElement(By.id("orderingCustomerEmail"));
		element.sendKeys("rosie@rahmati:alten.com");
	}
	
	public void enter_valid_orderingCustomer_email() {
		
		WebElement element = webDriver.findElement(By.id("orderingCustomerEmail"));
		element.sendKeys("rosie.rahmati@alten.se");
			
	}
	
	
	public void enter_invalid_orderingCustomer_phoneNumber() {
		
		WebElement element = webDriver.findElement(By.id("orderingCustomerCellPhoneNo"));
		element.sendKeys("8900543232");
		element.sendKeys(Keys.TAB);
		
	}
	
	public void phoneNumber_error_message() {
		
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"qtip-1-content\"]"));
		
		
		String expected_error = "Mobiltelefonnummer måste börja med 0 eller +. Skall i övrigt enbart innehålla siffror.";
		
	
		boolean result = isExistText(expected_error);
		
		Assert.assertTrue(expected_error ,result);

	}
	
	public void clear_invalid_orderingCustome_phoneNr() {
		
		WebElement element = webDriver.findElement(By.id("orderingCustomerCellPhoneNo"));
		element.clear();
	}
	
	public void enter_valid_orderingCustomer_phoneNr() {
		
		WebElement element = webDriver.findElement(By.id("orderingCustomerCellPhoneNo"));
		element.sendKeys("0733221078");
		element.sendKeys(Keys.TAB);
		
	}
	
	
	public void uncheck_Or_check_checkBox() {
		
		WebElement element = webDriver.findElement(By.id("tenderByEmail"));
		element.click();
	}
	
	public void click_On_checkBox() {
		WebElement element = webDriver.findElement(By.id("showOrderingNotificationDiv"));
		element.click();
	}
	
	public void click_On_Via_Epost_checkBox() {
		WebElement element = webDriver.findElement(By.id("orderingCustomerNotificationEmail"));
		element.click();
	}
	
	public void click_On_SMS_checkBox() {
		WebElement element = webDriver.findElement(By.id("orderingCustomerNotificationSMS"));
		element.click();
	}
	
	// Mouse Hover
	public void mouse_Hover() {
		
		WebElement element = webDriver.findElement(By.id("tenderByEmailInfo"));
		String expectedTooltip = "Ellevio kommer att skicka en digital offert för signering via mail eller till mobiltelefon. Önskas signering via Bank-ID vänligen uppge detta i ”övrig information” i nästa steg (ärendedata).";
		Actions builder = new Actions (webDriver);
		//builder.clickAndHold().moveToElement(element);
		builder.moveToElement(element);
		builder.moveToElement(element).build().perform();
		
		WebElement toolTipElement = webDriver.findElement(By.xpath("//*[@id=\"qtip-0-content\"]"));
		
		String actualTooltip = toolTipElement.getText();
		System.out.println("Tool Tip Text " +actualTooltip);
		
		if(actualTooltip.equals(expectedTooltip)) {
			
			System.out.println("Test Case Passes");
		}
		
	}
	
	
	public void mouse_Hover2() {
		
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"notificationDiv\"]/div/img"));
		String expectedTooltip = "Om du önskar kan även beställaren få information om ärendestatus.";
		Actions builder = new Actions (webDriver);
		//builder.clickAndHold().moveToElement(element);
		
		builder.moveToElement(element).build().perform();
		
		WebElement toolTipElement = webDriver.findElement(By.xpath("//*[@id=\"notificationDiv\"]/div/img"));
		
		String actualTooltip = toolTipElement.getText();
		System.out.println("Tool Tip Text " +actualTooltip);
		
		if(actualTooltip.equals(expectedTooltip)) {
			
			System.out.println("Test Case Passes");
		}
		
		
		
	}
	public void mouse_Hover_attention() {
		WebElement element = webDriver.findElement(By.xpath("//*[@id=\"DataAreaOrderingCustomer\"]/div[2]/h3/img"));
		String expectedTooltip = "Kontaktperson för ärendet, t ex byggledare, projektledare eller dylikt. Med märkning avses projektnummer, arbetställenummer eller liknande.";
		Actions builder = new Actions (webDriver);
		//builder.clickAndHold().moveToElement(element);
		
		builder.moveToElement(element).build().perform();
		
		WebElement toolTipElement = webDriver.findElement(By.xpath("//*[@id=\"DataAreaOrderingCustomer\"]/div[2]/h3/img"));
		
		String actualTooltip = toolTipElement.getText();
		System.out.println("Tool Tip Text " +actualTooltip);
		
		if(actualTooltip.equals(expectedTooltip)) {
			
			System.out.println("Test Case Passes");
		}
		
		
	}
	
	public void Enter_name() {
		WebElement element = webDriver.findElement(By.id("orderingCustomerMainAddressAttention"));
		element.sendKeys("Anders Åkesson");
		element.sendKeys(Keys.TAB);
		
	}
	
	public void Enter_marking() {
		WebElement element = webDriver.findElement(By.id("orderingCustomerInvoiceAddressLabel"));
		element.sendKeys("Akkoirbc12238304320");
		element.sendKeys(Keys.TAB);
		
	}
	
	public void click_On_OtherAdress() {
		WebElement element = webDriver.findElement(By.id("InvoiceAddressOtherThanMainAddressOrderingCustomer"));
		element.click();
	}
	
	public void enter_Adress() {
	WebElement  element = webDriver.findElement(By.id("orderingCustomerInvoiceAddressStreet"));
	element.sendKeys("Kaponjärgatan");
	element.sendKeys(Keys.TAB);
	}
	
	public void enter_StreetNr() {
		
		WebElement  element = webDriver.findElement(By.id("orderingCustomerInvoiceAddressStreetNo"));
		element.sendKeys("4D");
		element.sendKeys(Keys.TAB);	
	}
	
	
	public void enter_ZIP_Code() {
		
		WebElement  element = webDriver.findElement(By.id("orderingCustomerInvoiceAddressZipCode"));
		element.sendKeys("41302");
		element.sendKeys(Keys.TAB);		
	}
	
	public void enter_City() {
		WebElement  element = webDriver.findElement(By.id("orderingCustomerInvoiceAddressCity"));
		element.sendKeys("Göteborg");
		element.sendKeys(Keys.TAB);	
		
	}
	
	public void clickOn_saveDraft_button() {
		
		 WebElement element = webDriver.findElement(By.id("saveDraftButton"));
			element.click(); 
	}
	
	public void clickOn_OK_button() {
		
		WebElement element = webDriver.findElement(By.xpath("/html/body/div[10]/div[3]/div/button"));
			element.click();
	}
	
	public void enter_saveDraft_name() {
		
		//WebElement  element = webDriver.findElement(By.id("dialogInputDraftName"));
		WebElement  element = webDriver.findElement(By.xpath("//*[@id=\"dialogInputDraftName\"]"));
		if (element == null) {
			System.out.println("element is null");
		}
		element.sendKeys("Uppgradering av mätarsäkring");
	}
	
	public void clickOn_confirmCorrectInfo_checkBox(){
		WebElement element = webDriver.findElement(By.id("confirmCorrectInfo")); 
		System.out.println("checking confirm box "+element.getAttribute("id"));
		element.click();
	}
	
	public void clickOn_Send_button() {
		WebElement element = webDriver.findElement(By.id("submitbutton"));
		System.out.println("submit btn text "+element.getAttribute("value"));
		try {
		Thread.sleep(15000);
		}
		
		catch(Throwable t){
			
		}
		element.click();
		
	}
	
}
