import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set <String> windows = driver.getWindowHandles();
		java.util.Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String ChildID =it.next();
		
		driver.switchTo().window(ChildID);		
		System.out.println("Text in child window is: " + driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		driver.switchTo().window(parentID);
		System.out.println("Text in parent window is: "+ driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
		driver.quit();
		
		

	}
	
}
