package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window  {
	public WebDriver driver;
	public void window()
	{
		driver=new ChromeDriver();
		driver.get("https:webdriveruniversity.com/");
			driver.manage().window().maximize();
			WebElement windowhand=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
			windowhand.click();
			WebElement windowhand1=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
			windowhand1.click();
			String parent=driver.getWindowHandle();
			System.out.println("Parent Window" +parent);
			Set<String> allwindow=driver.getWindowHandles();
			System.out.println("The child is" +allwindow);
			String title="";
			for(String temp:allwindow)
			{
				if(!temp.equals(parent))
				{
					System.out.println(" Except parent from child window"+temp);
					driver.switchTo().window(temp);
					System.out.println(driver.getTitle());
					title=driver.getTitle();
				}
				if(title.equals("WebDriver | Login Portal"))
				{
					WebElement username=driver.findElement(By.xpath("//input[@id='text']"));
					username.sendKeys("Kala");
					WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
					password.sendKeys("Kaladevi");
					WebElement login=driver.findElement(By.xpath("//button[@id='login-button']"));
					login.click();
					
					
				}
				if(title.equals("WebDriver | Contact Us" ))
				{
					WebElement contactus=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
					contactus.sendKeys("Kaladevi");
					WebElement contactus1=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
					contactus1.sendKeys("M");
					WebElement contactus2=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
					contactus2.sendKeys("mjkmeri@gmail.com");
					WebElement contactus3=driver.findElement(By.xpath("//textarea[@placeholder='Comments']"));
					contactus3.sendKeys("Hello");
					
					
				}
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window multiwindowhand=new Window();
		
		multiwindowhand.window();
		
	}

}
