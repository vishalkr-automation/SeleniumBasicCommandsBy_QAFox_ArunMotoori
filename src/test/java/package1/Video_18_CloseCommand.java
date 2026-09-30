package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video_18_CloseCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose close() command to close the current webPage which is opened by Selenium WebDriver
		Thread.sleep(2000);
		driver.close();
			
	}
	
}
