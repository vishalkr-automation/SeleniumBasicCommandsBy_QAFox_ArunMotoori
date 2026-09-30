package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Video_30_getLocationCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose getLocation() command is used to get the X and Y coordinate of a webElement from the webPage
		Point p=driver.findElement(By.id("ta1")).getLocation();
		
		System.out.println("The X cordinate of the textarea field is: "+ p.x);
		System.out.println("The Y cordinate of the textarea field is: "+ p.y);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
