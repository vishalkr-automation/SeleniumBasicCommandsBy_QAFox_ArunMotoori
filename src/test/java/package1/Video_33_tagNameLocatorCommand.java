package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Video_33_tagNameLocatorCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		// The purpose tagName() locator command is used to find the webElement from the webPage
		List<WebElement> allbuttons=driver.findElements(By.tagName("button"));
		int totalbutton=allbuttons.size();
		System.out.println("Total number of button tags are avilable on the page is: "+totalbutton);
		
		for(WebElement element:allbuttons) {
			System.out.println(element.getText());
		}

		
		Thread.sleep(2000);
		driver.quit();
			
	}
	
}
