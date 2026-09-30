package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video_17_GetCurrentCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose getCurrentUrl() command to get the URL of the page
		String data=driver.getCurrentUrl();
		System.out.println(data);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
