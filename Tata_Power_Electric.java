package Tata_Power_Electric.Connection_for_New_Residential_Customer;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Tata_Power_Electric {
	
public void Tata(WebDriver driver) throws Exception{ {
	
   driver.manage().window().maximize(); 
   driver.get("https://www.tpnodl.com/");
   //select close icon for pop-up
   driver.findElement(By.xpath("//button[@id='cboxClose']")).click();
   //Mouse Hover function at Home
   WebElement element = driver.findElement(By.cssSelector("#cd-primary-nav > li:nth-child(1) > a"));
   Thread.sleep(2000);
   Actions action = new Actions(driver);
   action.moveToElement(element).perform();
   Thread.sleep(5000);
   //Verify New Connection label
   WebElement NewConnection = driver.findElement(By.xpath("//h3[text()='New Connection']"));
   System.out.println("Element with NewConnection(): " + NewConnection.getText() );
   String ActualNameNewConnection = driver.findElement(By.xpath("//h3[text()='New Connection']")).getText().trim();
   String ExpectedNameNewConnection = driver.findElement(By.xpath("//h3[text()='New Connection']")).getText().trim();
   
   try {
   	assertEquals("New Connection", ExpectedNameNewConnection, ActualNameNewConnection);
   } catch (AssertionError error) {
       System.out.println("Not equal");
       throw error;
   }
   System.out.println("Equal");
   driver.findElement(By.xpath("//h3[text()='New Connection']")).click();
   //Select LT3 Phase Connection
   WebElement LT3 = driver.findElement(By.xpath("//aside[text()='LT 3 PHASE CONNECTION (5.5KW TO 70KVA)']"));
   System.out.println("Element with text(): " + LT3.getText() );
   driver.findElement(By.xpath("//aside[text()='LT 3 PHASE CONNECTION (5.5KW TO 70KVA)']")).click();
   
 

}
}
}


