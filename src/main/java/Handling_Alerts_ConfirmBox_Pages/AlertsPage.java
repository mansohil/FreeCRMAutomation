package Handling_Alerts_ConfirmBox_Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Handling_Alerts_ConfirmBox_TestBase.TestBase;
import Handling_Alerts_ConfirmBox_TestUtilities.TestUtilities;

public class AlertsPage extends TestBase {
   WebElement element;
   TestUtilities utilities;
	public AlertsPage() throws IOException {
      utilities=new TestUtilities();
		// TODO Auto-generated constructor stub
	}
	
	//mehtod to check the element is present or not
	public boolean isSwitchToPresent() {
	boolean	switchTo=driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\" and contains(text(),\"SwitchTo\")]")).isDisplayed();
		return switchTo;
	}
	
	//method to mousehover on swtichTo element
	public void mousehoveronSwitchTo() throws InterruptedException {
		element=driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\" and contains(text(),\"SwitchTo\")]"));
		utilities.mousehover(element);
	}
	
	//method to click on alerts element
	public void clickOnAlerts() throws InterruptedException {
		element=driver.findElement(By.xpath("//a[text()=\"Alerts\"]"));
		utilities.mousehover(element);
		utilities.clickonwebelement(element);
	}
	
	//method to click on alertbox
	public void clickOnAlertsBox() throws InterruptedException {
		Thread.sleep(1000);
		element=driver.findElement(By.xpath("//button[@class=\"btn btn-danger\" and contains(text(),\"    click the button to display an  alert box:\")]"));
	    utilities.clickonwebelement(element);
	}
	
	//method for switching current window to alerts
	public boolean isAlertPresent() {
		try {
			Thread.sleep(2000);
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e){
			return false;
			
		}
		
	}
	
	//method for accepting alert
	public void AcceptAlerts() throws InterruptedException {
		Thread.sleep(2000);
		utilities.AcceptAlert();
	}
	
	//method to check weather AlertWithOKAndCancel element is displayed or not
	public boolean isAlertWithOKAndCancel() throws InterruptedException {
		Thread.sleep(2000);
		boolean Alert=driver.findElement(By.xpath("//a[@class=\"analystic\" and contains (text(),\"Alert with OK & Cancel \")]")).isDisplayed();
		return Alert;
	}
	
	//method to click on AlertWithOKAndCancel element
    public void clickOnAlertWithOKAndCancel()  {
    	element=driver.findElement(By.xpath("//a[@class=\"analystic\" and contains (text(),\"Alert with OK & Cancel \")]"));
        utilities.clickonwebelement(element);
    
    
    }
    
    //method for clicking on the confirmbox element
    public void clickConfirmBox() throws InterruptedException {
    	Thread.sleep(1000);
    	element=driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
    	utilities.clickonwebelement(element);
    }
    
	//method for switching current window to alerts
    public boolean isConfirmBoxPresent() {
		try {
			Thread.sleep(1000);
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e){
			return false;
			
		}
		
	}
    
	//method for accepting alert
    public void AcceptPopUpBox() throws InterruptedException {
    	Thread.sleep(1000);
    	utilities.AcceptAlert();
    }
    
    //method for checking alert with text is present or not
    public boolean isAlertWithTextPresent() throws InterruptedException {
    	Thread.sleep(1000);
    	boolean text=driver.findElement(By.xpath("//a[@class=\"analystic\" and contains(text(),\"Alert with Textbox \")]")).isDisplayed();
        return text;
    }
    
    //method for clicking the alert with text element 
    public void clickAlertWithTextPresent() throws InterruptedException {
    	Thread.sleep(1000);
    	 element=driver.findElement(By.xpath("//a[@class=\"analystic\" and contains(text(),\"Alert with Textbox \")]"));
         utilities.clickonwebelement(element);
    }
    
	//method for clicking on prompt box element
    public void clickOnPrompBox() {
    	element =driver.findElement(By.xpath("//button[@class=\"btn btn-info\" and contains(text(),\"click the button to demonstrate the prompt box\")]"));
    	utilities.clickonwebelement(element);
    }
    
	//method for switching current window to alerts
    public boolean isPrompBoxPresent() {
    	try {
			Thread.sleep(1000);
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e){
			return false;
			
		}
    }
    
    //method sending keys to the alert
    public void enterInPrompBox() {
    	utilities.sendtoAlerts(prop.getProperty("name"));
    	
    }
    
    
}
