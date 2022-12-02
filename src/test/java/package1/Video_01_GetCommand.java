package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_01_GetCommand {
	
	@Test(enabled=true)
	public void f1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//It will open the browser
		driver.get("https://www.qafox.com/selenium/");
				
	}
	
	@Test(enabled=false)
	public void f2() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Will throw the exception because we are not using https   - org.openqa.selenium.InvalidArgumentException: invalid argument
		//Why it will be not open without https?
		driver.get("www.qafox.com/selenium/");
			
	}

}
