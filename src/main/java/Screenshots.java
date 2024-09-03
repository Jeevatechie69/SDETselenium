import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		EdgeDriver driver=new EdgeDriver();
		//driver.get("https://demo.nopcommerce.com/login");
		//driver.manage().window().maximize();
		
		//Take screenshot
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File("C:/Users/Jeeva/Pictures/Screenshots.Jeeva.png");
		//if you want to use the same project location file to store the screensgot
		//File targetfile=new File("System.getProperty("user.dir")+/Screenshots.Jeeva.png");
        sourcefile.renameTo(targetfile);*/
        
        //Take screensshot on the specific area of the page
        //Below steps are introduced from selenium 4
		driver.get("https://demo.nopcommerce.com/computers");
		driver.manage().window().maximize();
       /* WebElement specificpage= driver.findElement(By.xpath("//div[@class='page category-page']"));
        File source1=specificpage.getScreenshotAs(OutputType.FILE);
        File destination1=new File("C:/Users/Jeeva/Pictures/Screenshots.specific.png");
       source1.renameTo(destination1);*/
       
       //Take screenshot from the specific Webelement
	  WebElement  webelementscreenshot=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
	 File source2=webelementscreenshot.getScreenshotAs(OutputType.FILE);
	 File destination2=new File("C:/Users/Jeeva/Pictures/ScreenshotsWenelement.png");
	 source2.renameTo(destination2);
       
        
	}

}
