import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EdgeDriver driver=new EdgeDriver();
       driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
      WebElement min= driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
       System.out.println(min.getLocation());
       Actions act=new Actions(driver);
       act.dragAndDropBy(min, 50, 251).perform();
       System.out.println(min.getLocation());
       //horizontal direction y axis is constant move in vertical direction xaxis is constant
       //In this we can increase the x  axis we can't reduce the x axis
       //we can decrease the y  axis we can't increase the x axis
      WebElement max= driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
      System.out.println(max.getLocation());
      act.dragAndDropBy(max, -100, 251).perform();
      System.out.println(max.getLocation());
       

	}

}
