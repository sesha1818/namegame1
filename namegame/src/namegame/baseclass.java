package namegame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class baseclass {
	
	
	  @Test(priority = 1) public void namegametitle()
	  {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
	  WebDriver driver= new
	  ChromeDriver(); driver.manage().window().maximize();
	  driver.get("http://www.ericrochester.com/name-game/");
	  if(driver.getPageSource().contains("name game")){
	  System.out.println("Text is present"); }else{
	  System.out.println("Text is absent"); } driver.close(); 
	  }
	 
	
	@Test(priority = 2)
	public void validatestreakcount() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ericrochester.com/name-game/");
		driver.findElement(By.id("//div[contains(text(),'2')]")).click();
		List products = driver.findElements(By.className("streak"));
		//display count 
		System.out.println("Count of Featured Courses page is:"+products.size() );
		}
		
	@Test(priority = 3)
	public void validatecorrectstreakcount(String streakId) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ericrochester.com/name-game/");
		driver.findElement(By.xpath("//a[contains(@streak, '"+streakId+"')]//div[@class='select-streak']")).click();
		System.out.println("Selected image : "+streakId);
		}
	
	@Test(priority = 4)
	@SuppressWarnings("null")
	public void validatephotodisplayedisEnabled() throws TimeoutException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ericrochester.com/name-game/");
		Boolean Display = driver.findElement(By.xpath("//div[contains(text(),'1')]")).isDisplayed();
		//To print the value
		System.out.println("Element displayed is :"+Display);
		//isEnabled() method returns boolean value either True or False 
		Boolean Enable = driver.findElement(By.xpath("//div[contains(text(),'1')]")).isEnabled();
		System.out.println("Element enabled is :"+Enable);
		System.out.println("Checking photo displayed is enabled");
		WebElement validatephotodisplayedisEnabled = null;
		Assert.assertTrue(validatephotodisplayedisEnabled.isEnabled(), "count the enabled");
		System.out.println("values are counted correct");
	}
	
		

}
