package testscript;

import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	
public WebDriver driver;
public void fileupload()
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement fileup=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
	fileup.click();
	StringSelection fileupselect=new StringSelection("C:\\Users\\binoo\\Downloads\\Binoop _ Interior Designer (1).pdf");
	
	
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File_Upload fileuploadd=new File_Upload();
		fileuploadd.fileupload();
	}

}
