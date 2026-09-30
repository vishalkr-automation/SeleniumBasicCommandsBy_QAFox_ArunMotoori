package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video_49_ParentframeCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose deselectAll() command is used to unselect all the selected value from MultiSelect webElement from the webPage
		//It is a overloaded method of selenium 
		
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(frame);
		//driver.switchTo().frame(2);
		String value=driver.findElement(By.tagName("h2")).getText();
		System.out.println(value);
		
		//This command will switch the parent window
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
