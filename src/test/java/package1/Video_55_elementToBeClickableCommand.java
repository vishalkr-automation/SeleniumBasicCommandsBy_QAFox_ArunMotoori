package package1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_55_elementToBeClickableCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//The purpose of until() and elementToBeClickable() is wait for click a specific element on the page to given a specific time, if the element will be find before the given specific time
		//It will move to next line it does not wait till that time over like Thread.sleep(2000).
		//It is not a global wait function
		//It is a element specific wait
		driver.get("http://omayo.blogspot.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		
		//Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Check this']")).click();
	   
	    WebElement mrOptionCheckBox=driver.findElement(By.id("dte"));
	    wait.until(ExpectedConditions.elementToBeClickable(mrOptionCheckBox));
	    mrOptionCheckBox.click();
	    
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
