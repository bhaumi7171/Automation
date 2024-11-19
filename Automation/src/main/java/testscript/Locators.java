package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Locators extends Base 
{
	public void idLocator()
	{
		//WebElement elementname=driver.findElement(By.locator("attributevalue"));
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
			                                                            	//(By.id("single-input-field"));
		WebElement inputfield=driver.findElement(By.id("value-a"));
		WebElement inputfield1=driver.findElement(By.id("value-b"));
		WebElement inputfield2=driver.findElement(By.id("message-two"));//clearfix
	}
public void nameLocator()
{
	WebElement name=driver.findElement(By.name("viewport"));
	WebElement desc=driver.findElement(By.name("description"));
	WebElement keyw=driver.findElement(By.name("keywords"));
	WebElement auth=driver.findElement(By.name("author"));
}
public void classLocator()
{
	WebElement headerclass=driver.findElement(By.className("header-top"));
	WebElement headerclass1=driver.findElement(By.className("clearfix"));
	WebElement headerclass2=driver.findElement(By.className("container page"));
	WebElement headerclass3=driver.findElement(By.className("mb-sec"));
}
public void cssSelector()
{
	//first combination : tag#id
	WebElement messagefieldcss=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement buttonfieldcss=driver.findElement(By.cssSelector("button#button-one"));
	WebElement navigationbarcss=driver.findElement(By.cssSelector("div#collapsibleNavbar"));
	WebElement yourmessagefieldcss=driver.findElement(By.cssSelector("div#message-one"));
	//
	//second combination: tag.class
	WebElement headercss=driver.findElement(By.cssSelector("div.mb-sec"));
	WebElement headercss1=driver.findElement(By.cssSelector("section.clearfix"));
	
	//third combination: tag[attribute=value]
	WebElement messagefieldcss1=driver.findElement(By.cssSelector("input[id=single-input-field]"));
	
//fourth combination tag.class[attribute=value]
	WebElement messagefieldcss2=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	WebElement messagefieldcss3=driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
}
public void relativeXpath()
	
	{
		
	//relativexpath //tagname[@attributetype='attributevalue']
	WebElement messagefieldcss3=driver.findElement(By.xpath("//input[@placeholder='Message']"));
	}
public void absoluteXpath()
{
	//absolutexpath
	WebElement messagefieldcss3=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
}
	
public void containsXpath()
{
	//tagname[contains(@attributetype,'value')]
	WebElement contains=driver.findElement(By.xpath("//input[contains(@placeholder,'Message')]"));
	WebElement contains1=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
}
public void textXpath()
{
	//tagname[text()='value']
	WebElement text=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement text1=driver.findElement(By.xpath("//button[text()='Get Total']"));
	WebElement text2=driver.findElement(By.xpath("//label[text()='Enter Message']"));
	WebElement text3=driver.findElement(By.xpath("//label[text()='Enter value A']"));
	WebElement text4=driver.findElement(By.xpath("//label[text()='Enter value B']"));
}
public void axes()
{
	//tagname[@attributetype='value']//parent::div"));
	WebElement axesparent=driver.findElement(By.xpath("//input[@placeholder='Message']//parent::div"));
	WebElement axesparent1=driver.findElement(By.xpath("//div[@id='message-one']//parent::form"));
	WebElement axeschild=driver.findElement(By.xpath("//a[@href='index.php']/child::img"));
	WebElement axeschild1=driver.findElement(By.xpath("//div[@class='carousel-item']//child::img"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locators locator=new Locators();
locator.idLocator();
locator.intialiseBrowser();
locator.absoluteXpath();
locator.relativeXpath();
locator.cssSelector();
locator.classLocator();
locator.containsXpath();
locator.textXpath();

	}  

}
