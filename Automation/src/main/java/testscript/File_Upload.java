package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	
public WebDriver driver;
public void fileupload() throws AWTException
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement fileup=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
	fileup.click();  
	StringSelection fileupselect=new StringSelection("C:\\Users\\binoo\\Downloads\\Binoop _ Interior Designer (1).pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileupselect,null);
	Robot robot=new Robot();
	robot.delay(120);//delay(120) means 120 second delay, time is in second if not upload the delay will work, if working or uploaded delay will not working
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
public void directenterSendkeys()
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement fileup=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
	//fileup.click();
	fileup.sendKeys("C:\\Users\\binoo\\Downloads\\Binoop _ Interior Designer (1).pdf");
}
/*
public void checksite()
{
	driver=new ChromeDriver();
	driver.get("https://xodo.com/pdf-to-word-converter");
	driver.manage().window().maximize();
	WebElement fileup=driver.findElement(By.xpath("//button[@id='select-file-button']"));
	fileup.click();
	fileup.sendKeys("C:\\Users\\binoo\\Downloads\\Binoop _ Interior Designer (1).pdf");
}*/

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		File_Upload fileuploadd=new File_Upload();
		//fileuploadd.fileupload();
		fileuploadd.directenterSendkeys();
		//fileuploadd.checksite();
	}

}
