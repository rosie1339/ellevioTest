package ellevio.ellevioTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class EllevioTestSteps2 {

	public static SeleniumTestMethods2 stm = new SeleniumTestMethods2();

	@Given("^I am on the Ellevio Login page$")
	public void i_am_on_the_Ellevio_Login_page() throws Throwable {
		stm.init();
		stm.goToStartPage("https://cte.fortexinstaller.ellevio.com/fortex/fortex_login.html");

	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" in the username field and password field$")
	public void i_enter_my_username_and_password_in_the_username_field_and_password_field(String arg1, String arg2) throws Throwable {
		stm.loginTest(arg1, arg2);

	}




	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String arg1) throws Throwable {
		if(arg1.equals("Ja")) {
			stm.clickPopUpJaButton();
		} else if(arg1.equals("Nästa")){
			stm.nextButton();
		} else if(arg1.equals("Logga in")) {
			stm.loginButton();
		} else if(arg1.equals("A new case")) {
			stm.clickNewCaseButton(); 
		} else if(arg1.equals("Existing connection")) {
			stm.clickExistingConnection();
		}
		else if(arg1.equals("changes to establishments or service")) {
			System.out.println("Ändringar på anläggning");
			stm.clickChangesOnEstablishmentsOrService();
		}
		

		else if(arg1.equals("Tillbaka")) {
			System.out.println("clickbutton tillbaka");
			stm.previousButton();
		}

		else if(arg1.equals("Rensa ändringar")) {
			System.out.println("link Ränsa ändingar");
			stm.create_Case_Button_link();
		}

		else if(arg1.equals("servissäkring ")) {
			System.out.println("Ändra servissäkring");
			stm.clickChangeFuseButton();
		}
		
		

		else if(arg1.equals("Anmäl plombbrytning")) {
			System.out.println("Rapoprt till plombbrytning");
			stm.clickFunction("sealBreakGroupHeader");
		}
		
		else if(arg1.equals("Ändring servissäkring")) {
			System.out.println("function Ändra servissäkring");
			stm.click_On_ChangeFuseServicing();
		}
		
		else if(arg1.equals("OK")) {
		System.out.println("function OK button for Save draft");
			stm.clickOn_OK_button();
		}
		
		else if(arg1.equals("Skicka")) {
			System.out.println("function SKICKA button for another case");
			stm.submit_button();
		}
		

		else {
			stm.changesToMeasurmentLocation();
		}

	}

	@Then("^It should be displayed \"([^\"]*)\" on \"([^\"]*)\" page$")
	public void it_should_be_displayed_the(String arg1, String arg2) throws Throwable {
		boolean result = false;
		if(arg2.equals("welcome")) {

			result = stm.validatePage("//*[@id=\"ctl00_html\"]/body/div[5]/div/h1", arg1);
		} else if(arg2.equals("a new case")) {
			result = stm.isExistText(arg1);
		}
		else if(arg2.equals("select type of work")) {
			result = stm.isExistText(arg1);
		} 

		else if(arg2.equals("Enter the stablishment/")) {
			result = stm.isExistText(arg1);
		} 

		else if(arg2.equals("changes to fuse size")) {
			result = stm.isExistText(arg1);

		}else if(arg2.equals("client")) {
			result = stm.isExistText(arg1);
		}

		else if(arg2.equals("other tasks")) {
			result = stm.isExistText(arg1);
		}
		else if(arg2.equals("Review")) {
			System.out.println("Granska is validated");
			result = stm.isExistText(arg1);
		}
		
		else if(arg2.equals("Review")) {
			System.out.println("Ärendet är skickat");
			result = stm.isExistText(arg1);
		}

		Assert.assertTrue("There is no msg", result);


	}


	@When("^User enters address in the search address field and clicks on \"([^\"]*)\"$")
	public void user_enters_address_in_the_search_address_field_and_clicks_on(String arg1) throws Throwable {
		stm.enterEstablishmentOrServiceTest();
		stm.searchAddressInMenu("/html[1]/body[1]/ul[1]/li[1]", "Storgatan 12, 11451 Stockholm");
	}


	@When("^User enters address in the search address field and clicks$")
	public void user_enters_address_in_the_search_address_field_and_clicks() throws Throwable {
		stm.enterEstablishmentOrServiceTest();
	}

	@When("^User chooses apartment$")
	public void user_chooses_apartment() throws Throwable {
		stm.chooseApartment();

	}


	@When("^User chooses stablishments ID and clicks on fuseBox in the FuseBox drop-down list$")
	public void user_chooses_stablishments_ID_and_clicks_on_fuseBox_in_the_FuseBox_drop_down_list() throws Throwable {
		stm.changeFuseSize();

	}

	@Then("^It pops up the window \"([^\"]*)\"$")
	public void it_pops_up_the_window(String arg1) throws Throwable {
		
		boolean result = stm.isExistText("Kommer inkommande kabel från gatan (servisledningen) att beröras av ändringen?");


		Assert.assertTrue("There is no msg", result);
	}




	@Given("^User is already on Wellcome to installer page$")
	public void user_is_already_on_Wellcome_to_installer_page() throws Throwable {

	}

	@Given("^User is on Create new case page$")
	public void user_is_on_Create_new_case_page() throws Throwable {

	}

	@Given("^User is already on select the type of work page$")
	public void user_is_already_on_select_the_type_of_work_page() throws Throwable {

	}

	@Given("^User is on Enter the stablishment/connection/servis that applies page$")
	public void user_is_on_Enter_the_stablishment_connection_servis_that_applies_page() throws Throwable {

	}


	@Given("^User is already on Changes to measurement and servicing page$")
	public void user_is_already_on_Changes_to_measurement_and_servicing_page() throws Throwable {

	}

	@Given("^User is already on Working on service entrance$")
	public void user_is_already_on_Working_on_service_entrance() throws Throwable {

	}

// =========================sjdhfdkgjedfhödhoägfö
	
	
//	=========================sjdhfdkgjedfhödhoägfö
	@When("^User clicks on \"([^\"]*)\" checkBox$")
	public void user_clicks_on_checkBox(String arg1) throws Throwable {
		if(arg1.equals("changeServiceEntrancePlacement")) {
			Thread.sleep(1000);
			stm.clickCheckBox("changeServiceEntrancePlacement");	
		} else if(arg1.equals("replaceServiceEntrance")) {
			Thread.sleep(1000);
			stm.clickCheckBox("replaceServiceEntrance");	
		} else if(arg1.equals("moveServiceEntrance")) {
			Thread.sleep(1000);
			stm.clickCheckBox("moveServiceEntrance");	
		} else if(arg1.equals("extendOrShortenServiceEntrance")) {
			Thread.sleep(1000);
			stm.clickCheckBox("extendOrShortenServiceEntrance");	
		}
		else if(arg1.equals("selectAllApartments")) {
			Thread.sleep(1000);
			stm.clickCheckBoxWithoutAction("selectAllApartments");	
		}
		
	
	}

	@When("^User chooses all apartments and clicks on \"([^\"]*)\" checkBox$")
	public void user_chooses_all_apartments_and_clicks_on_checkBox(String arg1) throws Throwable {
		if(arg1.equals("selectAllApartments")){
			Thread.sleep(1000);
			stm.clickCheckBoxWithoutAction("selectAllApartments");
		}
	}



	@When("^User enters text in changeServiceEntrancePlacementReason field$")
	public void user_enters_text_in_changeServiceEntrancePlacementReason_field() throws Throwable {
		stm.enterText("På grund av vi har byggt ett extra rum och flyttat köket till andra plats","changeServiceEntrancePlacementReason");
	}

	@When("^User enters text in replaceServiceEntrance field$")
	public void user_enters_text_in_replaceServiceEntrance_field() throws Throwable {
		stm.enterText("Jag ska bara testa för evigt...... ","replaceServiceEntranceReason");
	}

	@When("^User enters text in moveServiceEntrance field$")
	public void user_enters_text_in_moveServiceEntrance_field() throws Throwable {
		stm.enterText("Jag hopppas alla funktioner fungerar superbra...???? ", "moveServiceEntranceReason");
	}

	@When("^User enters text in extendOrShortenServiceEntrance field$")
	public void user_enters_text_in_extendOrShortenServiceEntrance_field() throws Throwable {
		stm.enterText("Test är väldigt kul och jag är envis på att testa hård","extendOrShortenServiceEntranceReason");
	}


	@Given("^User is already on client page$")
	public void user_is_already_on_client_page() throws Throwable {

	}


	@Then("^They should be selected all apartments$")
	public void they_should_be_selected_all_apartments() throws Throwable {

		boolean result = stm.areClickedAllApartmentCheckbox();

		Assert.assertTrue("all appartments can not be selected", result);
	}
//*****
	@When ("^User clicks on \"([^\"]*)\" link$")
	public void user_clicks_on_link(String arg1) throws Throwable {
		if(arg1.contains("1")) {
			Thread.sleep(1000);
			stm.clickChildLinkOfParent("serviceEntranceChangesGroupContent");

		} else if(arg1.contains("2")) {
			Thread.sleep(1000);
			stm.changesToMeasurmentLocation();
			Thread.sleep(1000);
			stm.clickChildLinkOfParent("delSiteGroupContent");

		}


	}

// Radio buttons
	@When("^User clicks on \"([^\"]*)\" radio button$")
	public void user_clicks_on_radio_button(String arg1) throws Throwable {
		if(arg1.equals("brutit plomberingen och")) {
			Thread.sleep(1000);
			stm.clickFunction("radioMeterDetached");
		} else if (arg1.equals("endast brutit plomberingen")) {
			Thread.sleep(1000);
			stm.clickFunction("radioSealBreakOnly");
		}


	}

	@Given("^User is already on Other tasks page$")
	public void user_is_already_on_Other_tasks_page() throws Throwable {

	}



	@When("^User enters invalid date \"([^\"]*)\" connection date field$")
	public void user_enters_invalid_date_connection_date_field(String arg1) throws Throwable {
		Thread.sleep(5000);
		stm.invalid_Date();
	}


	@Given("^User is already on tasks page$")
	public void user_is_already_on_tasks_page() throws Throwable {

	}

	@When("^User enters in connenction date field$")
	public void user_enters_in_connenction_date_field() throws Throwable {
		stm.clearTextField();
	}



	@When("^User enters valid date \"([^\"]*)\"$")
	public void user_enters_valid_date(String arg1) throws Throwable {
		stm.enter_Desire_Engagement_Date();
	}





	@When("^User \"([^\"]*)\" invalid \"([^\"]*)\"$")
	public void user_invalid(String arg1, String arg2) throws Throwable {
		System.out.println(arg1 + " - " + arg2);
		if(arg1.equals("removes")) {
			System.out.println("removes function");
			if(arg2.equals("firstname")) {
				System.out.println("firstname removes function");
				stm.clearTextFieldById("contactPersonFirstName");

			} else if(arg2.equals("lastname")) {
				System.out.println("lastname removes function");
				stm.clearTextFieldById("contactPersonLastName");
			}else if(arg2.equals("phonenumber")) {
				System.out.println("phonenumber removes function");
				stm.clearTextFieldById("contactPersonPhoneNumber");
			}
			else if(arg2.equals("email")) {
				System.out.println("email removes function");
				stm.clearTextFieldById("contactPersonEmailAddress");
			}
			
		}else if(arg1.equals("enters")) {	
			System.out.println("enters function");
			
			if(arg2.equals("firstname")) {
				stm.enter_Invalid_Firstname();
			} else if(arg2.equals("lastname")) {
				System.out.println("enter lastname");
				stm.enter_Invalid_Lastname();
			}else if(arg2.equals("phonenumber")) {
				System.out.println("enter phonenumber");
				stm.enter_Invalid_Phone_Number();
				
			}
			else if(arg2.equals("email")) {
				System.out.println("enter email");
				stm.enter_Invalid_Email();
			}
			
		}

	}

	@Then("^It should be displayed \"([^\"]*)\" for \"([^\"]*)\"$")
	public void it_should_be_displayed_error_msg(String expected_error, String arg2) throws Throwable {

//??? Why You have to use this function???
		stm.clickFunction("contactPersonPhoneNumber");

		boolean result = stm.isExistText(expected_error);
		System.out.println("It should be displayed the error message");
		Assert.assertTrue("There should be an error that contain : " + expected_error ,result);

	}


	@When("^User \"([^\"]*)\" valid \"([^\"]*)\"$")
	public void user_valid(String arg1, String arg2) throws Throwable {

		System.out.println("user_valid function");
		if(arg1.equals("removes")) {
			System.out.println("removes");
			if(arg2.equals("firstname")) {
				System.out.println("removes firstname");
			}
			else if(arg2.equals("lastname")) {
				System.out.println("removes lastname");
			}
			else if(arg2.equals("phonenumber")) {
				System.out.println("removes phonenumber");
			}
			else if(arg2.equals("email")) {
				System.out.println("removes email");
			}
			
		}
		else if(arg1.equals("enters")) {		
			System.out.println("enters function");
			if(arg2.equals("firstname")) {
				System.out.println("enters firstname");
				stm.enter_Valid_Firstname();
			} 
			else if(arg2.equals("lastname")) {
				System.out.println("enters lastname");
				stm.enter_Valid_Lastname();
			}
			else if(arg2.equals("phonenumber")) {
				stm.enter_Valid_PhoneNumber();
			}
			else if (arg2.equals("email")) {
				stm.enter_Valid_Email();
			
			}
			else if(arg2.equals("miscInfo")) {
				stm.enter_miscInfo_Text();
			}

		}

	}

	@When("^User \"([^\"]*)\" text \"([^\"]*)\"$")
	public void user_text(String arg1, String arg2) throws Throwable {
		 if(arg1.equals("enters")) {
			 System.out.println("enters function");
			if(arg2.equals("miscInfo")) {
				System.out.println("enter miscInfo");
				stm.enter_miscInfo_Text();
			}
			
		 }	
		 	
			
		}
	
	@When("^User \"([^\"]*)\" case name \"([^\"]*)\"$")
	public void user_case_name(String arg1, String arg2) throws Throwable {
		if(arg1.equals("enters")) {
			 System.out.println("enters function");
			 if(arg2.equals("errandName")) {
					System.out.println("enter errandName");
					stm.enter_Errand_Name();
				}
		}	 
	}
	

	
	@Given("^user is already on Other tasks page$")
	public void user_is_already_on_Other_tasks2_page() throws Throwable {
	  
	}
	
	@Given("^User is already on the case is submited$")
	public void user_is_already_on_the_case_is_submited() throws Throwable {
	 
	}
	
	@When("^user clicks on \"([^\"]*)\" link$")
	public void user_clicks_on_upLoad_link(String arg1) throws Throwable {
		if(arg1.equals("upload file")) {
			System.out.println("upload function");
			stm.clickOn_uploadFile_Link();
		}
	 
	}
	
	
	
	@When("^user upload a file$")
	public void user_upload_a_file() throws Throwable {
	   stm.file_Upload();
	}

	
	@When("^user clicks on \"([^\"]*)\" image$")
	public void user_clicks_on_image(String arg1) throws Throwable {
	    stm.clickOn_file_upload_image();
	}

	@When("^user uploads file$")
	public void user_uploads_file() throws Throwable {
	 stm.file_Upload2();
	}

	@When("^user clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button2(String arg1) throws Throwable {
		if(arg1.equals("Nästa")){
			stm.nextButton();
		}
	}
	
	

	
	@Then("^it should be displayed \"([^\"]*)\" on Review page$")
	public void it_should_be_displayed_on_Review_page(String arg1) throws Throwable {
		// Use this waitForLoad() function when you need validate a new page 
		stm.waitForLoad();
		 System.out.println("Begärda is checked");
		 boolean result = stm.isExistText(arg1);

	Assert.assertTrue("There is no msg", result);
	    
	}

	@Given("^user is on Granska - Befintlig anslutning page$")
	public void user_is_on_Granska_Befintlig_anslutning_page() throws Throwable {
	    
	}

	@Given("^user is already on Granska - Befintlig anslutning$")
	public void user_is_already_on_Granska_Befintlig_anslutning2() throws Throwable {
	   
	}

	@Given("^user is already on Granska - Befintliga anslutning$")
	public void user_is_already_on_Granska_Befintliga_anslutning() throws Throwable {
	   
	}
	
	@Given("^user ias already on Granska-Befintlig anslutning$")
	public void user_ias_already_on_Granska_Befintlig_anslutning() throws Throwable {
	    
	}

	
	@When("^user clicks on confirmCorrectInfo checkBox$")
	public void user_clicks_on_confirmCorrectInfo_checkBox() throws Throwable {
		Thread.sleep(1000);
		stm.clickCheckBoxWithoutAction("confirmCorrectInfo");
	}
	
	@Given("^user is already on Granska-Befintlig anslutning$")
	public void user_is_already_on_Granska_Befintlig_anslutning() throws Throwable {
	    
	}

	@When("^user clicks on Skicka button$")
	public void user_clicks_on_Skicka_button() throws Throwable {
		Thread.sleep(1000);
		stm.submit_button();
	}
	
	@Then("^it should be displayed \"([^\"]*)\" on submited page$")
	public void it_should_be_displayed_on_submited_page(String arg1) throws Throwable {
		stm.waitForLoad();
		 System.out.println("Ärendet är skickat");
		 boolean result = stm.isExistText(arg1);

	Assert.assertTrue("There is no msg", result);
	}

	
	@When("^User clicks on \"([^\"]*)\" buttonLink$")
	public void user_clicks_on_buttonLink(String arg1) throws Throwable {
	 if(arg1.equals("Skapa ärende")) {
			System.out.println("clickLink skapa ärende");	
			stm.create_Case_Button_link();
				
		}
	}

	@Given("^User is already on Skapa ärende$")
	public void user_is_already_on_Skapa_ärende() throws Throwable {
	    
	}
	
	@Given("^user is already on Välj typ av arbete på befintlig anslutning$")
	public void user_is_already_on_Välj_typ_av_arbete_på_befintlig_anslutning() throws Throwable {
	    
	}
	
	@Given("^User is already on Välj typ av arbete på befintlig anslutning$")
	public void user_is_already_on_Välj_typ_av_arbete_på_befintlig_anslutning2() throws Throwable {
	  
	}
	
	@Given("^User is already on Ange den anläggning$")
	public void user_is_already_on_Ange_den_anläggning() throws Throwable {
	 
	}


	
	@When("^User enters address in the address field and clicks on the menu list$")
	public void user_enters_address_in_the_address_field_and_clicks_on_the_menu_list() throws Throwable {
		stm.enterEstablishmentOrServiceTest();
		stm.searchAddressInMenu("/html[1]/body[1]/ul[1]/li[1]", "Storgatan 12 Stockholm");
	}


	
	@When("^User selectes a partment$")
	public void user_selectes_a_partment() throws Throwable {
	   stm.chooseApartment();
	}
	
	@Given("^User is already on select the type work page$")
	public void user_is_already_on_select_the_type_work_page() throws Throwable {
	    
	}

	@Then("^It should ve displayed \"([^\"]*)\" on \"([^\"]*)\" page$")
	public void it_should_ve_displayed_on_page(String arg1, String arg2) throws Throwable {
		boolean result = false;
		if(arg2.equals("changes to fuse size")) {
			result = stm.isExistText(arg1);

		}
		Assert.assertTrue("There is no msg", result);
	}
	
	@When("^User clicks \"([^\"]*)\" button$")
	public void user_clicks_button(String arg1) throws Throwable {
		 if(arg1.equals("Ändring servissäkring")) {
			System.out.println("function Ändra servissäkring");
			stm.click_On_ChangeFuseServicing();
		}
	}
	
	@When("^User chooses Ange befintlig servissäkring and clicks the drop-down list$")
	public void user_chooses_Ange_befintlig_servissäkring_and_clicks_the_drop_down_list() throws Throwable {
	    stm.choose_Existing_fuse_Size();
	}
	
	@When("^User choose Ange ny servissäkring$")
	public void user_choose_Ange_ny_servissäkring() throws Throwable {
	    stm.choose_New_fuse_Size();
	}
	
	
	
	@When("^User \"([^\"]*)\" reason in fuse change reason text fild$")
	public void user_reason_in_fuse_change_reason_text_fild(String arg1) throws Throwable {
	    if(arg1.equals("enters")) {
	    	
	   System.out.println("function enetr");
		stm.enterText("Vi ska bara testa 12348099 Vi ska bara testa 12348099 Vi ska bara testa 12348099 Vi ska bara testa 12348099 Vi ska bara testa 12348099 Vi ska bara testa 12348099", "powerConfigReason");
	    }
	}
	
	@When("^User clicks \"([^\"]*)\" radiobutton$")
	public void user_clicks_radiobutton(String arg1) throws Throwable {
		if(arg1.equals("Privatperson")) {
			Thread.sleep(1000);
			stm.clickFunction("radioIsPrivateOrdering");
		} else if (arg1.equals("Företag")) {
			Thread.sleep(1000);
			stm.clickFunction("radioIsCompanyOrdering");
		}
	}
		
	
	@When("^User \"([^\"]*)\" invalid person number in Personnummer field$")
	public void user_invalid_person_number_in_Personnummer_field(String arg1) throws Throwable {
		if(arg1.equals("enters")){
		stm.clickFunction("searchParamOrderingCustomerPerNo");
		stm.enter_invalid_personNumber();
		stm.click_on_Search_image();
		stm.personNumber_error_message();
		stm.clear_invalidPersonNumber();
		
		}
		
	}

	@When("^User \"([^\"]*)\" valid person number in Personnummer field$")
	public void user_valid_person_number_in_Personnummer_field(String arg1) throws Throwable {
	   stm.enter_Valid_personNumber();
	   
	}
	

	
	@When("^User clicks on \"([^\"]*)\" image$")
	public void user_clicks_on_image2(String arg1) throws Throwable {
	   if(arg1.equals("search")) {
		   System.out.println("function searh Image");
		   stm.click_on_Search_image();
	   }
	}

	@Then("^It should be displayed \"([^\"]*)\" page$")
	public void it_should_be_displayed_page(String arg1) throws Throwable {
		
		 System.out.println("function Beställare");
		 boolean result = stm.isExistText(arg1);
		 Assert.assertTrue("There is no msg", result);
		 
	 
	}


	
	@When("^User \"([^\"]*)\" valid email in Beställande kunds e-post$")
	public void user_valid_email_in_Beställande_kunds_e_post(String arg1) throws Throwable {
	    if(arg1.equals("enters")) {
	    	System.out.println("function valid orderingCustomer email");
	    	stm.enter_valid_orderingCustomer_email();
	    	
	    }
	}
	
	@When("^User \"([^\"]*)\" invalid phonenumber in Beställande kunds telefonnummer$")
	public void user_invalid_phonenumber_in_Beställande_kunds_telefonnummer(String arg1) throws Throwable {
	    if(arg1.equals("enters")) {
	    	System.out.println("function invalid orderingCustomer phonenumber");
	    	stm.enter_invalid_orderingCustomer_phoneNumber();
	    	stm.phoneNumber_error_message();
	    	stm.clear_invalid_orderingCustome_phoneNr();
	  	
	    	
	    }
	}
	
	
	@Given("^User is already is on client page$")
	public void user_is_already_is_on_client_page() throws Throwable {
	   
	}

	@When("^User \"([^\"]*)\" valid phone number in Beställande kunds telefonnumer$")
	public void user_valid_phone_number_in_Beställande_kunds_telefonnumer(String arg1) throws Throwable {
	   stm.enter_valid_orderingCustomer_phoneNr();
	}

	
	@Given("^The checkBox is already diplayed as checked$")
	public void the_checkBox_is_already_diplayed_as_checked() throws Throwable {
	 
	}

	
	@When("^User move the mouse over i image$")
	public void user_move_the_mouse_over_i_image() throws Throwable {
		Thread.sleep(2000);
		stm.mouse_Hover();
	}
	
	@When("^User unchecks checkBox$")
	public void user_unchecks_checkBox() throws Throwable {
		Thread.sleep(2000);
		stm.uncheck_Or_check_checkBox();
	}
	
	@When("^User click on \"([^\"]*)\" checkBox$")
	public void user_click_on_checkBox(String arg1) throws Throwable {
		Thread.sleep(2000);
		stm.uncheck_Or_check_checkBox();
		
	}

	@When("^User move the mouse over the i image$")
	public void user_move_the_mouse_over_the_i_image() throws Throwable {
		System.out.println("Mouse Hover control");
	    stm.mouse_Hover2();
	}
	
	
	@When("^User clicks on  \"([^\"]*)\" checkBox$")
	public void user_clicks_on_check_Box(String arg1) throws Throwable {
	    if(arg1.equals("Skicka uppdateringar till beställaren")) {
	    	System.out.println("function click on checkBox");
		stm.click_On_checkBox();
	    }
	}
	
	@Given("^The checkBox is already displayed as checked$")
	public void the_checkBox_is_already_displayed_as_checked() throws Throwable {
	   
	}

	@When("^user clicks on \"([^\"]*)\" checkBox$")
	public void user_clicks_on_checkBox2(String arg1) throws Throwable {
		if(arg1.equals("Via e-post")) {
			System.out.println("function checkBox Via-e-post");
			 stm.click_On_Via_Epost_checkBox();
			
		}
	}
		
	@When("^User clicks on the \"([^\"]*)\" checkBox$")
		public void user_clicks_on_the_checkBox(String arg1) throws Throwable {
			if(arg1.equals("function SMS checkBox")) {
				
				stm.click_On_SMS_checkBox();
			}
		  
		}

	@When("^User moves the mouse over the \"([^\"]*)\" image$")
	public void user_moves_the_mouse_over_the_image(String arg1) throws Throwable {
		if(arg1.equals("i")) {
			System.out.println("function Mouse hover Attention");
			 stm.mouse_Hover_attention();
		}	  
	}
		
	@When("^User enters name in text field$")
	public void user_enters_name_in_text_field() throws Throwable {
	    stm.Enter_name();
	}
	
	@When("^User enters marking in text field$")
	public void user_enters_marking_in_text_field() throws Throwable {
	   stm.Enter_marking();
	}
	

	@When("^User ckicks on \"([^\"]*)\" checkBox$")
	public void user_ckicks_on_checkBox(String arg1) throws Throwable {
		stm.click_On_OtherAdress();
	}

	@When("^User enters address in text field$")
	public void user_enters_address_in_text_field() throws Throwable {
		stm.enter_Adress();
	}

	@When("^User enters street number$")
	public void user_enters_street_number() throws Throwable {
		stm.enter_StreetNr();
	}

	@When("^User enters ZIP code in text field$")
	public void user_enters_ZIP_code_in_text_field() throws Throwable {
		stm.enter_ZIP_Code();
	}

	@When("^User enters City in text fieldin text field$")
	public void user_enters_City_in_text_fieldin_text_field() throws Throwable {
		stm.enter_City();
	}

	@When("^user clicks on \"([^\"]*)\" buton$")
	public void user_clicks_on_buton(String arg1) throws Throwable {
		stm.clickOn_saveDraft_button();
	}



	@Given("^user is already on Gransaka-Befintlig anslutning$")
	public void user_is_already_on_Gransaka_Befintlig_anslutning() throws Throwable {
    
	}

	@When("^user clicks on OK button$")
	public void user_clicks_on_OK_button() throws Throwable {
		stm.clickOn_OK_button();
	}


	@When("^user clicks on Jag intygar checkBox$")
	public void user_clicks_on_Jag_intygar_checkBox() throws Throwable {
		stm.clickOn_confirmCorrectInfo_checkBox();
	}



	@Given("^user is already on Granska-Befinlig anslutning$")
	public void user_is_already_on_Granska_Befinlig_anslutning() throws Throwable {
   
	}

	@When("^user clicks on Skicka for secoud button$")
	public void user_clicks_on_Skicka_for_secoud_button() throws Throwable {
		stm.clickOn_Send_button();
	}


	}






