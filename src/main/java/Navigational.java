import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.edge.EdgeDriver;

public class Navigational {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//Navigate().to();

		 EdgeDriver driver=new EdgeDriver();
	      
	      //Navigate to method 
	      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      
	    //Navigate to method with object url
	      URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.navigate().to(myurl);
	      
	    //Navigate back()
	      
	      
	      
	}

}
