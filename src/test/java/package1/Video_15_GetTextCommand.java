package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Video_15_GetTextCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose getText() command to get the text of element which is available under tags
		String data=driver.findElement(By.id("pah")).getText();
		System.out.println(data);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
