package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_28_getTagNameCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose getTagName() command is used to get the HTML tag name value of a webElement from the webPage
		String data=driver.findElement(By.id("alert1")).getTagName();
		System.out.println(data);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
