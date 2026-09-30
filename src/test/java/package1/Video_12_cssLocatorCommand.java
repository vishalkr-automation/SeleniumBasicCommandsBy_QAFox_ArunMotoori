package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video_12_cssLocatorCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose of cssSelector() is to identify the element on the webPage to perform  actions
		driver.findElement(By.cssSelector("button[value='LogIn']")).click();
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
