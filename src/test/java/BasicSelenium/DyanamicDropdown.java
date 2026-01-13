package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// a[@value='MAA'] -
		// a[@value='BLR']

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// without indexing it will select first matching element only
		// trying without index
		// div [@id="glsctl00_mainContent_ddl_destinationStation1_CTNR"]
		// //a[@value='MAA']

		driver.findElement(
				By.xpath("//div [@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']"))
				.click();

		// selecting date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
