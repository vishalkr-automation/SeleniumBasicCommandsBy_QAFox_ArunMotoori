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

public class Video_41_getOptionsCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose getFirstSelectedOption() command is used to return Webelemnt of first selected option from  MultiSelect webElement from the webPage
		
		//MultiSelect Example
		WebElement multiSelect=driver.findElement(By.id("multiselect1"));
		Select select2=new Select(multiSelect);
		
		select2.selectByVisibleText("Volvo");
		select2.selectByVisibleText("Swift");
		select2.selectByVisibleText("Hyundi");
		select2.selectByVisibleText("Audi");
		
		WebElement element=select2.getFirstSelectedOption();
		System.out.println(element.getText());
	
		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
