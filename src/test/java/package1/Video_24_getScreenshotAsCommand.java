package package1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Video_24_getScreenshotAsCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose getScreenshotAs() command to capture the screenshot of a specific element from the page
		File screenshotSrc=driver.findElement(By.className("title")).getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotSrc);
		FileHandler.copy(screenshotSrc, new File(System.getProperty("user.dir")+"\\ScreenshotFolder\\file1.png"));
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
