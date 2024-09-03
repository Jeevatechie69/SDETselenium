import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Stattictable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EdgeDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Finding total number of rows in a column
		int sizes=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size(); //multiple table
		System.out.println(sizes);
		
		int size1=driver.findElements(By.tagName("tr")).size();   //single table
		System.out.println(size1);
		
		//Finding the total number of columns
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th")).size();
		System.out.println(columns);
		int column1=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th")).size();
		System.out.println(column1);
		
		//Read specific record
		String text=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td[1]")).getText();
		System.out.println(text);
		
		String text2=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[6]//td[3]")).getText();
		System.out.println(text2);
		
		//Read all the data
		for(int r=2;r<=size1;r++) {
			
			for(int c=1;c<=column1;c++) {
				String text3=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
				//Passing parameters into the xpath we should add +r+ +c+
				System.out.println(text3+"\t");

		}
			System.out.println();
		}
		
		//Print book names whose author is mukesh
		for(int r=2;r<=size1;r++) {
			String text4=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+")//td[2]")).getText();
			if (text4.equals("Mukesh")) {
			String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+")//td[1]")).getText();
			System.out.println(bookname);

			}
		}
		

	}

}
