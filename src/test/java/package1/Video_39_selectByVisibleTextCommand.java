package package1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video_39_selectByVisibleTextCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose selectByVisibleText() command is used to select an element from dropDown and MultiSelect webElement from the webPage
	    WebElement dropdown=driver.findElement(By.id("drop1"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("doc 1");
		
		Thread.sleep(1000);
		
		//MultiSelect Example
		WebElement multiSelect=driver.findElement(By.id("multiselect1"));
		Select select2=new Select(multiSelect);
		select2.selectByVisibleText("Hyundai");
	
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
