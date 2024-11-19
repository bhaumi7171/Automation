package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Form_Submitpage extends Base
{
public void navigate()
{
	driver.navigate().to("https://selenium.qabible.in/form-submit.php");
}
public void fields()
{
	WebElement firstname=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
	firstname.sendKeys("Kaladevi");
	WebElement lastname=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
	lastname.sendKeys("M");
	WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
	username.sendKeys("Kaladevi26");
	WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
	city.sendKeys("Kayamkulam");
	WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
	state.sendKeys("Kerala");
	WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
	zip.sendKeys("690572");
	WebElement checkbox=driver.findElement(By.xpath("//label[@for='invalidCheck']"));
	checkbox.click();
	WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	submit.click(); 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Form_Submitpage navigateformsubmitpage=new Form_Submitpage();
		navigateformsubmitpage.intialiseBrowser();
		navigateformsubmitpage.navigate();
		navigateformsubmitpage.fields();
	}

}
