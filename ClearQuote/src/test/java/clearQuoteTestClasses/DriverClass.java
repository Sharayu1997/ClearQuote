package clearQuoteTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverClass {

	public static WebDriver driver;

	public DriverClass() {

	}

	public void launchBrowser(String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("Chrome")) {
			// ChromeOptions co= new ChromeOptions();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize(); // method chaining to browser maximize
		driver.get("https://cq-uat.web.app/");
		Thread.sleep(3000);
	}
}
