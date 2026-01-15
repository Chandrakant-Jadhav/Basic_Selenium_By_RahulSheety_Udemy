package MouseInteraction_ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a =new Actions(driver);
		
		
		//Moves to specific element
		WebElement move =driver.findElement(By.xpath("//div[@id=\"nav-link-accountList\"]"));
		a.moveToElement(move).contextClick().build().perform();
		
		//enter text with SHIFT key and double click
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(org.openqa.selenium.Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		

	}

}
