package com.hrms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utility.WaitElement;

public class LoginPage {

	WebDriver driver;
	WaitElement Wait;

	//@FindBy(css = "input[placeholder='Email Address']")
	//WebElement emailAddrsForgPaswrd;

	//@FindBy(css = ".btn.btn-sendcode")
	//WebElement sendOTPfrgpswd;

	//@FindBy(xpath = "//input[@placeholder='Drop your OTP here']")
	//WebElement dropOTPhrfrgtpsw;

	//@FindBy(css = ".btn.btn-submitcode")
	//WebElement sbmtOTP;

	//@FindBy(css = ".btn.btn-canclecode")
	//WebElement cancelfrgtpswd;

	//@FindBy(css = "input[placeholder='New Password']")
	//WebElement nwpswdchgpwd;

	//@FindBy(css = "input[placeholder='Confirm password']")
	//WebElement cnfpswdchgpwd;

	//@FindBy(css = ".btn.btn-submitcodee")
	//WebElement finalSubmit;
	
	@FindBy(id = "email")
    WebElement txtEmailAddress;

    @FindBy(id = "loginPaswd")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

	@FindBy(css = ".toggle-password")
	WebElement PaswrdEye;

	@FindBy(css = ".forgot-link")
	WebElement forgotPassword;


	public LoginPage(WebDriver driver) {
		
	        this.driver = driver;
	        //PageFactory.initElements(driver, this);
	    }

	public void chkForgtPasswrdlink() {
		forgotPassword.click();
	}

	public DashboardPage loginDone(String uname, String pass) throws InterruptedException {
		Thread.sleep(6000);
		WaitElement.waitTill(1000);
		txtEmailAddress.sendKeys(uname);
		WaitElement.waitTill(1000);
		txtPassword.sendKeys(pass);
		WaitElement.waitTill(1000);
		PaswrdEye.click();
		WaitElement.waitTill(1000);
		btnLogin.click();
		WaitElement.waitTill(1000);
		return PageFactory.initElements(driver, DashboardPage.class);
	}
	
	/*public void cancelbtnfrgtpswdchk() {
		forgotPassword.click();
		WaitElement.waitTill(1000);
		cancelfrgtpswd.click();
		WaitElement.waitTill(1000);
	}

	public void forgotPasswordlinkChkfunc(String emailAddrsForPaswrd, String enterOTP, String nwpsrwdfrgtpsw,
			String confmpaswdfrgtpsrd) {
		forgotPassword.click();
		WaitElement.waitTill(1000);
		emailAddrsForgPaswrd.click();
		emailAddrsForgPaswrd.sendKeys(emailAddrsForPaswrd);
		sendOTPfrgpswd.click();
		WaitElement.waitTill(1000);
		dropOTPhrfrgtpsw.click();
		WaitElement.waitTill(25000);
		dropOTPhrfrgtpsw.sendKeys(enterOTP);
		WaitElement.waitTill(1000);
		sbmtOTP.click();
		nwpswdchgpwd.click();
		WaitElement.waitTill(1000);
		nwpswdchgpwd.sendKeys(confmpaswdfrgtpsrd);
		WaitElement.waitTill(1000);
		cnfpswdchgpwd.click();
		WaitElement.waitTill(1000);
		cnfpswdchgpwd.sendKeys(confmpaswdfrgtpsrd);
		WaitElement.waitTill(1000);
		finalSubmit.click();
		WaitElement.waitTill(1000);
	}*/
	
	// ========================================================================================================


	/* Verifying ForgotPassword Link*/
	public boolean verifyforgotPasswordlnk() {
		String expURL = "https://glocal-hrms-94502.web.app/forgot-pswd";
		String actURL = driver.getCurrentUrl();
		if (expURL.equalsIgnoreCase(actURL)) {
			return true;
		} else {
			return false;
		}
	}
	
	/* Verifying valid login */
	public boolean verifyValidLogin() {
		String expURL = "https://glocal-hrms-94502.web.app/dashboard";
		String actURL = driver.getCurrentUrl();

		if (expURL.equalsIgnoreCase(actURL)) {
			return true;
		} else {
			return false;
		}
	}

	/* Verifying invalid login */
	public boolean verifyInValidLogin() {
		String expURL = "https://glocal-hrms-94502.web.app/dashboard";
		String actURL = driver.getCurrentUrl();

		if (expURL.equalsIgnoreCase(actURL)) {
			return true;
		} else {
			return false;
		}
	}

	
	/* Verifying ForgotPassword cancel button*/
	/*public boolean verifyforgotPasswordcancelbtnchk() {
		String expURL = "https://glocal-hrms-94502.web.app/login";
		String actURL = driver.getCurrentUrl();
		if (expURL.equalsIgnoreCase(actURL)) {
			return true;
		} else {
			return false;
		}
	}*/

	/* Verifying ForgotPassword functionality */
	/*public boolean verifyforgotPasswordfunctonaty() {
		String expURL = "https://glocal-hrms-94502.web.app/login";
		String actURL = driver.getCurrentUrl();

		if (expURL != (actURL)) {
			return true;
		} else {
			return false;
		}
	}*/

	

}
