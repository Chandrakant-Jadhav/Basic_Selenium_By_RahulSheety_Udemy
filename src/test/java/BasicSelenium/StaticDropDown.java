package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//dropdwon with select tag
		WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdwon =new Select(staticDropDown);
		dropdwon.selectByIndex(3);
		System.out.println(dropdwon.getFirstSelectedOption().getText());
		dropdwon.selectByVisibleText("AED");
		System.out.println(dropdwon.getFirstSelectedOption().getText());
		dropdwon.selectByValue("INR");
		System.out.println(dropdwon.getFirstSelectedOption().getText());
	}

}
