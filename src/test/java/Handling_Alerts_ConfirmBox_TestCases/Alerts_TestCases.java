package Handling_Alerts_ConfirmBox_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Handling_Alerts_ConfirmBox_Pages.AlertsPage;
import Handling_Alerts_ConfirmBox_TestBase.TestBase;
import Handling_Alerts_ConfirmBox_TestUtilities.TestUtilities;

public class Alerts_TestCases extends TestBase{
	AlertsPage alert;
	 TestUtilities utilities;
  public Alerts_TestCases() throws IOException {
		super();
		utilities=new TestUtilities();
	}
  
  
  
  @BeforeClass
  public void setup() throws IOException {
	  initialization();
	  alert=new AlertsPage();
	  
  }

@Test(priority=1)
  public void SwitchToPresentTest() {
	alert.isSwitchToPresent();
	Assert.assertTrue(true);
  }

@Test(dependsOnMethods=("SwitchToPresentTest"))
  public void mousehover() throws InterruptedException {
	  alert.mousehoveronSwitchTo();
	  alert.clickOnAlerts();
	  Assert.assertTrue(true);
  }

 @Test(priority=3)
 public void alertboxTest() throws Exception {
	 alert.clickOnAlertsBox();
	 Assert.assertTrue(true);
 }
 
 @Test(priority=4)
 public void AlertPresentTest() throws IOException {
	 alert.isAlertPresent();
	 Assert.assertTrue(true);
 }
 
 
 @Test(dependsOnMethods=("AlertPresentTest"))
 public void AcceptAlertTest() throws InterruptedException {
	 alert.AcceptAlerts();
	 Assert.assertTrue(true);
 }

 
 @Test(priority=5)
 public void isAlertWithOKAndCancelTest() throws InterruptedException {
	 alert.isAlertWithOKAndCancel();
	 Assert.assertTrue(true);
 }
 
 @Test(dependsOnMethods=("isAlertWithOKAndCancelTest"))
 public void clickOnAlertWithOKAndCancelTest() {
	 alert.clickOnAlertWithOKAndCancel();
	 Assert.assertTrue(true);
 }
 
 
 @Test(priority=7)
 public void clickConfirmBoxTest() throws InterruptedException {
	 alert.clickConfirmBox();
	 Assert.assertTrue(true);
 }
 
 @Test(priority=8)
 public void isConfirmBoxPresentTest() {
	 alert.isConfirmBoxPresent();
	 Assert.assertTrue(true);
 }
 
 
 @Test(dependsOnMethods=("isConfirmBoxPresentTest"))
 public void AcceptPopUpBoxTest() throws InterruptedException {
	 alert.AcceptPopUpBox();
	 Assert.assertTrue(true);
 }
 
 
 @Test(priority=9)
 public void isAlertWithTextPresentTest() throws InterruptedException  {
	 alert.isAlertWithTextPresent();
	 Assert.assertTrue(true);
 }
 
 
 @Test(dependsOnMethods=("isAlertWithTextPresentTest"))
 public void clickAlertWithTextPresentTest() throws InterruptedException {
	 alert.clickAlertWithTextPresent();
	 Assert.assertTrue(true);
 }
 
 
 @Test(priority=10)
 public void clickOnPrompBoxTest() throws InterruptedException {
	 alert.clickOnPrompBox();
	 Assert.assertTrue(true);
 }
 
 
 @Test(priority=12)
 public void isPrompBoxPresentTest() throws InterruptedException {
	 alert.isPrompBoxPresent();
	 Assert.assertTrue(true);
 }
 
 @Test(dependsOnMethods=("isPrompBoxPresentTest"))
 public void enterInPrompBoxTest() throws InterruptedException {
	 alert.enterInPrompBox();
	 Assert.assertTrue(true);
 }
 
 
 
 
 @AfterClass
 public void teardown() {
	 driver.quit();
 }
}
