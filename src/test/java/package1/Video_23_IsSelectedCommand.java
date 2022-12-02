package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_23_IsSelectedCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose isSelected() command to get the confirmation of element(checkbox) is selected or not on the page
		boolean a=driver.findElement(By.id("checkbox1")).isSelected();  //true
		System.out.println(a);
		
		
		boolean b=driver.findElement(By.id("checkbox2")).isSelected();  //false
		System.out.println(b);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
