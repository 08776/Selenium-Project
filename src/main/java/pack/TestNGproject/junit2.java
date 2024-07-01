package pack.TestNGproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class junit2 extends BaseClass {
	public junit2()
	{
		PageFactory.initElements(drive, this);
	}
	@FindBy(name="email")
	private static WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private static WebElement password;

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

}
