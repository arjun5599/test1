package test;

import java.util.Random;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

//import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import object.HomePageObject;
import object.dressPageObject;
//import com.app.pages.BasePage;

public class HomePageTest {

	HomePageObject homePage;

	dressPageObject dp;
	
	int random=new Random().nextInt(500000);
	String email="arjun.ivin"+random+"@gmail.com";

	public HomePageTest() {
		homePage = new HomePageObject();

		dp = new dressPageObject();
	}
	
	
	

	@Test
	public void verifyTabText() {

		Assert.assertTrue(homePage.elementFound(homePage.getwords()));
	}

	@Test
	public void verifyText() {
		Assert.assertTrue(homePage.getwomen().isDisplayed());
	}

	@Test
	public void verifyclick() {
		// String value=homePage.getText();
		homePage.clickbutton();
		Assert.assertTrue(homePage.getname().contains("WOMEN"), "FAILED");
	}

	@Test(priority=1)
	public void tweetcheck() {
		homePage.clickbutton();
		dp.womenbutton();

		Assert.assertTrue(dp.gettweetbutton().isDisplayed());
	}
	
	@Test
	public void verifymailcheck() {
		homePage.setNewsLetter(email);
	
		String result=homePage.getmsg();
		Assert.assertTrue(result.contains("successfully"),"failed");
		
	}
	@AfterTest
	public void close() {
		homePage.quitDriver();
	}
	
}
