package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_ScriptExample {
public WebDriver driver;
public void javaScript()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	JavascriptExecutor javascriptexample=(JavascriptExecutor) driver; //intialize driver to javascript interface
	javascriptexample.executeScript("window.scrollBy(0,3000)", "");
	javascriptexample.executeScript("window.scrollBy(0,-1000)", "");
	/*WebElement amazonpagesearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	javascriptexample.executeScript("arguments[0].click();", amazonpagesearch);
	amazonpagesearch.click();*/
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_ScriptExample amazonpage=new Java_ScriptExample();
		amazonpage.javaScript();
	}

}
