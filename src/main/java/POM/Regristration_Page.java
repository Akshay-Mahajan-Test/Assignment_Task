package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Regristration_Page {
	WebDriver driver;
	
	public Regristration_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// All element locator
	@FindBy(xpath = "Name_xpath_xpression")
		private WebElement Name;
	
	@FindBy(xpath = "Email_xpath_xpression")
		private WebElement Email;
	
	@FindBy(xpath = "Age_xpath_xpression")
		private WebElement Age;
	
	@FindBy(xpath = "Password_xpath_xpression")
		private WebElement Password;
	
	@FindBy(xpath = "SubmitButton_xpath_xpression")
		private WebElement Submit;
	
	@FindBy(xpath = "ErrorMessage_xpath_xpression")
		private WebElement Error;
	
	// Respective Element-methods
	
	public void NameField(String UserName)
	{
		Name.clear();
		Name.sendKeys(UserName);
	}
	
	public void EmailField(String UserEmail)
	{
		Email.clear();
		Email.sendKeys(UserEmail);
	}
	
	public void AgeField(String UserAge)
	{
		Age.clear();
		Age.sendKeys("Age");
	}
	
	public void PasswordField(String UserPass)
	{
		Password.clear();
		Password.sendKeys(UserPass);
	}
	
	public void SubmitButton()
	{
		Submit.click();
	}
	
	public void ErrorMessageforName()
	{
		String Expected = Error.getText();
		String Actual = "Please Provide the Correct Name";
		Assert.assertEquals(Actual, Expected);
	}
	
	public void ErrorMessageForEmail()
	{
		String Expected = Error.getText();
		String Actual = "Please Provide the Correct Email";
		Assert.assertEquals(Actual, Expected);
	}

	public void ErrorMessageForAge()
	{
		String Expected = Error.getText();
		String Actual = "Please Provide the Correct Age in Number format";
		Assert.assertEquals(Actual, Expected);
	}
}
