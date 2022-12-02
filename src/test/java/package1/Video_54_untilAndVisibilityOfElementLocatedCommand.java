package package1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_54_untilAndVisibilityOfElementLocatedCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//The purpose of until() and visibilityOfAllElementsLocatedBy() is wait for load a specific element on the page to given a specific time, if the element will be find before the given specific time
		//It will move to next line it does not wait till that time over like Thread.sleep(2000).
		//It is not a global wait function
		//It is a element specific wait
		driver.get("http://omayo.blogspot.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
	    driver.findElement(By.className("dropbtn")).click();
	    System.out.println(driver.getTitle());
	    
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Facebook")));
	    driver.findElement(By.linkText("Facebook")).click();  //Here it is waiting till the Facebook element is being displayed (It will come after click on dropdown link)
	    System.out.println(driver.getTitle());
	    
	    driver.navigate().back();
	   
	    driver.findElement(By.className("dropbtn")).click();
	    System.out.println(driver.getTitle());
	    
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("FlipKart")));
	    driver.findElement(By.linkText("FlipKart")).click(); //Again it will come after clicking on Dropdown element
	    System.out.println(driver.getTitle());
	    
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
