package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_63_ConextClickCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/p/page3.html");
			
		//dragAndDropBy command is used to drag and drop of an element on the webPage
		
		Actions a = new Actions(driver);		
		
		WebElement textBox=driver.findElement(By.name("q"));
		
		//a.contextClick().build().perform();    //It will normal right  click on the webPage
		
		a.contextClick(textBox).build().perform();    //It will  right click on a specific element in the webPage
		
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
