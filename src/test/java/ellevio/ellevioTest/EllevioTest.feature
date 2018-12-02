@tag
Feature: Loggin
  I want to test the Ellevio Login page

  @tag1
  Scenario: As a user I want to test the Login page
    Given I am on the Ellevio Login page
    When I enter "rosie.rahmati@alten.se" and "Lyckani2012" in the username field and password field
    And User clicks on "Logga in" button
    Then It should be displayed "Välkommen till installatörswebben" on "welcome" page

  @tag2
  Scenario: As a user I want to enter stablishment or connecting or service
    Given User is already on Wellcome to installer page
    When User clicks on "A new case" button
    Then It should be displayed "Skapa nytt ärende" on "a new case" page

  @tag3
  Scenario: User avilable to changings to establishments or servicing
    Given User is on Create new case page
    When User clicks on "Existing connection" button
    Then It should be displayed "Välj typ av arbete på befintlig anslutning" on "select type of work" page

  @tag4
  Scenario: Select the type of work on existing connection
    Given User is already on select the type of work page
    When User clicks on "changes to establishments or service" button
    Then It should be displayed "Ange den anläggning/anslutning/servis det gäller" on "Enter the stablishment/" page

  @tag5
  Scenario: To enter stablishment or connectin or servis
    Given User is on Enter the stablishment/connection/servis that applies page
    When User enters address in the search address field and clicks on "address in the menu list"
    And User chooses apartment
    And User clicks on "Nästa" button
    Then It should be displayed "Ändringar på mätplats och servis" on "changes to fuse size" page

  @tag6
  Scenario: Changes to measurement and servicing
    Given User is already on Changes to measurement and servicing page
    When User clicks on "Ändringar på mätplats (T.ex byte av mätarsäkring, flytt av mätartavla(flerfamiljhus), anmärkning av" button
    And User chooses stablishments ID and clicks on fuseBox in the FuseBox drop-down list
    Then It pops up the window "Kommer inkommande kabel från gatan (servisledningen) att beröras av ändringen? Ja , Nej"
    And User clicks on "Ja" button

  @tag7
  Scenario: Working on service entrance
    Given User is already on Working on service entrance
    When User clicks on "changeServiceEntrancePlacement" checkBox
    And User enters text in changeServiceEntrancePlacementReason field
    And User clicks on "replaceServiceEntrance" checkBox
    And User enters text in replaceServiceEntrance field
    And User clicks on "moveServiceEntrance" checkBox
    And User enters text in moveServiceEntrance field
    And User clicks on "extendOrShortenServiceEntrance" checkBox
    And User enters text in extendOrShortenServiceEntrance field
    And User clicks on "Nästa" button
    Then It should be displayed "Beställare" on "client" page

  @tag8
  Scenario: To enter stablishment or connection or servis
    Given User is already on client page
    When User clicks on "Tillbaka" button
    Then It should be displayed "Ändringar på mätplats och servis" on "changes to fuse size" page

  @tag9
  Scenario: To enter stablishment or connectin or servis
    Given User is already on Changes to measurement and servicing page
    When User clicks on "Tillbaka" button
    Then It should be displayed "Ange den anläggning/anslutning/servis det gäller" on "Enter the stablishment/" page

  @tag10
  Scenario: To enter stablishment or connection or servis
    Given User is on Enter the stablishment/connection/servis that applies page
    When User clicks on "selectAllApartments" checkBox
    And They should be selected all apartments
    And User enters address in the search address field and clicks
    And User clicks on "Nästa" button
    And User clicks on "1st Rensa ändringar" link
    And User clicks on "2nd Rensa ändringar" link

  @tag11
  Scenario: To report plomb breaking
    Given User is already on Changes to measurement and servicing page
    When User clicks on "Anmäl plombbrytning" button
    And User clicks on "brutit plomberingen och" radio button
    And User clicks on "endast brutit plomberingen" radio button
    And User clicks on "Nästa" button
    Then It should be displayed "Övriga uppgifter" on "other tasks" page

  @tag12
  Scenario: Invalid date for Other tasks
    Given User is already on Other tasks page
    When User enters invalid date "2018-10-30" connection date field

  @tag13
  Scenario: Clear Textfield
    Given User is already on tasks page
    When User enters in connenction date field

  @tag14
  Scenario: Valid date for Other tasks
    Given User is already on Other tasks page
    When User enters valid date "2018-12-10"

  @tag15
  Scenario: Enter Invalid firstname
    Given User is already on Other tasks page
    When User "enters" invalid "firstname"
    Then It should be displayed "Felaktigt format för inmatat värde" for "firstname"

  @tag16
  Scenario: Remove invalid firstname
    Given User is already on Other tasks page
    When User "removes" invalid "firstname"

  @tag17
  Scenario: Enter valid firstname
    Given User is already on Other tasks page
    When User "enters" valid "firstname"

  @tag18
  Scenario: Enter invalid lastname
    Given User is already on Other tasks page
    When User "enters" invalid "lastname"
    Then It should be displayed "Felaktigt format för inmatat värde" for "lastname"

  @tag19
  Scenario: Remove invalid lastname
    Given User is already on Other tasks page
    When User "removes" invalid "lastname"

  @tag20
  Scenario: Enter valid lastname
    Given User is already on Other tasks page
    When User "enters" valid "lastname"

  @tag21
  Scenario: Enter invalid phonenumber
    Given	 User is already on Other tasks page

    When User "enters" invalid "phonenumber"
    Then It should be displayed "Mobiltelefonnummer måste börja med 0 eller +. Skall i övrigt enbart innehålla siffror." for "phonenumber"

  @tag22
  Scenario: Remove invalid phonenumber
    Given	 User is already on Other tasks page

    When User "removes" invalid "phonenumber"

  @tag23
  Scenario: Enter valid phonenumber
    Given User is already on Other tasks page
    When User "enters" valid "phonenumber"

  @tag24
  Scenario: Enter invalid email
    Given	 User is already on Other tasks page

    When User "enters" invalid "email"
    Then It should be displayed "Felaktigt format för inmatat värde" for "email"

  @tag25
  Scenario: Remove invalid email
    Given User is already on Other tasks page
    When User "removes" invalid "email"

  @tag26
  Scenario: Enter valid email
    Given User is already on Other tasks page
    When User "enters" valid "email"

  @tag27
  Scenario: Enter miscellneous information
    Given User is already on Other tasks page
    When User "enters" text "miscInfo"

  @tag28
  Scenario: Enter name to your case
    Given User is already on Other tasks page
    When User "enters" case name "errandName"

  @tag29
  Scenario: To file uploading
    Given user is already on Other tasks page
    When user clicks on "upload file" link
    And user upload a file

  @tag30
  Scenario: clicking on image file uploading
    Given	 user is already on Other tasks page

    When user clicks on "upload file" image
    And user uploads file
    And user clicks on "Nästa" button
    Then it should be displayed "Begärda ändringar" on Review page

  @tag31
  Scenario: Confirm correct information
    Given user ias already on Granska-Befintlig anslutning
    When user clicks on confirmCorrectInfo checkBox

  @tag32
  Scenario: Sending of the case
    Given user is already on Granska-Befintlig anslutning
    When user clicks on Skicka button
    Then it should be displayed "Ärendet är skickat" on submited page

  @tag33
  Scenario: To create new case
    Given User is already on the case is submited
    When User clicks on "Skapa ärende" buttonLink

  @tag34
  Scenario: Befintlig anslutning
    Given User is already on Skapa ärende
    When User clicks on "Existing connection" button

  @tag35
  Scenario: Ändringar på anläggning/servis
    Given User is already on Välj typ av arbete på befintlig anslutning
    When User clicks on "changes to establishments or service" button

  @tag36
  Scenario: Search address
    Given User is already on Ange den anläggning
    When User enters address in the address field and clicks on the menu list
    And User selectes a partment
    And User clicks on "Nästa" button

  @tag37
  Scenario: Changes to measurement and servicing
    Given User is already on Changes to measurement and servicing page
    When User clicks on "Ändringar på mätplats (T.ex byte av mätarsäkring, flytt av mätartavla(flerfamiljhus), anmärkning av" button
    And User chooses stablishments ID and clicks on fuseBox in the FuseBox drop-down list
    Then It pops up the window "Kommer inkommande kabel från gatan (servisledningen) att beröras av ändringen? Ja , Nej"
    And User clicks on "Ja" button

  @tag38
  Scenario: Working on service entrance
    Given User is already on Working on service entrance
    When User clicks on "changeServiceEntrancePlacement" checkBox
    And User enters text in changeServiceEntrancePlacementReason field
    And User clicks on "replaceServiceEntrance" checkBox
    And User enters text in replaceServiceEntrance field
    And User clicks on "moveServiceEntrance" checkBox
    And User enters text in moveServiceEntrance field
    And User clicks on "extendOrShortenServiceEntrance" checkBox
    And User enters text in extendOrShortenServiceEntrance field

  @tag39
  Scenario: Changing of fuse size
    Given User is already on Changes to measurement and servicing page
    When User clicks "Ändring servissäkring" button
    And User chooses Ange befintlig servissäkring and clicks the drop-down list
    And User choose Ange ny servissäkring
    And User "enters" reason in fuse change reason text fild
    And User clicks on "Nästa" button

  @tag40
  Scenario: Chooseing of clients type
    Given User is already on client page
    When User clicks "Företag" radiobutton
    And User clicks "Privatperson" radiobutton

  @tag41
  Scenario: Invalid  person number
    Given User is already on client page
    When User "enters" invalid person number in Personnummer field
    And User clicks on "search" image

  @tag42
  Scenario: Valid person number
    Given	 User is already on client page

    When User "enters" valid person number in Personnummer field
    And User clicks on "search" image

  @tag43
  Scenario: Vaild customer email
    Given User is already on client page
    When User "enters" valid email in Beställande kunds e-post

  @tag44
  Scenario: Invalid ordering customer phone number
    Given User is already on client page
    When User "enters" invalid phonenumber in Beställande kunds telefonnummer

  @tag45
  Scenario: Valid ordering customer phone number
    Given User is already is on client page
    When User "enters" valid phone number in Beställande kunds telefonnumer

  @tag46
  Scenario: Mouse hover
    Given User is already on client page
    When User move the mouse over i image

  @tag47
  Scenario: Uncheck the checkBox
    Given User is already on client page
    And The checkBox is already displayed as checked
    When User unchecks checkBox
    And User click on "Digital offert" checkBox
    And User move the mouse over the i image
    And User clicks on  "Skicka uppdateringar till beställaren" checkBox

  @tag48
  Scenario: Sending of updating to the orderer by email
    Given User is already on client page
    When user clicks on "Via e-post" checkBox

  @tag49
  Scenario: Sending of updating to the orderer by SMS
    Given User is already on client page
    When User clicks on the "Via SMS" checkBox

  @tag50
  Scenario: Attention
    Given User is already on client page
    When User moves the mouse over the "i" image

  @tag51
  Scenario: Enter name in text field
    Given User is already on client page
    When User enters name in text field
    And User enters marking in text field

  @tag52
  Scenario: Invoice address
    Given User is already on client page
    When User ckicks on "Annan adress" checkBox
    And User enters address in text field
    And User enters street number
    And User enters ZIP code in text field
    And User enters City in text fieldin text field
    And User clicks on "Nästa" button

  @tag53
  Scenario: Invalid date for Other tasks
    Given User is already on Other tasks page
    When User enters invalid date "2018-10-30" connection date field
    And User enters in connenction date field
    And User enters valid date "2018-12-10"
    And User "enters" invalid "firstname"
    Then It should be displayed "Felaktigt format för inmatat värde" for "firstname"

  @tag54
  Scenario: Remove invalid firstname
    Given User is already on Other tasks page
    When User "removes" invalid "firstname"

  @tag55
  Scenario: Enter valid firstname
    Given User is already on Other tasks page
    When User "enters" valid "firstname"

  @tag56
  Scenario: Enter invalid lastname
    Given User is already on Other tasks page
    When User "enters" invalid "lastname"
    Then It should be displayed "Felaktigt format för inmatat värde" for "lastname"

  @tag57
  Scenario: Remove invalid lastname
    Given User is already on Other tasks page
    When User "removes" invalid "lastname"

  @tag58
  Scenario: Enter valid lastname
    Given User is already on Other tasks page
    When User "enters" valid "lastname"

  @tag59
  Scenario: Enter invalid phonenumber
    Given	 User is already on Other tasks page

    When User "enters" invalid "phonenumber"
    Then It should be displayed "Mobiltelefonnummer måste börja med 0 eller +. Skall i övrigt enbart innehålla siffror." for "phonenumber"

  @tag60
  Scenario: Remove invalid phonenumber
    Given	 User is already on Other tasks page

    When User "removes" invalid "phonenumber"

  @tag61
  Scenario: Enter valid phonenumber
    Given User is already on Other tasks page
    When User "enters" valid "phonenumber"

  @tag62
  Scenario: Enter invalid email
    Given	 User is already on Other tasks page

    When User "enters" invalid "email"
    Then It should be displayed "Felaktigt format för inmatat värde" for "email"

  @tag63
  Scenario: Remove invalid email
    Given User is already on Other tasks page
    When User "removes" invalid "email"

  @tag64
  Scenario: Enter valid email
    Given User is already on Other tasks page
    When User "enters" valid "email"

  @tag65
  Scenario: Enter miscellneous information
    Given User is already on Other tasks page
    When User "enters" text "miscInfo"

  @tag66
  Scenario: Enter name to your case
    Given User is already on Other tasks page
    When User "enters" case name "errandName"

  @tag67
  Scenario: To file uploading
    Given user is already on Other tasks page
    When user clicks on "upload file" link
    And user upload a file

  @tag68
  Scenario: clicking on image file uploading
    Given user is already on Other tasks page
    When user clicks on "upload file" image
    And user uploads file
    And user clicks on "Nästa" buton
    Then it should be displayed "Begärda ändringar" on Review page

  @tag69
  Scenario: Save draft
    Given user is already on Granska-Befintlig anslutning
    When user clicks on "Spara utkast" button
    And user clicks on OK button
    And user clicks on "Nästa" button

  @tag70
  Scenario: Sending of the case
    Given user is already on Granska-Befintlig anslutning
    When user clicks on Jag intygar checkBox

  @tag71
  Scenario: Send the another case
    Given user is already on Granska-Befintlig anslutning
    When user clicks on Skicka for secoud button
