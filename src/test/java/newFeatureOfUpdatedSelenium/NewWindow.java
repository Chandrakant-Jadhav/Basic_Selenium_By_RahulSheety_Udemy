package newFeatureOfUpdatedSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(010));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//To open new tab
	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    //To open new window
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    
	    Set <String> handels = driver.getWindowHandles();
	    Iterator<String> it = handels.iterator();
	    String parentWinID = it.next();
	    String childWinID = it.next();
	    
	    driver.switchTo().window(childWinID);
	    driver.get("https://rahulshettyacademy.com/");

	}

}
