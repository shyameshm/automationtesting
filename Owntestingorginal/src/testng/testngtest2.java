package testng;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngtest2 {
	
	@Test(groups={"smoke"})
	public void mobApp ()
	{
		System.out.println("This is a test 2");
	}
	
	@BeforeTest
	public void mobApp1 ()
	{
		System.out.println("Before Test of 2");
	}
	

}
