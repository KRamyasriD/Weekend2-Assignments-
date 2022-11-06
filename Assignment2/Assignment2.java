package week2.Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			//* 1	Launch the browser
			 WebDriverManager.chromedriver().setup();
			 ChromeDriver driver=new ChromeDriver(); 
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 
			 // Maximise the window
				driver.manage().window().maximize();
							
			 //		Enter the username
				driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("Democsr2");

				
				//	Enter the password
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

				
				// Click Login
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				//	Click crm/sfa link
				driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

				//Click contacts link
				driver.findElement(By.xpath("//a[text()='Leads']")).click();

                //Click Contacts Tab
				
				driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]/a")).click();
				
				//Click Create Contact
				driver.findElement(By.linkText("Create Contact")).click();
				
				
				//Type First Name
				driver.findElement(By.xpath("//input[@id=\"firstNameField\"]")).sendKeys("Test");
							
				
				//Type Last Name
				driver.findElement(By.xpath("(//input[@name=\"lastName\"])[3]")).sendKeys("Conts");
				
				
				//Click Create Contact Button
				driver.findElement(By.className("smallSubmit")).click();
				
				
				//Print the first name and browser title 
				
				String Firstname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
				
				String title = driver.getTitle();
				System.out.println("Page Title is " + title);
				System.out.println("FirstName is " + Firstname);
				
				//Close the browser  
				driver.quit();  // getting error when i used close() funtion so using quit 
				
				
		}
					
		

	}
