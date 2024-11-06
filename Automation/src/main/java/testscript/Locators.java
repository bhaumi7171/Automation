package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void idLocator()
	{
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		//WebElement elementname=driver.findElement(By.locator("attributevalue"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
