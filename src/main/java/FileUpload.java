import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
	    driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:/Users/Jeeva/Documents/Selenium Notes/Action.txt");
	    if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Action.txt")){
	    	
	    	System.out.println("File Uploaded Successfully");
			
		}
	    else {
	    	System.out.println("Not Uploaded");
	    }
	
	    /*
	     * //To upload multiple files
	     */
	    String file1=("C:\\Users\\Jeeva\\Documents\\Selenium Notes\\Class.txt");
	    String file2=("C:\\Users\\Jeeva\\Documents\\Selenium Notes\\Exception.txt");
	    
	    driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	    
	   int totalsize= driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
	   System.out.println(totalsize);
	   
	   if(totalsize==2) {
		   
		   System.out.println("All files are uploaded");
	   }
	   
	   

	      
		
		
	}

}
