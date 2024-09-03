import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Tabsandwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		//Selenium4.x
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://text-compare.com/");

	}

}
