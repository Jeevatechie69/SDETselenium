import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		/*driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement automationtools=driver.findElement(By.xpath("//button[normalize-space()='Automation Tools']"));
		WebElement selenium=driver.findElement(By.xpath("//a[normalize-space()='Selenium']"));
		
		Actions action=new Actions(driver);
		//In action class we need to add driver as a parameter itis expecting driver
		action.moveToElement(automationtools).moveToElement(selenium).click().build().perform();*/
		
		/*EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement login=driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		WebElement orders=driver.findElement(By.xpath("//a[normalize-space()='Orders']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(login).moveToElement(orders).click().build().perform();*/
		
		//Rightclick
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick).build().perform();
		WebElement copy=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
		copy.click();
		driver.switchTo().alert().accept();*/
		
		//Doubleclick
		/*
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick=driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).build().perform();
		driver.switchTo().alert().accept();*/
		
		/*//Drag and Drop
		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		 driver.manage().window().maximize();
		WebElement drag2=driver.findElement(By.xpath("//span[normalize-space()='Draggable 2']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag2, drop).build().perform();)*/
		
		//Datepicker
		
	   driver.get("https://jqueryui.com/datepicker/");
	   driver.switchTo().frame(0);
	   
	   String month="June";
	   String date="29";
	   String year="2024";
	   
	   driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	   
	  
	  while(true)
	  {
	  String currentmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	  String currentyear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	  
	  if (currentmonth.equals(month) && currentyear.equals(year)) {
		  break;
		
	}
	  driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
	  }
	  driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
	  
	  //select the date
	  
	 List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td/a"));
	 for(WebElement dt:dates)
	 {
		 if (dt.getText().equals(date)) {
			dt.click();
		}
	 }
	 }


	   
	   
	   
	   
		
		

		
		
		
		

	

}
