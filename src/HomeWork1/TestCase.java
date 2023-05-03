package HomeWork1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.primeTechPage;
import utils.DataReader;
import utils.Driver;

public class TestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/dilareduolikun/Documents/SeleniumTools/chromedriver_mac_arm64/chromedriver");
		TestCase obj= new TestCase();
		obj.testcase1();
	}
	primeTechPage ptPage;
	
	public void testcase1() {
		ptPage= new primeTechPage();
	Driver.getDriver().get(DataReader.getProperty("appUrl"));	
	ptPage.PTnewBtn.click();
	
	String mainPageTitle =Driver.getDriver() .getTitle();
	System.out.println(mainPageTitle);
	String mainPageWindowId = Driver.getDriver().getWindowHandle();
	System.out.println(mainPageWindowId);
	Driver.quietDriver();
	
	
	
	
	
	
	}
	
	
	
}
