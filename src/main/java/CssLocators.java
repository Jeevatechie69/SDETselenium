import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   EdgeDriver driver=new EdgeDriver();
		   
		   driver.get("https://demo.nopcommerce.com/");
		   
		   //tagid tag#id
		   //css=tag#id
          driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Oversizedt-shirt");
		   driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Oversizedt-shirt");
		   
		   //tag.classname
		   //css=tag.class
		   driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Oversizedt-shirt");
		   driver.findElement(By.cssSelector("search-box-text")).sendKeys("Oversizedt-shirt");
		   
		   //tagattribute
		   //css=tag[attribute=value]
          // driver.findElement(By.cssSelector("input[placeholder='Search Store')]")).sendKeys("Tshirts");
		   
		   //TagClassattribute
		   //css=tag.class[attribute=value]
		   driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Tshirts");
		   //input.search-box-text ui-autocomplete-input after the space if there is any text it is not considered
		   //it will get truncated input.search-box-text ui-autocomplete-input you wont find 
		   //you can find input.search-box-text with this search
         
	}

}
