package pack.TestNGproject;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng2 extends BaseClass  {
	
	@Test
	private void tng1()
	{
		System.out.println("TESTCASE11");
	}
	@Test
	private void tng3()
	{
		System.out.println("TESTCASE22");
	}
	@Test
	private void tng2()
	{
		System.out.println("TESTCASE33");
	}
	

}
