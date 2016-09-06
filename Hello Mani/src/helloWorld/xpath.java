package helloWorld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath 

{

	public static void main(String args[])
	
	{
		
		String base_url = "http://www.tutorialspoint.com/html/html_tables.htm.";
		
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		String xpath = "";
		
		
		
		
	}
	
	
}
