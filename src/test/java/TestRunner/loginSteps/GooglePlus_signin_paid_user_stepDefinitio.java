package TestRunner.loginSteps;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.FbandGP_Object;
import ObjectRepository.SignupObject;
import TestRunner.SetupClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webApp.PerformAction;

public class GooglePlus_signin_paid_user_stepDefinitio extends SetupClass {
	PerformAction wait = new PerformAction();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Random rad = new Random();

	// Open web site URl
	@Given("^Open home page of the application\\.$")
	public void navigates_to_website_url() throws InterruptedException {
		// Maximize Windows
		driver.get("https://www.slideteam.net");
		Thread.sleep(8000);
		try {
			WebElement app = driver.findElement(SignupObject.close_add);
			app.click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} catch (NoSuchElementException popup) {
		}

		try {
			WebElement logout = driver.findElement(By.cssSelector(".signin-link[title='Sign Out']"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
//				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
	}

	@Then("^user navigate to complete deck from account$")
         public void user_navigate_to_complete_deck_from_account() throws InterruptedException  {
    
	 driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/all-powerpoint-complete-decks.html");
	 Thread.sleep(3000);
	 
	 //WebElement select_product=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > strong:nth-child(1) > span:nth-child(1) > a:nth-child(1)")));
	  //Thread.sleep(2000);   
	 //select_product.click();
	   // Thread.sleep(2000);
	    
            }


	@Then("^Click on downloadbtn test5 link\\.$")
	public void click_on_Download_this_presentation_link() throws InterruptedException {
		WebElement test5 = driver.findElement(SignupObject.Downloaded);
		wait.implictywait(driver);
		test5.click();
		Thread.sleep(2000);
	}

	@Then("^Click on googlePlus link\\.$")
	public void fb_link() throws InterruptedException {
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		WebElement gplus = driver.findElement(FbandGP_Object.GooglePlusLink);
		gplus.click();
		Thread.sleep(2000);
	}

	@Then("^Enter user google email addess\\.$")
	public void enter_user_mail() throws InterruptedException  {
		WebElement gmail = driver.findElement(FbandGP_Object.GPEmail);
		gmail.click();
		wait.implictywait(driver);
		gmail.clear();
		wait.implictywait(driver);
		gmail.sendKeys("selenium_testing@slidetech.in");
		wait.implictywait(driver);
		Thread.sleep(2000);
		
			
		
	}

	@Then("^go to password page\\.$")
	public void enter_user_password() throws InterruptedException  {
	
		WebElement pass_page = driver.findElement(FbandGP_Object.Next_cta);
		wait.implictywait(driver);
		pass_page.click();
		Thread.sleep(5000);

	
	}

	 @Then("^Enter user google pass\\.$")
	public void google_pass() throws InterruptedException {
		 	 WebElement google_pass = driver.findElement(FbandGP_Object.GPpass);
				google_pass.click();
				wait.implictywait(driver);
				google_pass.clear();
				wait.implictywait(driver);
				google_pass.sendKeys("slideteam");
				wait.implictywait(driver);
				Thread.sleep(2000);
			

			
		}
	
	@Then("^Click on next CTA\\.$")
	public void click_on_Login_button() throws Throwable {

		WebElement next = driver.findElement(FbandGP_Object.Next_button);
		wait.implictywait(driver);
		next.click();
		wait.implictywait(driver);
		Thread.sleep(4000);

		try {
			WebElement close = driver.findElement(By.cssSelector(".fancybox-item.fancybox-close"));
			wait.implictywait(driver);
			close.click();
			Thread.sleep(500);
		} catch (NoSuchElementException nonpoptest) {

		}

	}

	@Then("^The Page is redirect to download presenetion link\\.$")
	public void verify_uesr_validation_message_for_Email_Address() throws Throwable {

		try {
			String Email_test = driver.findElement(SignupObject.Downloaded).getText();
			wait.implictywait(driver);
			String Expected_Cta = "Download this presentation";
			Assert.assertEquals(Expected_Cta, Email_test);
			wait.implictywait(driver);
			Thread.sleep(1000);
		} catch (NoSuchElementException er1) {

		} 
	}

}
