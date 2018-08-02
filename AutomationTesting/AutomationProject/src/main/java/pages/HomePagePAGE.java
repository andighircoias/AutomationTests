package pages;

import constants.Locators;

public class HomePagePAGE extends TestPage {

	public void clickOnTabs() {
		clickIt(Locators.CSS, "#menu-item-153 > a:nth-child(1)", true);
	}

	public void clickOnTab3() {
		clickIt(Locators.ID, "ui-id-3", true);
	}

	public void clickOnDemo() {
		clickIt(Locators.CSS, ".dropdown-toggle", true);

	}

}
