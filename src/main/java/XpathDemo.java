import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver =new EdgeDriver();
	       
	        // Launch Website
	       
	       
		 driver.get("https://demo.nopcommerce.com/");
	        //Xpath with single attribute
	        driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("Tshirt");
	        
	        //Xpath with multiple attributes
	        
	        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Jeanspant");
	        
	        //Xpath with AND operators
	        driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Jeanspant");
	        //both the attribute should be true
	        
	        //Xpath with OR operators
	        //anyone of  the attribute should be true
	        driver.findElement(By.xpath("//input[@name='search' or @placeholder='xyz']")).sendKeys("Jeanspant");
	        
	        //Xpath with  innertext
	        driver.findElement(By.className("//img[text()='Desktops']")).click();
	        driver.findElement(By.className("//h3[text()='MacBook']")).click();
	        
	        Boolean displayed=driver.findElement(By.className("//h3[text()='MacBook']")).isDisplayed();
	        System.out.println(displayed);
	        
	        String gettext=driver.findElement(By.className("//h3[text()='MacBook']")).getText();
	        System.out.println(gettext);
	        
	        //xpath with contains method
	        driver.findElement(By.className("input[contains(@placeholder,'Sea')]")).sendKeys("Tshirt");
	        
	        //xpath with startswith() method
	        driver.findElement(By.className("input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");
	        
	        //Chained xpath
 
	        Boolean displayed1=driver.findElement(By.className("//div[@id='logo']/a/img']")).isDisplayed();
	}

}
