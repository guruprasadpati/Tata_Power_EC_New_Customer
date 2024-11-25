package Tata_Power_Electric.Connection_for_New_Residential_Customer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class back_To_Tata_Power {

	public void clickButton(WebDriver driver) {
		driver.findElement(By.xpath("//aside[text()='LT 3 PHASE CONNECTION (5.5KW TO 70KVA)']")).click();
		System.out.println("Sucess message");
	}
}
