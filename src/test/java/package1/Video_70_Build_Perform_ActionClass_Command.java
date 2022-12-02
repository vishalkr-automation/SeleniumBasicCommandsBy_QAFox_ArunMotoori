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

public class Video_70_Build_Perform_ActionClass_Command {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
			
		//build() command is used when we use 2 keyboard actions 
		//perform() command is used when we can use 1 keyboard action
		//Note: For 2 keyboard action only perform command will not work
		
		Actions a = new Actions(driver);		
		
		WebElement userName=driver.findElement(By.name("userid"));
		
		userName.sendKeys("Arun");
		
		//a.sendKeys(Keys.TAB);  //Will not work
		
		//a.sendKeys(Keys.TAB).perform(); //It will be work
		
		//a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform(); //it will not work
		
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform(); //It will work
	
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
