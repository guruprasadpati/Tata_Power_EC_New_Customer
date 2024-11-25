package Tata_Power_Electric.Connection_for_New_Residential_Customer;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class LT_Registration {

	

	public void LTPR(WebDriver driver, String houseNo, String streetName, String colony, String wardNo,
			String villageName, String gramPanchayat, String adhar, String gST, String emailId, String mobilePhone,
			String watsapNo) throws Exception {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//Select New Connection  from Application Category dropdown 
		if(emailId.contains("guruprasadpati2@gmail.com"))
		{
                driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c53-2']")).click();
                //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[1]"))).click(); 
                System.out.println("Sucess");
		}
		////Select Temporary from Application Category dropdown 
         else if (emailId.contains("guruprasadpati3@gmail.com")) {
        		
        		    driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c53-2']")).click();
                   // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[2]"))).click(); 
                    System.out.println("Sucess1"); 
	}
	
                //Provide Salutation
                driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c53-62']")).click();
                WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
                wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[2]"))).click(); 
		//Provide Name of firm//Company//Org
                //driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c51-63']")).click();
                //WebDriverWait waitN = new WebDriverWait(driver,Duration.ofSeconds(20));
                //waitN.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c51-63 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']"))).sendKeys("DCON");
                //driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c51-63']")).sendKeys("DCON");
                //Provide House No
                driver.findElement(By.xpath("(//input[@formcontrolname='houseNoPlot'])[1]")).sendKeys(houseNo);
                //Provide Street
                driver.findElement(By.xpath("//input[@formcontrolname='streetName']")).sendKeys(streetName);

               //Provide Colony/Area
                driver.findElement(By.xpath("//input[@formcontrolname='colonyArea']")).sendKeys(colony);
                //WARD nO
                driver.findElement(By.xpath("//input[@formcontrolname='odpWardNo']")).sendKeys(wardNo);
                //Area Type
                driver.findElement(By.xpath("//div[@class='mat-select-value ng-tns-c53-14']")).click();
                WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(20));
                wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[3]"))).click(); 
                //Verify Location type radio button disable
                WebElement rd=driver.findElement(By.xpath("(//span[@class='mat-radio-container'])[2]"));
                boolean radionbuttnEnabled= rd.isEnabled();
                if (radionbuttnEnabled)
                	System.out.println("The radio button is enabled");
                else 
                	System.out.println("The radio button is disabled");
               //Provide Village Town Name
               driver.findElement(By.xpath("//input[@formcontrolname='village']")).sendKeys(villageName);
               //Provide Gram Panchayat
               driver.findElement(By.xpath("//input[@formcontrolname='villageId']")).sendKeys(gramPanchayat);
               //Provide Adhar
               driver.findElement(By.xpath("//input[@formcontrolname='aadhaarNo']")).sendKeys(adhar);
               //Provide GST No
               driver.findElement(By.xpath("(//input[@formcontrolname='gstNo'])[1]")).sendKeys(gST);
               //Select Option E-Bill Checkbox & verify it state
         
               WebElement Ebill = driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]"));

               System.out.println("Opting E-Bill.isDisplayed()" + Ebill.isDisplayed());

                if(Ebill.isDisplayed()==true) {

               
               }else {

              System.out.println("Option is not displayed");

                }
                driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[1]")).click();

                Thread.sleep(3000);
                //LT NSC Registration         
                //driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
              driver.findElement(By.xpath("//button[@type='button']/span[text()='Ok']")).click();
               //Provide Email Id
               driver.findElement(By.xpath("(//input[@formcontrolname='emailId'])[1]")).sendKeys(emailId);
               //Provide Mobile Phone
               driver.findElement(By.xpath("(//input[@formcontrolname='mobilePhone'])[1]")).sendKeys(mobilePhone);
               ////Provide Watsap  No
               driver.findElement(By.xpath("(//input[@formcontrolname='whatsapNumber'])[1]")).sendKeys(watsapNo);
               //Provide DOB
               WebDriverWait DOB = new WebDriverWait(driver, Duration.ofSeconds(10));

WebElement DOB1 = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));
DOB1.click();
Thread.sleep(200);
driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content mat-focus-indicator'])[10]")).click();
//Upload Photo
if(emailId.contains("guruprasadpati2@gmail.com"))
{
Thread.sleep(300);
String filepath= "C:\\Users\\PCON - HP1\\Desktop\\PPT\\guru.jpg";
Thread.sleep(300);
WebElement fileInputField = driver.findElement(By.xpath("//input[@type='file' and @id='photo']"));
fileInputField.sendKeys(filepath);
}
else {
	Thread.sleep(300);
	String filepath1= "C:\\Users\\PCON - HP1\\Desktop\\PPT\\suru.jpg";
	Thread.sleep(300);
	WebElement fileInputField = driver.findElement(By.xpath("//input[@type='file' and @id='photo']"));
	fileInputField.sendKeys(filepath1);
	
}

Thread.sleep(5000);
//Nearest Landmark
driver.findElement(By.xpath("//div[@class='mat-select-trigger ng-tns-c53-25']")).click();
WebDriverWait waitNL = new WebDriverWait(driver,Duration.ofSeconds(20));
waitNL.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Near By Location']"))).click(); 
//Provide Near by location
Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@formcontrolname='nearByLocation'])[1]")).sendKeys("78");
//Provide Nearest Consumer
driver.findElement(By.xpath("//input[@formcontrolname='consumerNumber' and @id='mat-input-13']")).sendKeys("guru");
//Select Billing address
Thread.sleep(300);
WebElement Billingaddress = driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]"));

System.out.println("Billingaddress.isDisplayed()" + Billingaddress.isDisplayed());

 if(Billingaddress.isDisplayed()==true) {


}else {

System.out.println("Option is not displayed");

 }
 driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container'])[2]")).click();
 Thread.sleep(300);
//Provide Billing House /Plot
 driver.findElement(By.xpath("//input[@formcontrolname='housePlotBilling']")).sendKeys(houseNo);
 //Provide Street
 driver.findElement(By.xpath("//input[@formcontrolname='streetNameBilling']")).sendKeys(streetName);

//Provide Colony/Area
 driver.findElement(By.xpath("//input[@formcontrolname='colonyAreaBilling']")).sendKeys(colony);
 //WARD nO
 driver.findElement(By.xpath("//input[@formcontrolname='cpWardNo']")).sendKeys(wardNo);
 //Select district
 Thread.sleep(300);
 driver.findElement(By.xpath("//mat-select[@formcontrolname='districtBilling']")).click();
 WebDriverWait waitDT = new WebDriverWait(driver,Duration.ofSeconds(20));
 waitDT.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-option-text'])[5]"))).click();
 //Next button
 WebElement Nextbtn = driver.findElement(By.xpath("(//span[text()='Next'])[1]"));

 System.out.println("Next button.isDisplayed()" + Nextbtn.isDisplayed());
 System.out.println("Element with text(): " + Nextbtn.getText() );

  if(Nextbtn.isDisplayed()==true) {


 }else {

 System.out.println("Option is not displayed");

  }
  Nextbtn.click();
  WebElement warningmsg = driver.findElement(By.xpath("//div[text()=' Please fill all the mandatory fields ']"));
System.out.println("warningmsg.isDisplayed()" + Nextbtn.isDisplayed());
  System.out.println("Element with text(): " + warningmsg.getText() );
  driver.findElement(By.xpath("//div[@class='ng-star-inserted' and @style='float: right;']")).click();
  
  Window_Handler wh=new Window_Handler();
  wh.clos_Window(driver);
  Thread.sleep(2000);
  wh.switchToparentWindow(driver);
  back_To_Tata_Power b=new back_To_Tata_Power();
  b.clickButton(driver);
  wh.switchTochildWindow1(driver);
  Thread.sleep(2000);
  
	}
	
}