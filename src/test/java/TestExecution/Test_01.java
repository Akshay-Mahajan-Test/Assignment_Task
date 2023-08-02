package TestExecution;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xalan.xsltc.compiler.util.ErrorMessages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basic.TestBase;
import POM.Regristration_Page;
import Utility.ExcelReader;

public class Test_01 extends TestBase {
	WebDriver driver;

	@Test
	public void FilltheValiddetaisl() throws EncryptedDocumentException, IOException {

		ExcelReader read = new ExcelReader();
		Regristration_Page Reg = new Regristration_Page(driver);
		String Name = read.readExcel(1, 0);
		Reg.NameField(Name);
		String Email = read.readExcel(1, 1);
		Reg.EmailField(Email);
		String Age = read.readExcel(1, 2);
		Reg.AgeField(Age);
		String Pass = read.readExcel(1, 3);
		Reg.PasswordField(Pass);
		Reg.SubmitButton();

	}

	@Test
	public void FilltheNameinvalid() throws EncryptedDocumentException, IOException {

		ExcelReader read = new ExcelReader();
		Regristration_Page Reg = new Regristration_Page(driver);
		String Name = read.readExcel(2, 0);
		Reg.NameField(Name);
		String Email = read.readExcel(2, 1);
		Reg.EmailField(Email);
		String Age = read.readExcel(2, 2);
		Reg.AgeField(Age);
		String Pass = read.readExcel(2, 3);
		Reg.PasswordField(Pass);
		Reg.SubmitButton();
	}

	@Test
	public void FilltheEmailInvalid() throws EncryptedDocumentException, IOException {
		ExcelReader read = new ExcelReader();
		Regristration_Page Reg = new Regristration_Page(driver);
		String Name = read.readExcel(3, 0);
		Reg.NameField(Name);
		String Email = read.readExcel(3, 1);
		Reg.EmailField(Email);
		String Age = read.readExcel(3, 2);
		Reg.AgeField(Age);
		String Pass = read.readExcel(3, 3);
		Reg.PasswordField(Pass);
		Reg.SubmitButton();
	}

	@Test
	public void FilltheAgeInvalid() throws EncryptedDocumentException, IOException {
		ExcelReader read = new ExcelReader();
		Regristration_Page Reg = new Regristration_Page(driver);
		String Name = read.readExcel(4, 0);
		Reg.NameField(Name);
		String Email = read.readExcel(4, 1);
		Reg.EmailField(Email);
		String Age = read.readExcel(4, 2);
		Reg.AgeField(Age);
		String Pass = read.readExcel(4, 3);
		Reg.PasswordField(Pass);
		Reg.SubmitButton();
	}

	@Test
	public void FillthePassInvalid() throws EncryptedDocumentException, IOException {
		ExcelReader read = new ExcelReader();
		Regristration_Page Reg = new Regristration_Page(driver);
		String Name = read.readExcel(5, 0);
		Reg.NameField(Name);
		String Email = read.readExcel(5, 1);
		Reg.EmailField(Email);
		String Age = read.readExcel(5, 2);
		Reg.AgeField(Age);
		String Pass = read.readExcel(5, 3);
		Reg.PasswordField(Pass);
		Reg.SubmitButton();
	}
	
	@Test
	public boolean isNameValid(String name)
	{
		return name.length() >= 3;
	}
	
	@Test
	public boolean isAgeValid(String Age)
	{
		 try {
	            int ageInt = Integer.parseInt(Age);
	            return ageInt >= 18 && ageInt <= 100; 
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}
	
	@Test
	public boolean isPasswordValid(String Password)
	{
		 return Password.length() >= 8; 
	}
	
	@Test
	public void ErrorMsgAfterprovideInvalidName()
	{
		Regristration_Page Reg = new Regristration_Page(driver);
		Reg.ErrorMessageforName();
	}
	
	@Test
	public void ErrorMsgAfterProvideInvalidEmail()
	{
		Regristration_Page Reg = new Regristration_Page(driver);
		Reg.ErrorMessageForEmail();
	}
	
	@Test
	public void ErrorMsgAfterProvideInvalidAge()
	{
		Regristration_Page Reg = new Regristration_Page(driver);
		Reg.ErrorMessageForAge();
	}
}
