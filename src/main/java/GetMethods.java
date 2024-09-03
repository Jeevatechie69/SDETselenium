import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 EdgeDriver driver=new EdgeDriver();
      
      //Get url method -It will not return anything opens the url on the browser
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      Thread.sleep(5000);
      
      //GetTitle()-returns the title of the page
     // System.out.println(driver.getTitle());
    //  System.out.println(driver.getTitle());
      
      
      //GetCurrentUrl
     // System.out.println(driver.getCurrentUrl());
     // System.out.println(driver.getCurrentUrl());
      
      //GetPageSource
      //System.out.println(driver.getPageSource());
      
     //GetWindowHandle
     //String windowhandle= driver.getWindowHandle();
    // System.out.println(windowhandle);
     // String window=driver.getWindowHandle();
     // System.out.println(window);
     
     //GetWindowHandles
     driver.findElement(By.linkText("OrangeHRM, Inc")).click();
   // Set<String> id= driver.getWindowHandles();
   // System.out.println(id);*/
     Set<String> handles= driver.getWindowHandles();
     System.out.println(handles);
     
   
    
      
	}

}
