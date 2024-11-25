package Tata_Power_Electric.Connection_for_New_Residential_Customer;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Tata_Power_Electric.MyScreenRecorder;

public class Main_Class {
	public static void main (String [] args) throws Exception {
		//MyScreenRecorder.startRecording("Recording");
		WebDriver driver=new ChromeDriver();
		Tata_Power_Electric tp=new Tata_Power_Electric();
		tp.Tata(driver);
		Set<String> windows=driver.getWindowHandles();
		String[] arr=windows.toArray(new String[windows.size()]);
		driver.switchTo().window(arr[1]);
		LT_Reg_LabelVerification LV=new LT_Reg_LabelVerification();
		LV.LabelVer(driver);
		Read_ExcelFile RE = new Read_ExcelFile();
		RE.Read_ExcelFileFromUser("C:\\Users\\PCON - HP1\\Desktop\\Excel\\TataPower.xlsx",driver);
		Driver_Quit dq = new Driver_Quit();
		System.out.println("The Tets Case is passed");
		dq.DRQ(driver);
		
	}
	

	
	}

	


