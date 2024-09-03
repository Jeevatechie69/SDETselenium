import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
	            "webdriver.edge.driver",
	            "C:\\Chrome\\edgedriver_win64\\msedgedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver =new EdgeDriver();
	       
	        // Launch Website
	        driver.get("https://demo.opencart.com/");
	        driver.manage().window().maximize();//maximize the window
	        
	      //name  driver.findElement(By.name("search")).sendKeys("Mac");
	        
	      //ID boolean isdisplayed= driver.findElement(By.id("logo")).isDisplayed();
	      // System.out.println(isdisplayed);
	       
	       //Linktext and PartialLinktext
	        driver.findElement(By.linkText("Tablets")).click();
	        
	        //Partial link text part of the linkedtext
	        
	       // driver.findElement(By.partialLinkText("Tab")).click();
	        
	        //Whenever you want to capture multiple webelements you want to use findelements
	        //Finding the total no of links in header
	       /*List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
	       int totallinks=headerlinks.size();
	       System.out.println(totallinks);*/
	        
	        
	       
	       //if you want to store multiple things into a variable go for list elements 
	       //Why they didn't use set whenever using elements there might be a chance of getting duplicates so they are using
	       //list and set doesn't allow duplicates
	        
	        //tagname is used to locate group of webelements
	        
	       List<WebElement>links=driver.findElements(By.tagName("a"));
	       System.out.println(links.size());
	       
	       //Totalno.of images
	       List<WebElement> image=driver.findElements(By.tagName("img"));
	       System.out.println(image.size());
	       
	       
	       
	       
	        
	        
	        
	        
	       
	        
	        
	        
	        
	}

}
