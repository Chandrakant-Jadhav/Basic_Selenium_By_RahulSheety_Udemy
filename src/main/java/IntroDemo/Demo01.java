package IntroDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Demo01 {

	public static void main(String[] args) {
		
		//Invoking Browser
		//chrome - chromedriver extension
		//Firefox - geckodriver extension
		
		
		//WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		WebDriver driver = new FirefoxDriver();
		//driver.setproperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		//close the current browser
		//driver.close();
		
		//quit the browser - close all the instances opened by selenium
		//driver.quit();
		
		
		
	}

}
