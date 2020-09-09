package EventHandling;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	@Test
	public void browserLaunch() {
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/browser-windows");
		
//		String parentWindow = driver.getWindowHandle();
//		
//		System.out.println("Parent Window-"+parentWindow);
//		
//		driver.findElement(By.id("tabButton")).click();
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.navigate().to("https://www.facebook.com/");
//		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.navigate().to("https://twitter.com/");
		
//		Set <String >set = driver.getWindowHandles();
//		System.out.println("All Windows and Tabs Ids-"+ set);
//		set.remove(parentWindow);
//		
//		System.out.println("After removing Parent Window - "+ set);
		 
	
//		Iterator<String> itr = set.iterator();
//		while(itr.hasNext()) {
//			String currentWindow = itr.next();//1
//			
//			driver.switchTo().window(currentWindow);
//			System.out.println("Current Window Title -" +driver.getTitle());
//			
//		}
//		
//		
//		driver.switchTo().window(parentWindow);
//		System.out.println("Parent Window Title -" +driver.getTitle());
		
	}

}
