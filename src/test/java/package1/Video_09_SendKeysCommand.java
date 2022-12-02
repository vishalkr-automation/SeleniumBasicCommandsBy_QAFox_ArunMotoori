package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_09_SendKeysCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//The purpose of this command is to launch the required browser in fullscreen mode
		driver.manage().window().maximize();
		
		
		//It will open the browser
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		//We can use the sendkeys command to type the value in textbox or textarea
		driver.findElement(By.id("input-email")).sendKeys("arun.selneium@gmail.com");
		
		driver.findElement(By.id("input-password")).sendKeys("arun.selneium@gmail.com");
		
		//We can also use the Enter Command using sendKeys()
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
