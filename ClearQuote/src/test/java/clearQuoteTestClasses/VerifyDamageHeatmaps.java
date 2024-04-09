package clearQuoteTestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import clearQuote.InputdetailsPage;
import clearQuote.LoginPage;
import clearQuote.HomePage;

public class VerifyDamageHeatmaps extends DriverClass {

	InputdetailsPage detailsPage;
	HomePage homePage;
	LoginPage loginPage;

	@BeforeClass
	public void openBrowser() throws InterruptedException {
		launchBrowser("Chrome");
		detailsPage = new InputdetailsPage(driver);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}

	@Test
	public void VerifyDamageHeatmapsByImageUpload() throws InterruptedException {

		// Login to application using Username & Password

		loginPage.sendUsername("user01");

		loginPage.sendPassword("0987");

		loginPage.clickOnLoginButton();

		TimeUnit.SECONDS.sleep(3);
		
		// Verify the title of page
		String expectedTitle = "ClearQuote";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, " Title should be > ClearQuote ");

		// Verify the Home header from home page
//		String expctedHeader = "Home";
//		String actualHeader = homePage.homeHeader();
//		Assert.assertEquals(actualHeader, expctedHeader, "Home title should be displayed on home page > Home");

		// Click on MenuBar
		HomePage.clickOnMenuBar();

		// Click on Input option
		HomePage.clickOnInputOption();

		TimeUnit.SECONDS.sleep(3);

		// Send the Information to fill the vehicle/Customer details form
		InputdetailsPage.sendLicencePlateNo("MH01DD7439");

		InputdetailsPage.selectModel();

		TimeUnit.SECONDS.sleep(2);
		InputdetailsPage.sendName("Sharayu Jewade");

		InputdetailsPage.sendEmail("sharayujewade@gmail.com");

		InputdetailsPage.sendContact("9860550281");

		// Click on create quote button
		InputdetailsPage.clickOnCreateQuoteButton();
		
		TimeUnit.SECONDS.sleep(3);

		// Upload car image
//		InputdetailsPage.sendImages();

		// Verify the text from Damage Heatmap final details page
//		String expctedText = "Damage Heatmap";
//		String actualText = detailsPage.verifyDamageHeatmapText();
//		Assert.assertEquals(actualText, expctedText, "Damage Heatmap Text should be displayed > Damage Heatmap");

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
