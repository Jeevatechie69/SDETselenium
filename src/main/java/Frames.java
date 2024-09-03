import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		   
		   driver.get("https://ui.vision/demo/webtest/frames/");
		   driver.manage().window().maximize();
		   
		  
		   
		 /*  //Passed frame as a weblelement
		   WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		   driver.switchTo().frame(frame1);
		   
		   driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("India");
		   driver.switchTo().defaultContent();//It go backs to the mainpage it will come from frame1
		   //we can't switch from one frame to another frame
		   
		   
           //Frame2
		   WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		   driver.switchTo().frame(frame1);
		   driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Jeeva");
		   driver.switchTo().defaultContent();*/
		   
		   //Interacting with inneriframe
		   //Frame3
		   WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		   driver.switchTo().frame(frame3);
		   driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hardik");
		   
		   //Inneriframe which is part of frame3
		   driver.switchTo().frame(0);   
		   
		   
		   
		   
		   
		   
		   
		   

	}

}
