package newFeatureOfUpdatedSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightAndWidth {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(010));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement name = driver.findElement(By.xpath("(//input[@name=\"name\"])[1]"));
		name.sendKeys("Chandu");
		//To get height and width of an element
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

	}

}
