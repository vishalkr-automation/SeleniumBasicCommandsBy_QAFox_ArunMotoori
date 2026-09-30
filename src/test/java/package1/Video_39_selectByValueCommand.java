package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Video_39_selectByValueCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose selectByValue() command is used to select an element from dropDown and MultiSelect webElement from the webPage
	    WebElement dropdown=driver.findElement(By.id("drop1"));
		Select select=new Select(dropdown);
		select.selectByValue("ghi");
		
		Thread.sleep(1000);
		
		//MultiSelect Example
		WebElement multiSelect=driver.findElement(By.id("multiselect1"));
		Select select2=new Select(multiSelect);
		select2.selectByValue("Hyundaix");
	
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
