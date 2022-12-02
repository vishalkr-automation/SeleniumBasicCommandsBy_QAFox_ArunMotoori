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

public class Video_56_invisibiltyOfElementLocatedCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//The purpose of until() and invisibilityOf() is wait for invisbile/hide a specific element on the page to given a specific time, if the element will be invisbile/hide before the given specific time
		//It is not a global wait function
		//It is a element specific wait
		driver.get("http://omayo.blogspot.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 25);
		
	    WebElement Thistextwilldisappear=driver.findElement(By.id("deletesuccess"));
	    wait.until(ExpectedConditions.invisibilityOf(Thistextwilldisappear));   //It will wait till 25 seconds to invisbile the item from the web page
	    System.out.println(Thistextwilldisappear.isDisplayed());   //It should be false
	 
	    driver.findElement(By.id("alert2")).click();
	    
	    
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
