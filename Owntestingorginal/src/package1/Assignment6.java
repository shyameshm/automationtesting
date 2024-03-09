package package1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Selecting Checkbox
		driver.findElement(By.name("checkBoxOption2")).click();
		//Getting label name
		String labelname = driver.findElement(By.xpath("//body/div[1]/div[4]/fieldset[1]/label[2]")).getText();
		
		//Selecting dropdown value
		WebElement dropdownEx = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Select dropdown = new Select (dropdownEx);
		dropdown.selectByVisibleText(labelname);
		
		//Entering value in the field
		driver.findElement(By.id("name")).sendKeys(labelname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn-style'][1]")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		
		if (alertText.contains(labelname))
		{
			System.out.println("The text is available in the alert message.");
		}
		
		else
			
		{
			System.out.println("The text is not available in the alert message");
		}
		Thread.sleep(1000);
		driver.quit();
		
}
}
