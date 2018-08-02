package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Locators;

public class TestPage {
	private static final constants.Locators UNDIFINED = null;
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public void initializeDriver2() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
	}

	public void navigateToWantedPage(String url) {
		driver.navigate().to(url);
	}

	public void maximizePAGE() {
		driver.manage().window().maximize();
	}

	public WebElement findElementBySomething(Locators locator, String nameOfLocator, boolean selectIfMendatory) {
		WebElement element = null;

		try {
			switch (locator) {

			case CSS:
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(nameOfLocator)));
				element = driver.findElement(By.cssSelector(nameOfLocator));
				break;
			case XPATH:
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(nameOfLocator)));
				element = driver.findElement(By.xpath(nameOfLocator));
				break;
			case ID:
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(nameOfLocator)));
				element = driver.findElement(By.id(nameOfLocator));
				break;
			case NAME:
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(nameOfLocator)));
				element = driver.findElement(By.className(nameOfLocator));
				break;
			case LINK_TEXT:
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText(nameOfLocator)));
				element = driver.findElement(By.linkText(nameOfLocator));
				break;
			case TAG_NAME:
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName(nameOfLocator)));
				element = driver.findElement(By.tagName(nameOfLocator));
				break;
			case CLASS_NAME:
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(nameOfLocator)));
				element = driver.findElement(By.className(nameOfLocator));
				break;
			default:
				locator = UNDIFINED;
				break;
			}
		} catch (NoSuchElementException e) {
			if (selectIfMendatory == true) {
				e.printStackTrace();
				System.exit(1);
			} else {
				e.getMessage();
			}
		}
		return element;

	}
	public void clickIt(Locators locator, String nameOfLocator, boolean mendatory) {
		findElementBySomething(locator, nameOfLocator, mendatory).click();
	}

	public void closeWholeProcess() {
		driver.close();
		if (driver != null) {
			driver.quit();
		}
	}
}
