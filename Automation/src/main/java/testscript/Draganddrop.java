package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop extends Base{
	public void dragAndDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");//others
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions action=new Actions(driver);
		action.moveToElement(drag);
		action.doubleClick(drag).perform();
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag, drop).build().perform();
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");//others
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		Actions action1=new Actions(driver);
		action1.moveToElement(drag1);
		action1.doubleClick(drag1).perform();
		WebElement drop1=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag1, drop1).build().perform();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Draganddrop dragdroppage=new Draganddrop();
		dragdroppage.intialiseBrowser();
		dragdroppage.dragAndDrop();
	}

}
