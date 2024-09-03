import java.io.File;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.AddHasExtensions;

public class HandleSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*EdgeOptions option=new EdgeOptions();
        option.setAcceptInsecureCerts(true);
        EdgeDriver driver=new EdgeDriver(option);
       
        driver.get("https://expired.badssl.com/");
        
        
       //accepts ssl certificate
		
	    driver.get("https://expired.badssl.com/");*/
	    
       /* EdgeOptions option2=new EdgeOptions();
        option2.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); //message will be removed aotomation is being controlled by software
        EdgeDriver driver=new EdgeDriver(option2);
        driver.get("https://demo.nopcommerce.com/");*/
		
      /*  EdgeOptions option2=new EdgeOptions();
        option2.addArguments("--inprivate");  //in chrome use --inprivate instead incognito
        EdgeDriver driver=new EdgeDriver(option2);
        driver.get("https://demo.nopcommerce.com/");*/
		
		EdgeOptions option2=new EdgeOptions();
		File file=new File("C:/Users/Jeeva/Desktop/Selenium/SelectorsHub.crx");
		option2.addExtensions(file);
		EdgeDriver driver=new EdgeDriver(option2);
		driver.get("https://demo.nopcommerce.com/");

		/*EdgeOptions option2=new EdgeOptions();
		File file=new File("C:/Users/Jeeva/Desktop/Selenium/uBlock.crx");
		option2.addExtensions(file);
		EdgeDriver driver=new EdgeDriver(option2);
		driver.get("https://text-compare.com/");*/
		
		
	}

}
