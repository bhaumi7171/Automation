package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Eg {
	public WebDriver driver;
	/*public void robo() throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_T);
		}*/
	public void newtab() throws AWTException
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		Robot robo1=new Robot();
		robo1.keyPress(KeyEvent.VK_CONTROL);
		robo1.keyPress(KeyEvent.VK_T);
		robo1.keyRelease(KeyEvent.VK_CONTROL);
		robo1.keyRelease(KeyEvent.VK_T);
		//driver.navigate().to("https://webdriveruniversity.com/Click-Buttons/index.html");
		StringSelection urll=new StringSelection("https://webdriveruniversity.com/Click-Buttons/index.html");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(urll, null);
		Robot robo2=new Robot();
		robo2.keyPress(KeyEvent.VK_CONTROL);
		robo2.keyPress(KeyEvent.VK_V);
		robo2.keyRelease(KeyEvent.VK_CONTROL);
		robo2.keyRelease(KeyEvent.VK_V);
		robo2.keyPress(KeyEvent.VK_ENTER);
		robo2.keyRelease(KeyEvent.VK_ENTER);
		}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot_Eg roboegg=new Robot_Eg();
		//roboegg.robo();
		roboegg.newtab();

	}

}
