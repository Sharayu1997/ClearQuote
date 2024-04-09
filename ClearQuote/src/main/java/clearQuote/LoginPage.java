package clearQuote;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@id='input-email']")
	private static WebElement usernameField;

	@FindBy(xpath = "//input[@id='input-password']")
	private static WebElement passwordField;

	@FindBy(xpath = "//button[text()=' Login ']")
	private static WebElement loginButton;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public static void sendUsername(String username) {

		usernameField.sendKeys(username);
	}

	public static void sendPassword(String password) {

		passwordField.sendKeys(password);
	}

	public static void clickOnLoginButton() {
		loginButton.click();
	}

}
