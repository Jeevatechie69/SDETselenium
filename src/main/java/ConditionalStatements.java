import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		//WebElement img=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println(img.isDisplayed());
		
	//boolean disp=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	//System.out.println(disp);
		//Boolean isdisp=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(isdisp);
	
	Boolean selected=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
	System.out.println(selected);
		
		//Boolean isEnabled=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println(isEnabled);
		
		//boolean isSelected=driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		//System.out.println(isSelected);
	
		
		//boolean isSelected1=driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
		//System.out.println(isSelected);
		
		//CheckBoxes
		//boolean isSelected2=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		//System.out.println(isSelected2);
		
		
		
		
		
	}

}
