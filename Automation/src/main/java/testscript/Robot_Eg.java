package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Eg {
	public WebDriver driver;
	public void robo() throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_T);
			
	}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot_Eg roboegg=new Robot_Eg();
		roboegg.robo();

	}

}
