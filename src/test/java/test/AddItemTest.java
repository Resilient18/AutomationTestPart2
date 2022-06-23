package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddItemPage;
import page.NoDuplicatesPage;
import util.BrowserFactory;

public class AddItemTest {
	
	
		
		WebDriver driver;
		
	@Test(priority=1)	
	public void userShouldBeAbletoAddItem() { 
			
			
			driver = BrowserFactory.init();
			
			AddItemPage addItemPage = PageFactory.initElements(driver, AddItemPage.class);
			
			addItemPage.addItemToList();
			//Assert.assertFalse(null, false);
			Assert.assertTrue(addItemPage.ADDEDCATEGORY.isDisplayed(), "Item not found");
			
		}

	
	
 
	
	@Test
	public void userShouldNotBeAbleToAddDuplicates() { 
		
		
		
		driver = BrowserFactory.init();
		
		NoDuplicatesPage noDuplicatesPage = PageFactory.initElements(driver, NoDuplicatesPage.class );
		noDuplicatesPage.checkForDuplicates();
		
		
		
	}
	}


