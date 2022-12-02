package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_08_NameCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//The purpose of this command is to launch the required browser in fullscreen mode
		driver.manage().window().maximize();
		
		
		//It will open the browser
		driver.get("http://omayo.blogspot.com/");
		
		//We can pass the name locator value of the required element
		WebElement element=driver.findElement(By.name("textboxn"));
		element.sendKeys("1234");
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
