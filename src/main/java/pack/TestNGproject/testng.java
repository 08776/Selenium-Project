package pack.TestNGproject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testng {
	@Test
	private void tc1() {
		System.out.println("TC1");
	}
	@Test
	private void tc2() {
		System.out.println("TC2");
	}
	@Test
	private void tc3() {
		System.out.println("TC3");
	}
	@BeforeMethod
	private void startdate() {
		System.out.println("start");
	}
	@AfterMethod
	private void end() {
		System.out.println("end");
	}
	@BeforeClass
	private void before() {
		System.out.println("Launch Browser");
	}
	@AfterClass
	private void after() {
		System.out.println("close browser");
	}

}
