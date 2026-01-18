package Scrolling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//maximizing window
		driver.manage().window().maximize();
		//deleting cookies
		driver.manage().deleteAllCookies();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
	
		
	}

}
