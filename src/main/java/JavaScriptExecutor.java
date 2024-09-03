
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // WebDriver driver=new Chromedriver();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        //Webdriver is a different interface with the chromedriver so we are using upcasting
        //WebDriver driver=new Chromedriver();

        //JavascriptExecutor js=(JavascriptExecutor)driver;
        //Parentclass variable is holding child class variable so we are assigning directly
        //It is possible only when you create like this   ChromeDriver driver=new ChromeDriver();
        
        JavascriptExecutor js1=driver;
        //Using setAttribute nstead of sendkeys
        WebElement name=driver.findElement(By.xpath("//input[@id='name']"));   
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','John')",name);
        
        //If you get element intercepted exception when you use click method and sendkeys method then prefer javascriptexecutor
        //arguments-it will store variablename,setattribute will set the value
        
        //Clicking on element instead of click()
        WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']")); 
        js.executeScript("arguments[0].click()",radiobtn);
      
        
        

        
        
        

	}

}
