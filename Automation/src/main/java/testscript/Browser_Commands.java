package testscript;

public class Browser_Commands extends Base {
	public void browserCommands()
	{
		String title=driver.getTitle();
		System.out.println(title);//not in double quotes
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser_Commands browsercommands=new Browser_Commands();
browsercommands.IntialiseBrowser();
browsercommands.browserCommands();
	}

}
