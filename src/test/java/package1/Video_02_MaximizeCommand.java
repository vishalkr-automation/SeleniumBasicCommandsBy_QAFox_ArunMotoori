package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Video_02_MaximizeCommand {
	
	@Test(enabled=true)
	public void f1() {
		
		WebDriver driver=new ChromeDriver();
		//It will maximize the browser
		driver.manage().window().maximize();
		//It will open the browser
		driver.get("https://www.qafox.com/selenium/");
			
	}
	
	

}
