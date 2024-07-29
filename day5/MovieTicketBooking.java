package week2.day5;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class MovieTicketBooking {

	
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				//Handling Browser Notification PopUp
				ChromeOptions option = new ChromeOptions();
				//EdgeOptions option = new EdgeOptions();
				option.addArguments("--disable-notification");
						
				//Chrome Driver setup for Launch browser 
				ChromeDriver objBrowser = new ChromeDriver(option);
				//EdgeDriver objBrowser = new EdgeDriver(option);			
				// Navigate PVR Cinemas
				String uRlData = "https://www.pvrcinemas.com";
				objBrowser.get(uRlData);
				
				//Maximize the window
				objBrowser.manage().window().maximize();
				
				//initiate implicit wait
				objBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Choose Your location as "Chennai"
				objBrowser.findElement(By.xpath("//h6[text()='Chennai']")).click();
				Thread.sleep(2000);
						
				//Click on Cinima under Quick Book
				objBrowser.findElement(By.xpath("//span[text()='Cinema']")).click();
				
				//Select Your Cinima
				objBrowser.findElement(By.xpath("//span[text()='Select Cinema']")).click();
				Thread.sleep(1000);//throws InterruptedException - Static wait
				objBrowser.findElement(By.xpath("//span[contains(text(),'INOX Chennai Citi Centre')]")).click();
				Thread.sleep(2000);//throws InterruptedException
				
				//Select Your Date 
				objBrowser.findElement(By.xpath("//span[text()='Select Date']")).click();
				objBrowser.findElement(By.xpath("//span[text()='Select Date']")).click();
				//Thread.sleep(1000);//throws InterruptedException
				objBrowser.findElement(By.xpath("//span[contains(text(), 'Wed')]")).click();
				//objBrowser.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();
				//Thread.sleep(2000);//throws InterruptedException
				
				//Select Your Movie
				objBrowser.findElement(By.xpath("//span[text()='Select Movie']")).click();
				objBrowser.findElement(By.xpath("//span[text()='Select Movie']")).click();
				
				objBrowser.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();
				//Thread.sleep(2000);
				
				//Select Your Show Time
				objBrowser.findElement(By.xpath("//span[text()='Select Timing']")).click();
				objBrowser.findElement(By.xpath("//span[text()='Select Timing']")).click();
				objBrowser.findElement(By.xpath("//span[contains(text(),'11')]")).click();
		 
				// Click the book button
				objBrowser.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(1000);
				
				// Click Accept 
		        objBrowser.findElement(By.xpath("//button[text()='Accept']")).click();
				Thread.sleep(1000);
		        
				// Click Accept on Term and Condition
				objBrowser.findElement(By.xpath("//button[text()='Accept']")).click();
				Thread.sleep(2000);
		       
				// Click any one available seat
				objBrowser.findElement(By.xpath("(//span[@class='seat-current-pvr'])")).click();
				Thread.sleep(2000);
				
		        // Print summary
				String summary = objBrowser.findElement(By.className("summary-movies-content")).getText();
		        System.out.println("Booking summary: "+summary);
		        
		        // Print Select seat number
		        String seatNo = objBrowser.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		        System.out.println("Booking Seat No: "+seatNo);
		        
		        // Print total amount
		        String priceTotal = objBrowser.findElement(By.className("grand-prices")).getText();
		        System.out.println("Total Amount: "+priceTotal);
		        
		        // Click Proceed button
		        objBrowser.findElement(By.xpath("//div[@class='register-btn']/button")).click();
		        Thread.sleep(2000);
		        
		        // Print grand total
		        String grandTotoal = objBrowser.findElement(By.xpath("//div[@class='grand-tota col-md-3']//following::span")).getText();
		        System.out.println("Grand Total: "+grandTotoal);
		        
		        if (priceTotal.contains(grandTotoal)) {            
		            System.out.println("Both Price Total and Grand Total are same");           
		        }
		        
		        // Click Proceed button
		        objBrowser.findElement(By.xpath("//button[text()='Proceed']")).click();
		        Thread.sleep(1000);
		        
		        // Close the popup                 
		       // objBrowser.findElement(By.xpath("(//i[@class='pi pi-times'])")).click();*/
		        
		        // Close the popup  
		        Actions builder = new Actions(objBrowser);
				WebElement closeBtn = objBrowser.findElement(By.xpath("(//i[@class='pi pi-times'])"));
				builder.moveToElement(closeBtn).build().perform();
				builder.click(closeBtn);
				
		        
		        //get the Title
		        System.out.println("Page Title:= "+ objBrowser.getTitle());  
		        
		        objBrowser.close(); //close application
		        
			}

	}


