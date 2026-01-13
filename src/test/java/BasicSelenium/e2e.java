package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(
				By.xpath("//div [@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='MAA']"))
				.click();

		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();

		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			System.out.println("Return date is enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
