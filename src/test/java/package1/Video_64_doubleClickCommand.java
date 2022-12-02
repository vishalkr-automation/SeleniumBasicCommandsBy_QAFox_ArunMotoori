package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_64_doubleClickCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/p/page3.html");
			
		//double click command is used to clicked 2 times of an element on the webPage
		
		Actions a = new Actions(driver);		
		
		WebElement textBox=driver.findElement(By.id("testdoubleclick"));
		
		a.doubleClick(textBox).build().perform();    //It will  right click on a specific element in the webPage
		
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
