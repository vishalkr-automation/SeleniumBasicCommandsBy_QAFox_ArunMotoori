package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_60_moveToCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
			
		//moveToElement() command is used to move to a specific element on the webpage
		
		Actions a = new Actions(driver);		
		
		WebElement Blogs=driver.findElement(By.id("blogsmenu"));
		
		a.moveToElement(Blogs).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
