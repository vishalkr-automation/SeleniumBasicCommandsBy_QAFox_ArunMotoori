package package1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_52_setScriptTimeoutCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//The purpose of setScriptTimeout() is wait for load a specific element on the page which element can get some extra time to load on the page even after load the complete page
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		boolean isbuttonDisplayed=driver.findElement(By.id("but2")).isDisplayed();
		System.out.println(isbuttonDisplayed);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
