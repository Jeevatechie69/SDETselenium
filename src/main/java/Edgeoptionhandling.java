import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edgeoptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--headless=new");
		EdgeDriver driver=new EdgeDriver(option);
	
	    driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:/Users/Jeeva/Documents/Selenium Notes/Action.txt");
	    if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Action.txt")){
	    	
	    	System.out.println("File Uploaded Successfully");
			
		}
	    else {
	    	System.out.println("Not Uploaded");
	    }
	        
	        
	}

}
