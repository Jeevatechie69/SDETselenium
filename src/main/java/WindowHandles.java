import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("/a[normalize-space()='OrangeHRM',  Inc")).click();
		
		//Approach 1 when you have two browsers
		Set<String> windowID=driver.getWindowHandles();
		
		List<String> list=new ArrayList(windowID);
		String Parent=list.get(0);
		String child=list.get(1);
		
		//If you use get title it will show the parent title so if you need child title
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		//Approach2
		for(String winID:windowhandles)
		{
			String 
		}
		
		
		
	}

}
