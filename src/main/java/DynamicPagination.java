import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://demo.opencart.com/admin/index.php");
		WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[@class='parent- collapsed'][normalize-space()='Customers'")).click();
		driver.findElement(By.xpath("ul[@id=collapse-5']//a[contains(text(),Customers)]"));
		
		
		//To find the toyal number of pages
		//String s="Showing 1 to 10 of 19081 (13232 Pages)";
		//s.substring(s.indexOf("(")+1,s.indexOf("Pages")-1 );
		
		//Showing 1 to 10 of 19081 (13232 Pages)
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6-text-end")).getText();
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1 ));
		
		//repeating pages
		
		for(int p=1;p<=total_pages;p++) {
			if(p>1) {
				WebElement activepage=driver.findElement(By.xpath("//ul[@class='pagination']//text()="+p+""));
				activepage.click();
				
			}
			
			//reading data from the page
			
			int noofrows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover]//tbody//tr")).size();
			
			for(int r=1;r<=noofrows;r++) {
				String s1=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover]//tbody//tr["+r+"//td[2]")).getText();
			}
			}
			
		
		
		
		
		
	}

}
