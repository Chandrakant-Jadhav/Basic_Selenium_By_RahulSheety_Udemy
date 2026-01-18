package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //code to check broken links will be added here
        //Java method will call URL's and get you the status code
        //if status code >400 then that url is broken else not
        //For this we need to get all the links in the page
        
        
        List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert softAssert = new SoftAssert();
        
        for(WebElement link : links)
		{
			String url= link.getAttribute("href");
			//create a connection using url object
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode= conn.getResponseCode();
			System.out.println(respCode);
			softAssert.assertTrue(respCode<400, "The link with text "+ link.getText()+" is broken with code "+ respCode);
			
		}       
         softAssert.assertAll();
	}

}
