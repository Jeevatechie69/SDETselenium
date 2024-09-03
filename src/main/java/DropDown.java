import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdownele=driver.findElement(By.xpath("//select[@id='country']"));
		Select drop=new Select(dropdownele);
		drop.selectByVisibleText("Japan");
		//drop.selectByValue("japan");
		//drop.selectByIndex(2);
		
		List<WebElement> option=drop.getOptions();
		System.out.println(option.size());
		
		for(int i=0;i<=option.size()-1;i++) {
			System.out.println(option.get(i).getText());
		
		}*/
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		//driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		//select one option
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//select multiple option
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		int size=options.size();
		System.out.println(size);
		//ul[@class='multiselect-container dropdown-menu']//li//a//label
		for(WebElement op:options) {
			
			String text=op.getText();
			System.out.println(text);
	       if(text.equals("MySQL")) 
	       
	       {
	    	op.click();
	       }
				
			
			
			
			
		}
		}
		
		
	

}
