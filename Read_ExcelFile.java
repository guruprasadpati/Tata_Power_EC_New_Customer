package Tata_Power_Electric.Connection_for_New_Residential_Customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Read_ExcelFile {
	public void Read_ExcelFileFromUser(String file, WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			LT_Registration ltReg=new LT_Registration();
			XSSFWorkbook work= new XSSFWorkbook(new FileInputStream(file));
			XSSFSheet sheet=work.getSheet("Sheet1");
			XSSFRow row;
			int i=1;
			while((row= sheet.getRow(i))!=null) {
				System.out.println("House No - "+ row.getCell(0).getStringCellValue());
				String HouseNo=row.getCell(0).getStringCellValue();
				
				System.out.println("Street Namee - "+ row.getCell(1).getStringCellValue());
				String StreetName=row.getCell(1).getStringCellValue();
				
				System.out.println("Colony - "+ row.getCell(2).getStringCellValue());
				String Colony=row.getCell(2).getStringCellValue();
				
				System.out.println("Ward No - "+ row.getCell(3).getStringCellValue());
				String WardNo=row.getCell(3).getStringCellValue();
				
				System.out.println("Village Name - "+ row.getCell(4).getStringCellValue());
				String VillageName=row.getCell(4).getStringCellValue();
				
				System.out.println("Gram Panchayat - "+ row.getCell(5).getStringCellValue());
				String GramPanchayat=row.getCell(5).getStringCellValue();
				
				System.out.println("Adhar - "+ row.getCell(6).getStringCellValue());
				String Adhar=row.getCell(6).getStringCellValue();
				
				System.out.println("GST - "+ row.getCell(7).getStringCellValue());
				String GST=row.getCell(7).getStringCellValue();
				
				System.out.println("Email Id - "+ row.getCell(8).getStringCellValue());
				String EmailId=row.getCell(8).getStringCellValue();
				
				System.out.println("Mobile Phone - "+ row.getCell(9).getStringCellValue());
				String MobilePhone=row.getCell(9).getStringCellValue();
				
				System.out.println("Watsap No - "+ row.getCell(10).getStringCellValue());
				String WatsapNo=row.getCell(10).getStringCellValue();
				
				ltReg.LTPR(driver, HouseNo,StreetName,Colony,WardNo,VillageName,GramPanchayat,Adhar,GST,EmailId,MobilePhone,WatsapNo);
				i++;
				Thread.sleep(8000);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

		
	}


