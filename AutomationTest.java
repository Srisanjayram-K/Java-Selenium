package automateLogin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AutomationTeat {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://WWW.saucedemo.com/v1/");

		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
	
		userName.sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");

		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='inventory_item_name']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("sanjay");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ram");
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("626001");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='./checkout-complete.html']")).click();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		
		Files.copy(f,new File("C:\\Users\\ELCOT\\Pictures\\Screenshots\\sauce_screenshot.jpg"));
		// To take Screenshot
		}
	
        	

	}


