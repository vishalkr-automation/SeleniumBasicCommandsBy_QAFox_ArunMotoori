package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_02_MaximizeCommand {
	
	@Test(enabled=false)
	public void f1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//It will maximize the browser
		driver.manage().window().maximize();
		//It will open the browser
		driver.get("https://www.qafox.com/selenium/");
			
	}
	
	

}
