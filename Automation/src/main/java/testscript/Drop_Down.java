package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down extends Base {
	public void dropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement dropdown1=driver.findElement(By.xpath("//a[@href='select-input.php']"));
				dropdown1.click();
		WebElement dropdownselect=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		//dropdownselect.click();
		Select drop=new Select(dropdownselect);
		drop.selectByVisibleText("Red");
		drop.selectByVisibleText("Green");//select by visible text
		drop.selectByIndex(2); //index value
		drop.selectByValue("Yellow");  //value showing in as text
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drop_Down dropdown=new Drop_Down();
		dropdown.intialiseBrowser();
		dropdown.dropDown();
	}

}
