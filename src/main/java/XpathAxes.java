import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // Instantiate a ChromeDriver class.
        WebDriver driver =new EdgeDriver();
       
        // Launch Website
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();//maximize the window
        
       //Self
        String text=driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/self::a")).getText();
        System.out.println(text);
        
        /*//Parent
        String text1=driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/parent::td")).getText();
        System.out.println(text1);
        
        //Ancestor
        String text2=driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr")).getText();
        System.out.println(text2);
        
        //Child    //Navigating to the ancestor and finding the child
        List<WebElement> child=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/child::td")).size();
        System.out.println(child.size());
        
        //Descendant (Select all the descendants (Children,grandchildren,etc..)
        List<WebElement> descendant=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/descendant::td")).size();
        System.out.println(descendant.size());
        
        //Following
     List<WebElement> follow=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/following::tr")).size();
     System.out.println("follow");
        
     //Following Sibling
     List<WebElement> followsibling=driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/following-sibling::tr")).size();
     System.out.println(followsibling);
     
     //Preceding
     List<WebElement> preceding1 =driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/preceding::tr")).size();
     System.out.println(preceding1);
     
     
   //PrecedingSibling
     List<WebElement> preceding= driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/preceding-sibling::tr")).size();
     System.out.println(preceding);
        */
        
        
        
	}

}
