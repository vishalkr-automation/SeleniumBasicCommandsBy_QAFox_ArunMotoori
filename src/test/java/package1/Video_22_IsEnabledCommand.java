package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Video_22_IsEnabledCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose isEnabled() command to get the confirmation of element is enabled or not on the page
		boolean a=driver.findElement(By.id("but2")).isEnabled();  //true
		System.out.println(a);
		
		
		boolean b=driver.findElement(By.id("but1")).isEnabled();  //false
		System.out.println(b);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
