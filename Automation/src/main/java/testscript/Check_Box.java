package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Check_Box extends Base{
public void checkBox()
{
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkbox=driver.findElement(By.xpath("//label[@for='gridCheck']"));
	checkbox.click();
	WebElement multicheckbox=driver.findElement(By.xpath("//input[@id='button-two']"));
	multicheckbox.click();
	System.out.println(checkbox.isEnabled());
}
public void radioButton()
{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radiobutton=driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
	radiobutton.click();
	System.out.println(radiobutton.isSelected());
	
}
public void textEnable()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement textenable=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	System.out.println("the message box is enabled: "+textenable.isEnabled());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check_Box checkboxx=new Check_Box();
		checkboxx.intialiseBrowser();
		checkboxx.checkBox();
		checkboxx.radioButton();
		checkboxx.textEnable();
	}

}
