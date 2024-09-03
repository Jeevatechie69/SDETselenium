import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Browsermethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          EdgeOptions option=new EdgeOptions();
          option.addArguments("--headless=new");
        		  
		 EdgeDriver driver=new EdgeDriver(option);
	      
	      //Get url method -It will not return anything opens the url on the browser
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      
	      Thread.sleep(5000);
	      driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	     
	      Thread.sleep(5000);
	      //driver.close();//It will close the parent browser
	      driver.quit();
	      
	}

}
