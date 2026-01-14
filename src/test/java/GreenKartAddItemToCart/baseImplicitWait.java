package GreenKartAddItemToCart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		List<WebElement> Product = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < Product.size(); i++) {
			String[] name = Product.get(i).getText().split("-");
			String formatedName = name[0].trim();

			// format of name is Brocolli - 1 Kg
			// Check whether name you extracted is present in array or not
			// Convert array to arraylist and check whether name is present in arraylist for
			// easy search

			List itemNeededList = Arrays.asList(itemsNeeded);
			int j = 0;
			if (itemNeededList.contains(formatedName)) {

				// Click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}

		}
	}

}
