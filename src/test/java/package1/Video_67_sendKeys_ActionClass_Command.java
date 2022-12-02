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

public class Video_67_sendKeys_ActionClass_Command {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
			
		//Keys.TAB() and Keys.ENTER command perform the keyboard action
		
		Actions a = new Actions(driver);		
		
		WebElement userName=driver.findElement(By.name("userid"));
		WebElement password=driver.findElement(By.name("pswrd"));
		
		userName.sendKeys("User1");
		
		a.sendKeys(Keys.TAB).build().perform();  //it will move to next element
		
		password.sendKeys("password123");
		
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform(); //it will move to next element and click on element
		
	
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
