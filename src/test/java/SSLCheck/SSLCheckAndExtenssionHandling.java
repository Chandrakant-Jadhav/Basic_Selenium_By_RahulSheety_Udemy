package SSLCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Scrolling.JavaScriptExecutor;

public class SSLCheckAndExtenssionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To handle SSL Certificate Error
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//adding extension
		options.addEncodedExtensions("C:\\Users\\HP\\Downloads\\extension_6_0_1_0.crx");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		System.out.println(driver.getTitle());;
	

	}

}
