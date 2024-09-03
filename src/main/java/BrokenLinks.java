import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        WebDriver driver=new EdgeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
       for(WebElement linkelement:links) {
    	   
       String alllink=linkelement.getAttribute("href");	
       
       
       if(alllink ==null || alllink.isEmpty())
       {
    	   System.out.println("href is null");
       }
       try {
       URL url=new URL(alllink);//converted href value into the link
       HttpURLConnection conn=(HttpURLConnection) url.openConnection();//open the connection to the server
       conn.connect();//connect to the server and sent request to the server
       
       if(conn.getResponseCode()>=400) {
    	   System.out.println("brokenlink");
       }
       else {
    	   System.out.println("Not a broken link");
       }
       }
       catch(Exception e)
       {
    	   
       }
       
       }
	}
}
    
		
	
	


