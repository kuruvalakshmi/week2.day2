package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Leaftaps {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
		//max browser
		driver.manage().window().maximize();
		//enter the username
		driver.findElement (By.id("username")).sendKeys("Democsr");
		//enter the password
		driver.findElement (By.id("password")).sendKeys("crmsfa");
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crmsfa button
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on the contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//click on merge contact
		driver.findElement(By.linkText("Merge Contacts")).click();
		//click on widget of the form contact
		driver.findElement(By.xpath("//img[contains(@alt,'Look')][1]")).click();
		Thread.sleep(1000);
		Set<String> allwindow = driver.getWindowHandles();
	
		List<String>windowaddress= new ArrayList (allwindow);
		
		driver.switchTo().window(windowaddress.get(1));
		System.out.println(driver.getTitle());
	
		//click on the first resulting contact
		driver.findElement(By.xpath("//a[text()='12177']")).click();
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
