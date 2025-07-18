package automateLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automate {
	
	public static void main(String[] args) throws InterruptedException { 
		ChromeOptions	 opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
    	driver.get("http://WWW.saucedemo.com/v1/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Id
		WebElement element = driver.findElement(By.id("username")); //30-1 29
		element.sendKeys("demo");//30-25 5
		element.clear();//30 0.1
		
		
		Thread.sleep(3000);
		element.sendKeys("standard_user");//30
		
		
		// name
		driver.findElement(By.name("PASSWORD")).sendKeys("secret_sauce");

	
	}

}
