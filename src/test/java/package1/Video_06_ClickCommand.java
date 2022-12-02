package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_06_ClickCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//The purpose of this command is to launch the required browser in fullscreen mode
		driver.manage().window().maximize();
		
		
		//It will open the browser
		driver.get("http://omayo.blogspot.com/");
		
		//used to click on the required UI Element
		WebElement element=driver.findElement(By.id("prompt"));
		element.click();
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
