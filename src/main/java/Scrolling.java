import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //setzoomlevel 50%
        
        js.executeScript("document.body.style.zoom='50%'");
        //Scroll down by pixelnumber
      
        js.executeScript("window.scrollBy(0,1500)", "");
        System.out.println(js.executeScript("return.window.pageYOffset;"));
        
        //Scroll page till the element is visible
        WebElement ele=driver.findElement(By.xpath("//div[strong='Community poll']"));
        js.executeScript("arguements[0].scrollIntoView()", ele);
        System.out.println(js.executeScript("return.window.pageYOffset;"));
        
        //Scroll page till the end of the page
        
        js.executeScript("window.scrollBy(0,document.body.scrollheight)");
        System.out.println(js.executeScript("return.window.pageYOffset;"));
        
        //Scrollingupto initialposition
        js.executeScript("window.scrollBy(0,-document.body.scrollheight)");
        
        //if it is horizontalscroll bar instead of scrollheight use scrollwidth
        
      
        
        
        
       
       
        
        
        
	}

}
