package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputMethod_Field extends Base {
public void getmessage()
{
	////
	WebElement input=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	input.click();
	WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	message.sendKeys("Welcome");
	WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
	showmessage.click();
	WebElement valuemessage1=driver.findElement(By.xpath("//input[@id='value-a']"));
	valuemessage1.sendKeys("25");
	WebElement valuemessage2=driver.findElement(By.xpath("//input[@id='value-b']"));
	valuemessage2.sendKeys("45");
	WebElement total=driver.findElement(By.xpath("//button[@id='button-two']"));
		total.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputMethod_Field inputmethod=new InputMethod_Field();
		inputmethod.intialiseBrowser();
		inputmethod.getmessage();
	}

}
