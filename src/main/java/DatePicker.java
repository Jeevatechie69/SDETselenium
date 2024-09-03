import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {

	static void selectMonthandYear(WebDriver driver,String month,String year) {
		
		 while(true)
		  {
		  String currentmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		  String currentyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		  
		  if (currentmonth.equals(month) && currentyear.equals(year)) {
			  break;
			
		}
		  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		  }
	}
	  //select date
	  static void selectdate(WebDriver driver,String date) {
	 List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
	 for(WebElement dt:dates)
	 {
		 if (dt.getText().equals(date)) {
			dt.click();
		}
	 }
	  }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("24/05/2024");
		  driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		  
		   selectMonthandYear(driver,"July","2024");
		   selectdate(driver,"27");
	}
}
		/*EdgeDriver driver=new EdgeDriver();
		//driver.get("https://www.globalsqa.com/demo-site/datepicker");
		
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("24/05/2024");
		
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']"));

		   driver.get("https://jqueryui.com/datepicker/");
		   driver.switchTo().frame(0);
		   
		   String month="August";
		   String date="25";
		   String year="2024";
		   
		   driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		   selectdate(driver,"25");
		   selectMonthandYear(driver,"September","2024");/*
		   
		 //Select month and year
		  while(true)
		  {
		  String currentmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		  String currentyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		  
		  if (currentmonth.equals(month) && currentyear.equals(year)) {
			  break;
			
		}
		  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		  }
		 // driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		  
		  //select date
		  
		 List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
		 for(WebElement dt:dates)
		 {
			 if (dt.getText().equals(date)) {
				dt.click();
			}
		 }
		 }*/

	


