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

public class Video_51_pageLoadCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.colabus.com/");
		
		// The purpose defaultContent() command is used to come back to parent window
		//If you want to wait till the page load
		//If you want to set the time out for load the page
       
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
