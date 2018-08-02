package demoqa;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constants.Locators;
import pages.HomePagePAGE;

public class HomePageTest extends TestBase {

	HomePagePAGE hpp = new HomePagePAGE();

	@BeforeClass
	public void navigate() {
		navigateToWantedPage("http://demoqa.com/");
	}

	@Test
	public void navigateToTabs() {
		String currentURL = "http://demoqa.com/tabs/";
		hpp.clickOnDemo();
		hpp.clickOnTabs();
		hpp.clickOnTab3();
		Assert.assertEquals(driver.getCurrentUrl(), currentURL);
	}

	@Test
	public void checkTextforP1() {
		String actualTextP1 = "Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Vestibulum non ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sodales. Quisque eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus.";
		WebElement p1Element = hpp.findElementBySomething(Locators.XPATH, ".//*[@id='tabs-3']/p[1]", true);
		// WebElement p2Element = hpp.findElementBySomething(Locators.XPATH,
		// ".//*[@id='tabs-3']/p[2]", true);
		String text = p1Element.getText();
		Assert.assertEquals(actualTextP1, text);
	}

	@Test
	public void checkTextforP2() {
		String actualTextP2 = "Duis cursus. Maecenas ligula eros, blandit nec, pharetra at, semper at, magna. Nullam ac lacus. Nulla facilisi. Praesent viverra justo vitae neque. Praesent blandit adipiscing velit. Suspendisse potenti. Donec mattis, pede vel pharetra blandit, magna ligula faucibus eros, id euismod lacus dolor eget odio. Nam scelerisque. Donec non libero sed nulla mattis commodo. Ut sagittis. Donec nisi lectus, feugiat porttitor, tempor ac, tempor vitae, pede. Aenean vehicula velit eu tellus interdum rutrum. Maecenas commodo. Pellentesque nec elit. Fusce in lacus. Vivamus a libero vitae lectus hendrerit hendrerit.";
		WebElement p1Element = hpp.findElementBySomething(Locators.XPATH, ".//*[@id='tabs-3']/p[2]", true);
		// WebElement p2Element = hpp.findElementBySomething(Locators.XPATH,
		// ".//*[@id='tabs-3']/p[2]", true);
		String text = p1Element.getText();
		Assert.assertEquals(actualTextP2, text);
	}
}
