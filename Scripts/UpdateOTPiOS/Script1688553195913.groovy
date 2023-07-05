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

WebUI.click(findTestObject('POM - UpdateIOSUDID/IOS Otp'))

WebUI.sendKeys(findTestObject('POM - UpdateIOSUDID/EnterPhoneNumber'), '00959886523228')

WebUI.sendKeys(findTestObject('POM - UpdateIOSUDID/EnterUDID'), '#332D7DB7-A588-01B3-A741-938688149BB9')

WebUI.click(findTestObject('POM - UpdateIOSUDID/button_Submit'))

WebUI.closeBrowser()

