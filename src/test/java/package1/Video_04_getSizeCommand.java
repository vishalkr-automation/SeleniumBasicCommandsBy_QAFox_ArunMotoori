package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_04_getSizeCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//The purpose of this command is to launch the required browser in fullscreen mode
		driver.manage().window().maximize();
		
		
		//It will open the browser
		driver.get("https://www.qafox.com/selenium/");
		
		//The purpose of this command is to resize the browser window
		Dimension d=new Dimension(300, 650);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
