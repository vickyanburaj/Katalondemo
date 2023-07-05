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
import com.sun.media.rtsp.protocol.TransportHeader

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://anladmin.okdollar.org/Account/Login')

WebUI.sendKeys(findTestObject('AdminPortal_Login_Location/txtUserName'), 'admin')

WebUI.sendKeys(findTestObject('AdminPortal_Login_Location/txtPassword'), 'junction1983')

WebUI.click(findTestObject('AdminPortal_Login_Location/Page_OK -POM update UDID/LoginButton'))

WebUI.click(findTestObject('Check_KYC_AllDetails/KYC'))

WebUI.click(findTestObject('Check_KYC_AllDetails/KYC_Details'))

WebUI.sendKeys(findTestObject('Check_KYC_AllDetails/EnterMobileNumber'), '00959883769800')
WebUI.click(findTestObject('Check_KYC_AllDetails/button_Search'))

WebUI.click(findTestObject('Check_KYC_AllDetails/ViewIcon'))

WebUI.click(findTestObject('Check_KYC_AllDetails/Device Info'))

WebUI.click(findTestObject('Check_KYC_AllDetails/Address_Info'))

WebUI.click(findTestObject('Check_KYC_AllDetails/Other_Info'))

WebUI.closeBrowser()

