package clearQuote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	@FindBy(xpath = "//label[text()=' Home']")
	private static WebElement homeHeader;

	@FindBy(xpath = "//a[@class='sidebar-toggle noPrint ng-star-inserted']")
	private static WebElement menuBar;

	@FindBy(xpath = "//span[text()='Input']")
	private static WebElement inputOption;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	public static String homeHeader() {
//		return homeHeader.getText();
//	}

	public static void clickOnMenuBar() {
		menuBar.click();
	}

	public static void clickOnInputOption() {
		inputOption.click();
	}

}
