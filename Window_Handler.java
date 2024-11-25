package Tata_Power_Electric.Connection_for_New_Residential_Customer;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Window_Handler {

	public void windows_Handler(WebDriver driver) throws InterruptedException {
//		Set<String> windows=driver.getWindowHandles();
//		String[] arr=windows.toArray(new String[windows.size()]);
//		Thread.sleep(5000);
//		if(arr.length<0) {
//			driver.switchTo().window(arr[1]);
//		}
//		else {
//			driver.switchTo().window(arr[0]);
//			 Thread.sleep(2000);
//			 Window_Handler wh=new Window_Handler();
//			  wh.switchToparentWindow(driver);
//			  back_To_Tata_Power b=new back_To_Tata_Power();
//			  b.clickButton(driver);
//			  driver.switchTo().window(arr[1]);
//			  wh.switchTochildWindow(driver);
//			  //driver.switchTo().newWindow(driver);
//			  Thread.sleep(8000);
//			  String url = driver.getCurrentUrl();
//			  System.out.println("Current Url is:"+ url);
		}


	public void clos_Window(WebDriver driver) {
		driver.close();
	}
	public void switchToparentWindow(WebDriver driver) {
		Set<String> windows=driver.getWindowHandles();
		String[] arr=windows.toArray(new String[windows.size()]);
		driver.switchTo().window(arr[0]);
	}

	public void switchTochildWindow1(WebDriver driver) {
		Set<String> windows=driver.getWindowHandles();
		String[] arr=windows.toArray(new String[windows.size()]);
		driver.switchTo().window(arr[1]);
		
	}
}

