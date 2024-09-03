import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Jeeva");
		Actions act=new Actions(driver);
		//Ctrl+A
		/*act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Ctrl+C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//TAB
		act.keyDown(Keys.TAB).keyDown(Keys.CONTROL).perform();
		
		//Ctrl+V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();*/
		
	    //Ctrl+Shift+A
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();
		
		act.keyDown(Keys.TAB).keyDown(Keys.CONTROL).perform();
		
		
		//Enter
		act.keyDown(Keys.ENTER).keyDown(Keys.ENTER).perform();
	}

}
