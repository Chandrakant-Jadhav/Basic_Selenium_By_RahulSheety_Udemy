package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.PrintStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locator {

	private static final PrintStream Sysout = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("chandujadhav96k+1204@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Chandu@123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("P.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Chandrakant Jadhav");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("QA Tester");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("chandrakantjadhav.qa@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    driver.findElement(By.cssSelector("form p")).getText();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Chandu");
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	    driver.quit();
	    
	

	}

}
