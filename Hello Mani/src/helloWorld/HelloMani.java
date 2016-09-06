
package helloWorld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HelloMani 
{

	public static void main(String[] args) throws InterruptedException 
	
	{


		//System.setProperty("webdriver.chrome.driver", "D:\\Mani\\Selenium\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://developer.salesforce.com/");
		Thread.sleep(30000); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[3]/header/div/div/div/div[1]/div[1]/div[1]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Sign Up
		driver.findElement(By.id("first_name")).sendKeys("Manikandan");
		driver.findElement(By.id("last_name")).sendKeys("Ravi");
		driver.findElement(By.id("email")).sendKeys("rmani2005@gmail.com");
		
		//Using Select for drop down box
		Select dropdown = new Select(driver.findElement(By.id("job_role")));
		dropdown.selectByValue("Administrator");
		
		//Normal Find element by
		driver.findElement(By.id("company")).sendKeys("CTS");
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		//Using Select for drop down box
		WebElement ele = driver.findElement(By.id("country")); 
		Select dropdown1=new Select(ele);
		dropdown1.selectByValue("IN");
		
		
		//Normal Find element by
		driver.findElement(By.id("postal_code")).sendKeys("600122");
		driver.findElement(By.id("username")).sendKeys("rmani2005@gmail.com");
		
		
		driver.findElement(By.id("eula")).click();
		
		driver.findElement(By.id("submit_btn")).click();
		
		
		System.out.println("Done Man!");
		
	}

}