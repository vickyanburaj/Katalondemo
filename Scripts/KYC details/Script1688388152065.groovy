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

WebUI.openBrowser('http://anladmin.okdollar.org/')

WebUI.setText(findTestObject('Object Repository/KYCdetails/Page_OK - Management Portal/input_Please Enter Your Information_txtUserName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/KYCdetails/Page_OK - Management Portal/input_Please Enter Your Information_txtPassword'), 
    '5mSEQ9MJzs63VALXlX2W8g==')

WebUI.sendKeys(findTestObject('Object Repository/KYCdetails/Page_OK - Management Portal/input_Please Enter Your Information_txtPassword'), 
    Keys.chord(Keys.ENTER))

WebUI.navigateToUrl('http://anladmin.okdollar.org/Dashboard/Dashboard')

WebUI.click(findTestObject('Object Repository/KYCdetails/Page_OK/a_Kyc'))

WebUI.click(findTestObject('Object Repository/KYCdetails/Page_OK/a_Kyc Details'))

WebUI.setText(findTestObject('Object Repository/KYCdetails/Page_OK/input_MobileNumber_txtMobileNumber'), '00959883769800')

WebUI.sendKeys(findTestObject('Object Repository/KYCdetails/Page_OK/input_MobileNumber_txtMobileNumber'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/KYCdetails/Page_OK/i_View'))

WebUI.click(findTestObject('Object Repository/KYCdetails/Page_OK/a_Address'))

WebUI.click(findTestObject('Object Repository/KYCdetails/Page_OK/i_Device Info_blue ace-icon fa fa-mobile bi_f2eca4'))

WebUI.doubleClick(findTestObject('Object Repository/KYCdetails/Page_OK/td'))

