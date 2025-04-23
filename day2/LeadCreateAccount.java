package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeadCreateAccount {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver(); 
		       // load the url
				driver.get("http://leaftaps.com/opentaps/.");

				// enter the username
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				// enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				// click on the login button
				driver.findElement(By.className("decorativeSubmit")).click();
				// click on the CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				// click on the accounts tab
				driver.findElement(By.linkText("Accounts")).click();
				// click on the create account
				driver.findElement(By.linkText("Create Account")).click();
				// enter an account name
				driver.findElement(By.id("accountName")).sendKeys("Lakshmi");
				// enter the description  
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				// Handling Dropdown
				//step 1 find the element
				WebElement sourceElement = driver.findElement(By.name("industryEnumId"));
				//step 2 create object the select class
				Select dropdown=new Select (sourceElement);
				dropdown.selectByIndex(3);
				
				WebElement sourceEle = driver.findElement(By.name("ownershipEnumId"));
				Select option=new Select (sourceEle);
				option.selectByVisibleText("S-Corporation");
				
				WebElement sourWebEle = driver.findElement(By.id("dataSourceId"));
				Select position=new Select (sourWebEle);
				position.selectByValue("LEAD_EMPLOYEE");
				
				WebElement sourElement = driver.findElement(By.id("marketingCampaignId"));
				Select camdropdown=new Select(sourElement);
				camdropdown.selectByIndex(5);
				
				
				WebElement sourEle = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select statedropdown=new Select(sourEle);
				statedropdown.selectByValue("TX");
				
				//click on the create account button
				driver.findElement(By.className("smallSubmit")).click();
			
			
				 //verify the title
				  String title = driver.getTitle();
					System.out.println("Title of the page is "+title);
					//verify the account name
			
					
				//close the browser window
				driver.quit();
				  
			
				
				
				
		

	}

}
