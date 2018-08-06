package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class RegistrationPage {
	
		@FindBy(how=How.ID,id="fname")
		WebElement name;

		@FindBy(how=How.ID,id="email")
		WebElement email;

		@FindBy(how=How.XPATH,xpath="//*[@id=\"basicDetailForm\"]/div[3]/div[1]/div/input")
		WebElement password;

		@FindBy(how=How.XPATH,xpath="//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]")
		WebElement mobileNo;

		@FindBy(how=How.XPATH,xpath="//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input")
		WebElement location;

		@FindBy(how=How.XPATH,xpath="//*[@id=\"basicDetailForm\"]/resman-uploader/div/div[1]/span[1]/input")
		WebElement uploadResume;

		@FindBy(how=How.XPATH,xpath="//*[@id=\"basicDetailForm\"]/div[5]/div/div/div[2]/button")
		WebElement registerButton;
		
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/edu-qualification/div/div[1]/div/div/div[1]/ul/li/div/label/input")
		WebElement qualification;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/edu-qualification/div/div[1]/div/div/div[2]/ul/li[4]/div/div/span")
		WebElement selectQualification;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/div/resman-school-twelfth/div[1]/div/div/div/div[1]/ul/li/div/label/input")
		WebElement board;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/div/resman-school-twelfth/div[1]/div/div/div/div[2]/ul/li[2]/div/div/span")
		WebElement selectBoard;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/div/resman-school-twelfth/div[2]/div/div/div/div[1]/ul/li/div/label/input")
		WebElement yearOfPassing;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/div/resman-school-twelfth/div[2]/div/div/div/div[2]/ul/li[2]/div/div/span")
		WebElement selectYearOfPassing;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/div/resman-school-twelfth/div[3]/div/div/div/div[1]/ul/li/div/label/input")
		WebElement medium;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/div/resman-school-twelfth/div[3]/div/div/div/div[2]/ul/li[3]/div/div/span")
		WebElement selectMedium;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/div/resman-school-twelfth/div[4]/div/div/div/div[1]/ul/li/div/label/input")
		WebElement percentage;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/edu-section/section/div/resman-school-twelfth/div[4]/div/div/div/div[2]/ul/li[8]/div/div/span")
		WebElement selectPercentage;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"selSkillCont\"]/div/ul/li/suggestor/div/div/input")
		WebElement skills;	
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"educationDetailForm\"]/div/div/div/button")
		WebElement continueButton;
		
		@FindBy(how=How.XPATH,xpath="//*[@id=\"profileCompleteForm\"]/div[8]/div[2]/a")
		WebElement skipStep;
		

		public RegistrationPage() {
			super();
		}

		public String getName() {
			return this.name.getAttribute("value");
		}

		public void setName(String name) {
			this.name.sendKeys(name);
		}

		public String getEmail() {
			return this.email.getAttribute("value");
		}

		public void setEmail(String email) {
			this.email.sendKeys(email);
		}

		public String getPassword() {
			return this.password.getAttribute("value");
		}

		public void setPassword(String password) {
			this.password.sendKeys(password);
		}

		public String getMobileNo() {
			return this.mobileNo.getAttribute("value");
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo.sendKeys(mobileNo);
		}

		public String getLocation() {
			return this.location.getAttribute("value");
		}

		public void setLocation(String location) {
			this.location.sendKeys(location);
		}

		public String getUploadResume() {
			return this.uploadResume.getAttribute("value");
		}

		public void setUploadResume(String uploadResume) {
			this.uploadResume.sendKeys(uploadResume);
		}

		public void clickSubmitButton() {
			registerButton.click();
		}		
			
		public void clickQualification() {
			qualification.click();
		}
		
		public void clickSelectQualification() {
			selectQualification.click();
		}

	    public void clickBoard() {
	    	board.click();
	    }
	    
	    public void clickSelectBoard() {
	    	selectBoard.click();
	    }
	    
	    public void clickYearOfPassing() {
	    	yearOfPassing.click();
	    }
	    
	    public void clickSelectYearOfPassing() {
	    	selectYearOfPassing.click();
	    }
	    
	    public void clickMedium() {
	    	medium.click();
	    }
	    
	    public void clickSelectMedium() {
	    	selectMedium.click();
	    }
	    
	    public void clickPercentage() {
	    	percentage.click();
	    }
	    
	    public void clickSelectPercentage() {
	    	selectPercentage.click();
	    }

	    public String getSkills() {
			return this.skills.getAttribute("value");
		}

		public void setSkills(String skills) {
			this.skills.sendKeys(skills);
		}

		public void clickContinueButton() {
			continueButton.click();
		}
		
		public void clickSkipStep() {
			skipStep.click();
		}
	}



