package demoqa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.TestPage;

public class TestBase extends TestPage {

	@BeforeClass
	public void initalize() {
		initializeDriver2();
		navigateToWantedPage("http://demoqa.com/");
		maximizePAGE();
	}

	@AfterClass
	public void nu() {
		closeWholeProcess();
	}
}
