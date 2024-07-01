package pack.TestNGproject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.annotations.DataProvider;

@RunWith(Suite.class)
@SuiteClasses({testng1.class, testng2.class, testng3.class})
public class RunnerClass {
	
	

}
