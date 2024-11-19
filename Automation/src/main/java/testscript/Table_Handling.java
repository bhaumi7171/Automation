package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table_Handling extends Base {
	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");	
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		}
public void rowTable()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");	
	WebElement tablerow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
	WebElement tablerow1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
	//WebElement tablerow0=driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[0]"));
	WebElement tablerow0=driver.findElement(By.xpath("//th[@class='th-sm sorting_disabled']"));  //tablehead
	
	System.out.println(tablerow.getText());
	System.out.println(tablerow1.getText());
	System.out.println(tablerow0.getText());
}
public void selectParticular()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");	
	WebElement selectpartic=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[2]"));
	System.out.println(selectpartic.getText());
}
public void searchforParticular()
{
	String input="Tiger Nixon";
	List<WebElement> selectpartic=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	for(WebElement element:selectpartic)
	{
		if(element.getText().equals(input))
			System.out.println("The element is " +element.getText());
	}
}
	public void particuColumn()
	{
			List<WebElement> particolumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
			
		for(WebElement elemnt:particolumn)
		{
			
					
				System.out.println("The column " +elemnt.getText());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table_Handling tablehand=new Table_Handling();
		tablehand.intialiseBrowser();
		tablehand.fullTable();
		System.out.println("*****");
		tablehand.rowTable();
		tablehand.selectParticular();
		tablehand.searchforParticular();
		tablehand.particuColumn();
	}

}