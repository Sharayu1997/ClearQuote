package clearQuote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputdetailsPage {
	private WebDriver driver;

	@FindBy(xpath = "(//div[@class='row']//div[@class='ng-star-inserted']//input[@id='regnum'])[1]")
	private static WebElement inputLicencePlateNo;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	private static WebElement model;

	@FindBy(xpath = "//span[text()='Maruti Suzuki DZIRE TOUR DIESEL']")
	private static WebElement modelSelect;

	@FindBy(xpath = "(//input[@placeholder='Name'])[1]")
	private static WebElement inputName;

	@FindBy(xpath = "(//input[@placeholder='Email '])[1]")
	private static WebElement inputEmail;

	@FindBy(xpath = "(//input[@placeholder='Contact phone.'])[1]")
	private static WebElement inputContact;

	@FindBy(xpath = "(//span[text()='Create quote'])[1]")
	private static WebElement buttonCreateQuote;

	@FindBy(xpath = "//span[text()=' Upload ']")
	private static WebElement buttonUpload;

	@FindBy(xpath = "//div[text()=' Damage Heatmap ']")
	private static WebElement textDamageHeatmap;

	public InputdetailsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public static void sendLicencePlateNo(String LicencePlateNo) {

		inputLicencePlateNo.click();
		inputLicencePlateNo.sendKeys(LicencePlateNo);
	}

	public static void selectModel() {

		model.click();
		modelSelect.click();
	}

	public static void sendName(String Name) {

		inputName.sendKeys(Name);
	}

	public static void sendEmail(String Email) {

		inputEmail.sendKeys(Email);
	}

	public static void sendContact(String Contact) {

		inputContact.sendKeys(Contact);
	}

	public static void clickOnCreateQuoteButton() {

		buttonCreateQuote.click();
	}

//	public static void sendImages() {
//		//ButtonUpload.click();
//		buttonUpload.sendKeys("/ClearQuote/Images/CarSraches.jpg");
//	}
//
//	public static String verifyDamageHeatmapText() {
//
//		return textDamageHeatmap.getText();
//	}

}
