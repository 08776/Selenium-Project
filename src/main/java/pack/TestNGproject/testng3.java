package pack.TestNGproject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class testng3 extends BaseClass {
	
	@BeforeClass
	private void first()
	{
		System.out.println("Launch browser");
		launchbrowser();
		
	}
	
	@Test
	private void tng1()
	{
		launchURl("https://www.instagram.com/explore/");
	}
	@Test
	private void tng3()
	{
		launchURl("https://www.flipkart.com/");
	}
	@Test
	private void tng2()
	{
		launchURl("https://inmakeslh.in/index.php");
	}
	
	@AfterClass
	private void last()
	{
		System.out.println("close browser");
		closeentirebrowser();
	}
	

}
