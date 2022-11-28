package Handling_Alerts_ConfirmBox_TestUtilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Handling_Alerts_ConfirmBox_TestBase.TestBase;



public class TestUtilities extends TestBase {

	
	TestUtilities utilities;
	   Actions action;
	   Alert alert;
		public TestUtilities() throws IOException {
			
			// TODO Auto-generated constructor stub
		}
		
		//clicking on elements
		public void clickonwebelement(WebElement element) {
			element.click();
		}
		
		//sendkeys 
		public void sendkeys(WebElement element, String abc) {
			element.sendKeys(abc);
		}
		
		//Excel Dataprovider
/*		@DataProvider(name="loginTestdata")
		  public String[][] getdata() throws IOException {
			  
			  FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\TestDataGuru.xlsx");
			  XSSFWorkbook workbook=new XSSFWorkbook(file);
			  XSSFSheet sheet=workbook.getSheetAt(0);
		//	  int row=sheet.getPhysicalNumberOfRows();//if we use this method to get no of rows, it will count header row also
			 int row=sheet.getLastRowNum();  // if we use this method it will provide other rows accept header row
			 
			  int col=sheet.getRow(0).getLastCellNum();
			  
			  String[][] data=new String[row][col];
			  
			  
			  for(int i=0;i<row;i++ ) {
				  
				XSSFRow currentrow= sheet.getRow(i+1);
				  for(int j=0;j<col;j++) {
					  
					  @SuppressWarnings("unused")
					DataFormatter df=new DataFormatter();
				data[i][j]= currentrow.getCell(j).toString();
				 
				  
				  
				  
				  
				  }
				  
				  
			  }
			  
			  
			  workbook.close();
			  file.close();
		  return data;
			  
			 
		  }
		
		//reading FullExcelData
		@SuppressWarnings("incomplete-switch")
		public void GetFullExcelData() throws IOException {
	FileInputStream file=new FileInputStream(prop.getProperty("excel_filepath"));
			
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			XSSFSheet sheet=workbook.getSheetAt(0);
			
			int rows=sheet.getLastRowNum();
			int col=sheet.getRow(1).getLastCellNum();
			
			
			for(int i=0;i<rows;i++) {
				XSSFRow currentrow=sheet.getRow(i);
				
				
				for(int j=0;j<col;j++) {
				    XSSFCell cell=currentrow.getCell(j);

				    switch(cell.getCellType()) {
				    
				    case STRING: System.out.print("    "+cell.getStringCellValue()); break;
				    case NUMERIC: System.out.print("    "+cell.getNumericCellValue()); break;
				    case BOOLEAN: System.out.print("    "+cell.getBooleanCellValue()); break;
				    
				}    
				System.out.println();
		    }
		}
	}
		
		*/
	    
		
		  //Mousehovering on the elements
	   public void mousehover(WebElement element) throws InterruptedException {
	   	  action=new Actions(driver);
	  	  Thread.sleep(5000);
	  	  action.moveToElement(element).build().perform();

	   }
		 
	   //drag and drop
	   public void draganddrop(WebElement draggable, WebElement droppable) {
	   	action=new Actions(driver);
	     utilities.switchtoframe();
	     action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
	 
	   }

	   
	   //switch to frame
		public void switchtoframe() {
		 driver.switchTo().frame(0);
		}

		
		//navigation to url 
		public void navigatingTo() {
			  
		driver.navigate().to("https://www.spicejet.com/");
			  
		}

		//navigation back
		public void navigatingToBack() {
				  
		driver.navigate().back();
				 
				  
			}
			
		//navigation back
		public void navigatingToForward() {
						  
		driver.navigate().forward();
						 
						  
		    }
		
		 //refresh the page
		public void refresh() {
			  
			driver.navigate().refresh();
							 
						  
	       }

		  //window Scrolldown
		public void scrolldown(int i) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,i)", ""); 
		}
		
		//taking screenshot
		public void takeScreenshot(String filename) throws IOException {
			  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  try {
				  FileUtils.copyFile(src, new File("C:\\Users\\mdsohil\\eclipse-workspace\\Alert_Handling\\Screenshots\\"+filename+".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
	   }
		
		//select class
		public void select(WebElement element, String text) {
			Select select=new Select(element);
			  select.selectByVisibleText(text);
		}
		
		
		//switch to next window
		public void nextTab() {
			@SuppressWarnings("unused")
			Set <String> s=driver.getWindowHandles();
			
			 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());		    
			    driver.switchTo().window(newTab.get(1));
		}
		
		
		
		//Switch to alert
		public void switchToalert() {
			alert=driver.switchTo().alert();
		}
	   //Accept Alerts 
		public void AcceptAlert() {
			
			 driver.switchTo().alert().accept();
		}
		
		 //Dismis Alerts 
		public void DismissAlert() {
			driver.switchTo().alert().dismiss();
			 
				
		}
			
			
		//sendkeys to Alerts 
		public void sendtoAlerts(String element) {
			  driver.switchTo().alert().sendKeys(element);
			  driver.switchTo().alert().accept();
			  
					
		}
				
				
		//Double click
		public void doubleclick(WebElement element) {
			
			 Actions action=new Actions(driver);
			 action.doubleClick(element).build().perform();
		}
		
		//right clicking on element
		public void rightclick(WebElement element) {

			 action.contextClick(element).build().perform();
		}

		 	//slider
		public void slider(WebElement element,int range) {
			Actions action=new Actions(driver);
			 action.clickAndHold(element).moveByOffset(range, 0).release().build().perform();
		}
		
		public static void takeScreenshotAtEndOfTest() throws IOException {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis() + ".png"));
		}

		
		
		
}
