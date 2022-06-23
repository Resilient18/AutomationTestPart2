package page;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class MonthDropDownPage {
	
	WebDriver driver;
	
	@FindBy(how = How.NAME,using = "due_month") WebElement MONTH;
	
	
		
	
	public  void monthDropDown() { 
	Select select = new Select(MONTH);
	List <String> actualValues = new ArrayList<String>();
	
	for(WebElement element:select.getOptions()) {
		
		actualValues.add(element.getText());
	}
		System.out.println(actualValues);	
		String[] months = { "None","Jan","Feb", "Mar","Apr", "May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	List<String> expectedValues = Arrays.asList(months);	
	
	System.out.println(expectedValues);
	Assert.assertEquals(actualValues,expectedValues,"Error in Drop Down options!");
	
	
	
	}
	}


