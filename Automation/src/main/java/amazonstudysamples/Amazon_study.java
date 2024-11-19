package amazonstudysamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_study {
	public WebDriver driver;
	public void amazonstudy()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=4479087278068274710&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9186374&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("hp laptop");
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbutton.click();
	}
	public void checkbox()
	{
		WebElement checkbox=driver.findElement(By.xpath("//span[text()='Intel Core i7']"));
		checkbox.click();
		WebElement dropdown=driver.findElement(By.xpath("//span[text()='See more']"));
		//Select drop=new Select(dropdown);
		dropdown.click();
		WebElement dropdown1=driver.findElement(By.xpath("//span[text()='Dell']"));
		dropdown1.click();
		//drop.selectByVisibleText("")
		
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon_study amazon=new Amazon_study();
		amazon.amazonstudy();
		amazon.checkbox();
	}

}
