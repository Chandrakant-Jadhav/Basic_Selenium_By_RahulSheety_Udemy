package newFeatureOfUpdatedSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(010));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//To take partial screenshot of an element
		WebElement name = driver.findElement(By.xpath("(//input[@name=\"name\"])[1]"));
		name.sendKeys("Chandu");
		File file= name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
	}

}
