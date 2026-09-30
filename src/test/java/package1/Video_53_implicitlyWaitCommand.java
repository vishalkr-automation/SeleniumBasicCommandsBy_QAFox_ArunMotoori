package package1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Video_53_implicitlyWaitCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//The purpose of implicitlyWait() is wait for load a specific element on the page to given a specific time, if the element will be find before the given specific time
		//It will move to next line it does not wait till that time over like Thread.sleep(2000).
		//It is global wait function
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
	    driver.findElement(By.className("dropbtn")).click();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.linkText("Facebook")).click();  //Here it is waiting till the Facebook element is being displayed (It will come after click on dropdown link)
	    System.out.println(driver.getTitle());
	    driver.navigate().back();
	    driver.findElement(By.className("dropbtn")).click();
	    System.out.println(driver.getTitle());
	    driver.findElement(By.linkText("FlipKart")).click(); //Again it will come after clicking on Dropdown element
	    System.out.println(driver.getTitle());
	    
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
