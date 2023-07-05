import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://anladmin.okdollar.org/Account/Login')

WebUI.sendKeys(findTestObject('AdminPortal_Login_Location/txtUserName'), 'admin')

WebUI.sendKeys(findTestObject('AdminPortal_Login_Location/txtPassword'), 'junction1983')

WebUI.click(findTestObject('AdminPortal_Login_Location/Page_OK -POM update UDID/LoginButton'))

WebUI.click(findTestObject('UpdateMSID_Location/Device'))

WebUI.click(findTestObject('UpdateMSID_Location/Simis MSID'))

WebUI.sendKeys(findTestObject('UpdateMSID_Location/Enter PhoneNumber'), '00959883769792')

WebUI.click(findTestObject('UpdateMSID_Location/button_Search'))

WebUI.sendKeys(findTestObject('UpdateMSID_Location/EnterNewMSID'), 'bf2cd3df38e8748c')

WebUI.sendKeys(findTestObject('UpdateMSID_Location/EnterOldMSID'), 'bf2cd3df38e8748c')

WebUI.click(findTestObject('UpdateMSID_Location/button_Update'))

