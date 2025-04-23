package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// initialize the webdriver
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/.");
		//maximize the browser window
		driver.manage().window().maximize();
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on the "CRM/SFA" link
		driver.findElement(By.xpath("//*[@id=\"label\"]/a")).click();
		//click on the leads tab
		driver.findElement(By.linkText("Leads")).click();
		//click on the create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		//enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		//enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//enter a company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//enter a title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		//click create lead button
		driver.findElement(By.name("submitButton")).click();
		//verify the tittle
		String title = driver.getTitle();
			System.out.println("Title of the page is "+ title);
		
	
		

		
		
		
		
		

	}

}
