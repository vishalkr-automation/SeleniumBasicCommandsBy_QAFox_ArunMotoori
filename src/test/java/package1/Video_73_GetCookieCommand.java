package package1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video_73_GetCookieCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.tutorialsninja.com/demo/");
			
	    //getCookies() command to return the cookie information
		Set<Cookie> cookies=driver.manage().getCookies();
		
		for(Cookie cookie:cookies) {
			System.out.println("Cookie Name:"+ cookie.getName());
			System.out.println("Cookie Value:"+ cookie.getValue());
			System.out.println("Cookie Domain:"+ cookie.getDomain());
			System.out.println("Cookie Path:"+ cookie.getPath());
			System.out.println("Cookie Expiray Date:"+ cookie.getExpiry());
			
		}
		
	
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
