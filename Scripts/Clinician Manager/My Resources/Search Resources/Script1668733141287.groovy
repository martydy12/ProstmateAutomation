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

WebUI.callTestCase(findTestCase('Login/Login_ClinicianManager'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Clinician Manager/Menu/menu_MyResources'))

WebUI.waitForElementVisible(findTestObject('Clinician Manager/MyResources/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/MyResources/page_Title'), 'RESOURCES')

WebUI.comment('Search Manually')

WebUI.click(findTestObject('Clinician Manager/MyResources/field_SearchResources'))

WebUI.setText(findTestObject('Clinician Manager/MyResources/input_SearchResources'), 'Finances')

WebUI.click(findTestObject('Clinician Manager/MyResources/search_result1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Clinician Manager/MyResources/button_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Clinician Manager/MyResources/field_SearchResources'))

WebUI.comment('Add Multiple')

WebUI.setText(findTestObject('Clinician Manager/MyResources/input_SearchResources'), 'De')

WebUI.click(findTestObject('Clinician Manager/MyResources/search_result2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Clinician Manager/MyResources/input_SearchResources'), 'De')

WebUI.click(findTestObject('Clinician Manager/MyResources/search_result1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Clinician Manager/MyResources/button_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Reset')

WebUI.click(findTestObject('Clinician Manager/MyResources/button_Reset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/MyResources/select_Resources'), 'placeholder', 'Search Resources', 
    0)

WebUI.delay(1)

WebUI.closeBrowser()

