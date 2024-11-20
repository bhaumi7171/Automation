package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Handling extends Base {
	public void alerthan()
	{
		driver.navigate().to("https://selenium.qabible.in/bootstrap-alert.php");
		WebElement alerth=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		alerth.click();
		WebElement alerth1=driver.findElement(By.xpath("c"));
		alerth1.click();
		
		driver.switchTo().alert().accept();
		System.out.println(alerth1.isDisplayed());
	}
	public void alertcon()
	{
		WebElement alerth1=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		alerth1.click();
		driver.switchTo().alert().dismiss();
	}
public void alertcc()
{
	WebElement alerthcprompt=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	alerthcprompt.click();
	driver.switchTo().alert().sendKeys("kala");
	driver.switchTo().alert().accept();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert_Handling alert=new Alert_Handling();
		alert.intialiseBrowser();
		alert.alerthan();
		alert.alertcon();
		alert.alertcc();
	}

}
