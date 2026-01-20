package newFeatureOfUpdatedSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(010));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("[name='name']"));
		//above 
		System.out.println(driver.findElement(with(By.tagName("label")).above(By.cssSelector("[name='name']"))).getText());
		//Below
		WebElement dateOfBirth= driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		//toLeftOF
		WebElement icecreamCheckbox = driver.findElement(By.xpath("//label[text()=\"Check me out if you Love IceCreams!\"]"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecreamCheckbox)).click();
		
		//TO right 
		WebElement RadioBtn = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(RadioBtn)).getText());;
	}

}
