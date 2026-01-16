package Scope;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		//count of total links on entire page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of links in footer section
		//limiting webdriver scope
		
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		int footerCount = footerdriver.findElements(By.tagName("a")).size();
		System.out.println("Footer links count: " + footerCount);
		
		//count of links in first column of footer section
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("Count of the first column links are: "+ columndriver.findElements(By.tagName("a")).size());;

		
		//click on each link in the column and check if the pages are opening
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			//Resolve stale element reference exception - open link in new tab
			String clikcOnLinkTab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clikcOnLinkTab);
			
		}
			//Open all the tabs
			Set <String> abc= driver.getWindowHandles();
			Iterator<String> it= abc.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
		}	
	}


