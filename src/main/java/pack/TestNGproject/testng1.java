package pack.TestNGproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng1 extends BaseClass {
	
	@DataProvider(name="sample data")
	private Object[][] data(){
		return new Object[][] {
			{"velmurugan@0903","123456"},
			{"velan@0903","12345"},
			{"velu@0903","1234"},
			{"vela@0903","123"},
			{"vel@0903","12"}
		};
	}
	
	//@Parameters({"mail", "pass"})
	@Test(priority=3,dataProvider="sample data")
	//private void tng1(@Optional("Facebook@gmail.com")String m,@Optional("0987763")String p)
	private void tng1(String m,String p)
	{
		System.out.println("TNG 1: " +Thread.currentThread().getId());
		drive.get("https://www.facebook.com/");
		WebElement element1 = drive.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		element1.sendKeys(m);
		String title=pagetitle();
		Assert.assertTrue("Check the title",title.contains("facebook"));
		WebElement element2 = drive.findElement(By.xpath("//input[@placeholder='Password']"));
		element2.sendKeys(p);
		
//		junit2 j=new junit2();
//		pack.TestNGproject.BaseClass.passtext("vel@0903", j.getEmail());
//		pack.TestNGproject.BaseClass.passtext("12345", j.getPassword());
//		System.out.println("TESTCASE1");
	}
	
	@DataProvider(name="Amazon data")
	private Object[][] Data(){
		return new Object[][] {
			{"Vijay songs"},
			{"Ajith Songs"},
			{"Vikram songs"},
			{"Dhanush songs"},
			{"GV prakash songs"}
		};
	}
	@Test(priority=2,dataProvider="Amazon data")
	private void tng6(String s) throws AWTException
	{
		System.out.println("TNG 6: " +Thread.currentThread().getId());
		launchURl("https://www.youtube.com/");
		System.out.println("TESTCASE2");
		WebElement element = drive.findElement(By.xpath("//input[@placeholder='Search']"));
		element.sendKeys(s);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Test(priority=1)
	private void tng3()
	{
		System.out.println("TNG 3: " +Thread.currentThread().getId());
		launchURl("https://www.amazon.com/");
		System.out.println("TESTCASE3");
	}
	
	@BeforeClass
	private void first()
	{
		System.out.println("Launch browser");
		launchbrowser();
		
	}
	
	@AfterClass
	private void last()
	{
		System.out.println("close browser");
		//closeentirebrowser();
	}
	
	@BeforeMethod
	private void before()
	{
		Date d=new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void after()
	{
		Date d=new Date();
		System.out.println(d);
	}

	
}
