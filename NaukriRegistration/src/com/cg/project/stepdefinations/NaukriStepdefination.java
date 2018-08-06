package com.cg.project.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.RegistrationPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NaukriStepdefination {
	
	private WebDriver webDriver;
	private RegistrationPage registrationPage;
	
	@Before(order=1)
	public void setUpStepEnv1() {		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
	}	

@Given("^user want to access 'https://my\\.naukri\\.com/account/createaccount\\?othersrcp=(\\d+)&wExp=N'$")
public void user_want_to_access_https_my_naukri_com_account_createaccount_othersrcp_wExp_N(int arg1) throws Throwable {
	webDriver = new ChromeDriver();
}

@When("^user open google chrome$")
public void user_open_google_chrome() throws Throwable {
	webDriver.get("https://my.naukri.com/account/createaccount");
}

@Then("^display the homepage of 'https://my\\.naukri\\.com/account/register/basicdetails'$")
public void display_the_homepage_of_https_my_naukri_com_account_register_basicdetails() throws Throwable {
	webDriver.findElement(By.xpath("/html/body/div/form/div[1]/div/button")).click();
	registrationPage = new RegistrationPage();
	PageFactory.initElements(webDriver, registrationPage);
    
}

@Then("^user will enter 'Name'$")
public void user_will_enter_Name() throws Throwable {
	registrationPage.setName("Saipriya Narra");
}

@Then("^user will enter 'Email ID'$")
public void user_will_enter_Email_ID() throws Throwable {
	registrationPage.setEmail("saipriya9999@gmail.com");
}

@Then("^user will enter 'Create Password'$")
public void user_will_enter_Create_Password() throws Throwable {
	registrationPage.setPassword("password");
}

@Then("^user will enter 'Mobile number'$")
public void user_will_enter_Mobile_number() throws Throwable {
	registrationPage.setMobileNo("9553358105");
}

@Then("^user will select 'Current location'$")
public void user_will_select_Current_location() throws Throwable {
	registrationPage.setLocation("Hyderabad");
}

@Then("^user will 'Upload Resume'$")
public void user_will_Upload_Resume() throws Throwable {
	registrationPage.setUploadResume("D:\\Users\\nsyadav\\Desktop\\meriresume.pdf");
}

@Then("^user click on 'Register Now'$")
public void user_click_on_Register_Now() throws Throwable {
	registrationPage.clickSubmitButton();
}

@Then("^user should see 'https://my\\.naukri\\.com/account/register/education'$")
public void user_should_see_https_my_naukri_com_account_register_education() throws Throwable {
	String actualTitle = webDriver.getTitle();
	String expectedTitle = "Resume Manager - Post Resume Online - Submit your CV - Naukri.com";
	Assert.assertEquals(expectedTitle, actualTitle);
	Thread.sleep(3000);
	webDriver.navigate().refresh();
}

@Then("^user will choose 'Highest Qualification'$")
public void user_will_choose_Highest_Qualification() throws Throwable {
	registrationPage.clickQualification();
	registrationPage.clickSelectQualification();
}

@Then("^user will choose 'Board'$")
public void user_will_choose_Board() throws Throwable {
	registrationPage.clickBoard();
	registrationPage.clickSelectBoard();
    
}

@Then("^user will choose 'Year of Passing'$")
public void user_will_choose_Year_of_Passing() throws Throwable {
	registrationPage.clickYearOfPassing();
	registrationPage.clickSelectYearOfPassing();
}

@Then("^user will choose 'Medium'$")
public void user_will_choose_Medium() throws Throwable {
	registrationPage.clickMedium();
	registrationPage.clickSelectMedium(); 
}

@Then("^user will choose 'Percentage'$")
public void user_will_choose_Percentage() throws Throwable {
	registrationPage.clickPercentage();
	registrationPage.clickSelectPercentage();
}

@Then("^user will choose 'Skills'$")
public void user_will_choose_Skills() throws Throwable {
	registrationPage.setSkills("PHP");
}

@Then("^user click on 'Continue'$")
public void user_click_on_Continue() throws Throwable {
	registrationPage.clickContinueButton();
}

@Then("^user should see 'https://my\\.naukri\\.com/account/register/profilecompletion'$")
public void user_should_see_https_my_naukri_com_account_register_profilecompletion() throws Throwable {
	String actualTitle = webDriver.getTitle();
	String expectedTitle = "Resume Manager - Post Resume Online - Submit your CV - Naukri.com";
	Assert.assertEquals(expectedTitle, actualTitle);
	Thread.sleep(3000);
	webDriver.navigate().refresh();
}

@Then("^user click on 'Skip this step'$")
public void user_click_on_Skip_this_step() throws Throwable {
	registrationPage.clickSkipStep();
}

@Then("^user should see 'https://www\\.naukri\\.com/free-job-alerts\\?src=DRES'$")
public void user_should_see_https_www_naukri_com_free_job_alerts_src_DRES() throws Throwable {
	String actualTitle = webDriver.getTitle();
	String expectedTitle = "Free Job Alerts, Latest Jobs Alerts & Notification – Naukri.com";
	Assert.assertEquals(expectedTitle, actualTitle);
}



}
