import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Table = driver.findElement(By.xpath("//table[@name='courses']"));
		System.out.println("TOTAL NUMBER OF ROWS AVAILABLE IN THE TABLE IS:" + Table.findElements(By.xpath("//table[@name='courses']//tr")).size());
		System.out.println("TOTAL NUMBER OF COLUMNS AVAILABLE IN THE TABLE IS:" + Table.findElements(By.xpath("//table[@name='courses']//th")).size());
		String secondrow = driver.findElement(By.xpath("//table[@name='courses']//tr[3]")).getText();
		System.out.println("The second row text is:"+secondrow);
		String [] splitted = secondrow.split(" ");
		System.out.println("Text in Instructor column is: "+ splitted[0]+" " +splitted[1]);
		String dataForcolumntwo = " ";
		
		for(int i=2;i<11;i++)
		{	
		dataForcolumntwo = dataForcolumntwo+" "+ splitted[i];		
		}
		System.out.println("Text in Course column is: "+ dataForcolumntwo);
		System.out.println("Text in Price column is: "+ splitted[11]);		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
