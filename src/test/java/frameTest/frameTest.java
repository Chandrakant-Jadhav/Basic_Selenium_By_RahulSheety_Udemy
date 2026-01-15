package frameTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		// check number of frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);

		// switch to frame --> using webElement
		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class=\"demo-frame\"]")));
		// driver.findElement(By.id("draggable")).click();

		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();

		// switch back to main page
		driver.switchTo().defaultContent();

	}

}