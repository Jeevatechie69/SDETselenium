import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class ImpilcitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         EdgeDriver driver=new EdgeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.manage().window().maximize();
         driver.close();
         
         

	}

}
