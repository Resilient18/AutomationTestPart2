package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	
	
	public void selectDropDown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.getOptions();
	}
	
	public int randomNumGen(int bound) { 
		
		Random rnd = new Random(); 
		int randomNum = rnd.nextInt(bound)	;
		return randomNum;
	}

}
