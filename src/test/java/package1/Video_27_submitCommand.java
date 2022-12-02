package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_27_submitCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
	
        driver.findElement(By.id("input-email")).sendKeys("arun.selenium@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Second@123");
		// The purpose submit() command to submit the application without hit the login button
        //It is alternate of click() action
        driver.findElement(By.id("input-password")).submit();
		
		Thread.sleep(2000);
		
		driver.quit();
			
	}
	
}
