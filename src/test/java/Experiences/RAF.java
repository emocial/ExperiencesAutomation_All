package Experiences;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RAF {
public WebDriver driver;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver" ,"/Users/geetika/Desktop/Automation/MAC/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://campaign.odicci.com/#/07b160f90af61765802f");
		driver.findElement(By.id("429")).click();
		driver.findElement(By.id("429")).sendKeys("Geetika");
		driver.findElement(By.id("430")).click();
		driver.findElement(By.id("430")).sendKeys("Geetika");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("1993geetika@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div[6]/div[2]/div")).click();
		driver.get("https://campaign.odicci.com/#/fa2346e120ae828980b0?fh=a8fa829aa0cb049a0b17f67c96bb519a2a687bd7");
		driver.findElement(By.id("429")).click();
		driver.findElement(By.id("429")).sendKeys("Geetika");
		driver.findElement(By.id("430")).click();
		driver.findElement(By.id("430")).sendKeys("Geetika");
		driver.findElement(By.id("427")).click();
		driver.findElement(By.id("427")).sendKeys("geetika.5@tcs.com");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"textTagBox\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"specialEmodule\"]/div[8]/button")).click();
	}
	
	
	
}
