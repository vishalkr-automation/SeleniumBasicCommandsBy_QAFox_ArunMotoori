package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Video_32_xpathLocatorCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose xpath locator command is used to find of a webElement from the webPage
		driver.findElement(By.xpath("//button[@value='LogIn']")).click();
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
