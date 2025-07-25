package automateLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTeat2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://WWW.saucedemo.com/v1/");

		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
	
		userName.sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");

	//	Thread.sleep(2000);
		// it is a java wait

		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='inventory_item_name']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();

		driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("sanjay");
		driver.findElement(By.xpath("//input[@id='postai-name']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("626001");
		}
	
        	

	}


