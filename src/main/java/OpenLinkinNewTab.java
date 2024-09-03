import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkinNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act =new Actions(driver);
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		//switch to registration page
		List<String> window=new ArrayList(driver.getWindowHandles());
		window.get(1);
		driver.switchTo(window.get(1));
		
		//switch to home page
		driver.switchTo(window.get(0));
		
		
	}

}
