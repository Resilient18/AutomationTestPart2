package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MonthDropDownPage;
import util.BrowserFactory;
public class MonthDropDownTest {

	WebDriver driver; 
	
	
	
	@Test
	public void validateMonthDopDown() {
	
	driver = BrowserFactory.init();
	
	MonthDropDownPage monthDropDownPage = PageFactory.initElements(driver, MonthDropDownPage.class);
	monthDropDownPage.monthDropDown();
		
	
	}
}
