package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_66_KeyDown_KeyUp_Command {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
			
		//KeyDown() and KeyUp() command is used to open a new tab on clicking on the link
		
		Actions a = new Actions(driver);		
		
		WebElement source=driver.findElement(By.linkText("compendiumdev"));
	
		a.moveToElement(source).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
