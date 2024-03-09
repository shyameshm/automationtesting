package testng;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngtest4 {
	
	@Test
	
	public void Laptop1 ()
	{
		System.out.println("This is a test");
	}
	
	@BeforeTest
	public void Laptop2 ()
	{
		System.out.println("Before Test of 4");
	}
	

}
