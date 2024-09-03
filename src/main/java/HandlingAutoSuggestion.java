import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		//List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div//img[@class='uHGFVd AZNDm']"));
		//List<WebElement> list1=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='a5RLac']"));
		System.out.println(list1.size());
		
		for(int i=0;i<list1.size();i++) {
		      String text=list1.get(i).getText();
		      System.out.println(text);
		}

	}

}
