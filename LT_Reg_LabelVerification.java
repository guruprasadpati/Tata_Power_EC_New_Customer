package Tata_Power_Electric.Connection_for_New_Residential_Customer;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class LT_Reg_LabelVerification {
	public void LabelVer(WebDriver driver) throws Exception{ {
		Thread.sleep(8000);
		//Verify label Application type
		   WebElement ApplicationType = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[1]"));
		   System.out.println("Element with Application Type(): " + ApplicationType.getText() );
		   String ActualName_ApplicationType = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[1]")).getText().trim();
		   String ExpectedName_ApplicationType = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[1]")).getText().trim();
		   
		   try {
		   	assertEquals("Application Type", ExpectedName_ApplicationType, ActualName_ApplicationType);
		   } catch (AssertionError error) {
		       System.out.println("Not equal");
		       throw error;
		   }
		   System.out.println("Equal");

}
	//Verify label PersonalDetails
	 WebElement PersonalDetails = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[2]"));
	   System.out.println("Element with Personal Details(): " + PersonalDetails.getText() );
	   String ActualName_PersonalDetails = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[2]")).getText().trim();
	   String ExpectedName_PersonalDetails = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[2]")).getText().trim();
	   
	   try {
	   	assertEquals("Personal Details", ExpectedName_PersonalDetails, ActualName_PersonalDetails);
	   } catch (AssertionError error) {
	       System.out.println("Not equal");
	       throw error;
	   }
	   System.out.println("Equal");

	//Verify label Applicant Name
	 WebElement ApplicantName = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[3]"));
	   System.out.println("Element with Applicant Name(): " + ApplicantName.getText() );
	   String ActualName_ApplicantName = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[3]")).getText().trim();
	   String ExpectedName_ApplicantName = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[3]")).getText().trim();
	   
	   try {
	   	assertEquals("Applicant Name", ExpectedName_ApplicantName, ActualName_ApplicantName);
	   } catch (AssertionError error) {
	       System.out.println("Not equal");
	       throw error;
	   }
	   System.out.println("Equal");  
	 //Verify label Address of service Location
//	   WebElement AddressofserviceLocation = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[4]"));
//	   System.out.println("Element with Address of Service Location(): " + AddressofserviceLocation.getText() );
//	   String ActualName_AddressofserviceLocation = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[4]")).getText().trim();
//	   String ExpectedName_AddressofserviceLocation = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[4]")).getText().trim();
//	   
//	   try {
//	   	assertEquals("Address of Service Location", ExpectedName_AddressofserviceLocation, ActualName_AddressofserviceLocation);
//	   } catch (AssertionError error) {
//	       System.out.println("Not equal");
//	       throw error;
//	   }
//	   System.out.println("Equal");
	   
	 //Verify label Other Details
	   WebElement OtherDetails = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[5]"));
	   System.out.println("Element with Other Details(): " + OtherDetails.getText() );
	   String ActualName_OtherDetails = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[5]")).getText().trim();
	   String ExpectedName_OtherDetails = driver.findElement(By.xpath("(//p[@class='form_header font-weight-bold'])[5]")).getText().trim();
	   
	   try {
	   	assertEquals("Other Details", ExpectedName_OtherDetails, ActualName_OtherDetails);
	   } catch (AssertionError error) {
	       System.out.println("Not equal");
	       throw error;
	   }
	   System.out.println("Equal");
	}
	
}
