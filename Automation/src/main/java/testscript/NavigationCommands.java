package testscript;

public class NavigationCommands extends Base {

	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");//navigate to other site in that browser
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NavigationCommands navigation=new NavigationCommands();
navigation.intialiseBrowser();
navigation.navigateCommands();
navigation.quitClose();
	}

}
