package deletingCookiesMaximizingWndow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Scrolling.JavaScriptExecutor;

public class deletingCookiesMaximizingWndows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		System.out.println(driver.getTitle());;
	
	}

}
