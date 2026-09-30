package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video_57_alert_getText_accept_dismiss_Command {
	
	@Test(enabled=true)
	public void f1() throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.id("alert1")).click();
		
		//Alert is an interface and switch().alert() command is used to handle the alert popup
		Alert alert=driver.switchTo().alert();
		String textOfAlert=alert.getText();
		System.out.println(textOfAlert);
		
		alert.accept();  //It will accept the alert popup
		
		//alert.dismiss(); //It will dismiss the alert popup
	
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
