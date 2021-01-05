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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('contactPageObj_FreeCRM/Page_Cogmento CRM/i_Calendar_users icon'))

WebUI.click(findTestObject('contactPageObj_FreeCRM/Page_Cogmento CRM/button_New'))

WebUI.sendKeys(findTestObject('contactPageObj_FreeCRM/Page_Cogmento CRM/input_First Name_first_name'), 'Joti')

WebUI.sendKeys(findTestObject('contactPageObj_FreeCRM/Page_Cogmento CRM/input_Last Name_last_name'), 'Biswas')

WebUI.click(findTestObject('contactPageObj_FreeCRM/Page_Cogmento CRM/button_Save'))

WebUI.click(findTestObject('contactPageObj_FreeCRM/Page_Cogmento CRM/i_Calendar_users icon'))

WebUI.verifyElementPresent(findTestObject('contactPageObj_FreeCRM/Page_Cogmento CRM/a_Joti Biswas'), 10)

