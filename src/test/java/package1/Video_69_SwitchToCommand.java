package package1;

import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_69_SwitchToCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		//switchTo() command to use for switching the Alert, windows and Frame
		
		//Switch to alert
		driver.findElement(By.id("alert1")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		
		//switch to frame
		driver.switchTo().frame("iframe2");
		driver.switchTo().defaultContent();
		
		//switch to window
        		
		driver.findElement(By.linkText("Open a popup window")).click();
		Iterator<String> itr=driver.getWindowHandles().iterator();
		String parentWindow=itr.next();
		String childWindow=itr.next();
		
		driver.switchTo().window(childWindow); //switch to child window
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentWindow); //switch to parent window
	
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
