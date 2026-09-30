package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Video_65_DragAndDropCommand {
	
	@Test(enabled=true)
	public void f1() throws Exception {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
		//dragAndDropBy command is used to drag and drop of an element on the webpage
		
		Actions a = new Actions(driver);		
		
		WebElement source=driver.findElement(By.id("box1"));
		
		WebElement destination=driver.findElement(By.id("box101"));
		
		Thread.sleep(1000);
		a.dragAndDrop(source, destination).build().perform(); //Move Source to destination
		
		Thread.sleep(2000);
		driver.quit();
			
	} 
	
}
