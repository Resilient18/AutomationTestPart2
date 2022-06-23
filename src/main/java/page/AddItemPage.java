package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import util.BrowserFactory;

public class AddItemPage extends BasePage{
	
	WebDriver driver; 
	
	
	//Element List 
	
	@FindBy(how = How.NAME, using = "categorydata") WebElement ADDCATEGORY;
	@FindBy(how = How.CSS, using = "input[value='Add category']") WebElement ADDBUTTON;
	@FindBy(linkText = "Raji'sTest5"  )
	public WebElement ADDEDCATEGORY;
	
	//Intractable Methods
	
	
	public void addItemToList() { 
		
		
		ADDCATEGORY.sendKeys("Raji'sTest5");
		ADDBUTTON.click();
		
		
	}

}
