package testng;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngtest3 {
	
	@Test(groups={"smoke"})
	
	public void Car ()
	{
		System.out.println("This is a test 3");
	}
	
	@BeforeTest
	public void car2 ()
	{
		System.out.println("Before Test of 3");
	}
	

}
