package package1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_48_frameCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe_height");
		
		// The purpose parentFrame() command is used to come back to parent frame
		//It is a overloaded method of selenium 
		//If we not switch to respective frame then the exception we get no such element exception when we try to do something on that frame element
		
		Thread.sleep(2000);
		
		//Parent Frame
		//WebElement frame1=driver.findElement(By.id("iframecontainer"));
		//driver.switchTo().frame(frame1);
		
		//driver.switchTo().frame("iframe");
		
		//driver.switchTo().frame("iframewrapper");
		
		driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.id("w3loginbtn")).getText());
		
		driver.switchTo().parentFrame();
		
		//It will back to normal window
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
