package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_29_getSizeCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		
		// The purpose getSize() command is used to get the height and width of a webElement from the webPage
		Dimension d=driver.findElement(By.name("search")).getSize();
		
		System.out.println("Height of the textbox is: "+ d.getHeight());
		System.out.println("Width of the textbox is: "+ d.getWidth());
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
