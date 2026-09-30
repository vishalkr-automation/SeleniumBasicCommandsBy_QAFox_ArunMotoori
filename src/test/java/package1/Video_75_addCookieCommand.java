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

public class Video_75_addCookieCommand {
	
	@Test(enabled=false)
	public void f1() throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.tutorialsninja.com/demo/");
			
	    //addCookie() command to add the own cookie in the browser apart from defualt cookies
		Cookie cookie=new Cookie("Name","Arun");
		
		driver.manage().addCookie(cookie);
	
		Thread.sleep(2000);
		//driver.quit();
			
	} 
	
	@Test(enabled=true)
	public void f2() throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.tutorialsninja.com/demo/");
			
        Cookie cookie=new Cookie("Name","Arun");
		
		driver.manage().addCookie(cookie);
		
		// Ab cookies print karo
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie c : cookies) {
		    System.out.println(c.getName() + " = " + c.getValue());
		}
	
		Thread.sleep(2000);
		//driver.quit();
			
	} 
	
}
