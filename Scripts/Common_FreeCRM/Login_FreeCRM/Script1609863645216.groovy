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

WebUI.openBrowser('')

for(def rowNum=1; rowNum<=2; rowNum++)
{
WebUI.navigateToUrl('https://ui.cogmento.com/')

//WebUI.sendKeys(findTestObject('commonObj_FreeCRM/login_FreeCRM/email'), Username)

//WebUI.sendKeys(findTestObject('commonObj_FreeCRM/login_FreeCRM/password'), Password)



//WebUI.setText(findTestObject('Object Repository/Variables/Page_OrangeHRM/input_txtUsername'), Username)
WebUI.sendKeys(findTestObject('commonObj_FreeCRM/login_FreeCRM/email'), findTestData("Data Files/Data_File").getValue(1,rowNum))

//WebUI.setText(findTestObject('Object Repository/Variables/Page_OrangeHRM/input_txtPassword'), Password)
WebUI.sendKeys(findTestObject('commonObj_FreeCRM/login_FreeCRM/password'), findTestData("Data Files/Data_File").getValue(2,rowNum))

Thread.sleep(3000)


WebUI.click(findTestObject('commonObj_FreeCRM/login_FreeCRM/login'))
}
WebUI.waitForElementPresent(findTestObject('commonObj_FreeCRM/login_FreeCRM/verifyLogin'), 10)

WebUI.maximizeWindow()

