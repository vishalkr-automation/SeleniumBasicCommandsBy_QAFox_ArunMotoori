package package1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_75_addCookieCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.tutorialsninja.com/demo/");
			
	    //addCookie() command to add the own cookie in the browser apart from defualt cookies
		Cookie cookie=new Cookie("Name","Arun");
		
		driver.manage().addCookie(cookie);
	
	
		Thread.sleep(2000);
		//driver.quit();
			
	} 
	
}
