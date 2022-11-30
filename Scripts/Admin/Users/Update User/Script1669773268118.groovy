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

WebUI.callTestCase(findTestCase('Login/Login_ConfigAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Table List/page_Title'), 'USERS')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_LastName'), 'Aautomation')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_FirstName'), 'Clinician Manager')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_Email'), 'TEST_automation@email.com')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_UserType'), 'Clinician Manager')

'Already Verified'
WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_Status'), 'Active')

WebUI.delay(2)

WebUI.comment('UPDATE USER - Clinician')

WebUI.click(findTestObject('Admin/Table List/TBRecord1_LastName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/Table List/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Admin/Table List/page_Title'), 'EDIT USER')

WebUI.verifyElementAttributeValue(findTestObject('Admin/Create/input_FirstName'), 'value', 'Clinician Manager', 0)

WebUI.verifyElementAttributeValue(findTestObject('Admin/Create/input_LastName'), 'value', 'Aautomation', 0)

WebUI.verifyElementAttributeValue(findTestObject('Admin/Create/input_Email'), 'value', 'TEST_automation@email.com', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Admin/Create/select_UserType'), 'Clinician Manager', false, 0)

WebUI.clearText(findTestObject('Admin/Create/input_FirstName'))

WebUI.setText(findTestObject('Admin/Create/input_FirstName'), 'Booking Manager')

WebUI.selectOptionByLabel(findTestObject('Admin/Create/select_UserType'), 'Booking Manager', false, FailureHandling.STOP_ON_FAILURE)

'Cancel Changes'
WebUI.click(findTestObject('Admin/Create/button_Cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/Create/modal_cancel_message'), 0)

WebUI.verifyElementText(findTestObject('Admin/Create/modal_cancel_message'), 'There are unsaved changes on this page. Do you wish to proceed?')

WebUI.click(findTestObject('Admin/Create/button_YesCancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Admin/Table List/page_Title'), 'USERS')

WebUI.comment('Check if nothing was change')

WebUI.click(findTestObject('Admin/Table List/TBRecord1_LastName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/Table List/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Admin/Table List/page_Title'), 'EDIT USER')

WebUI.verifyElementAttributeValue(findTestObject('Admin/Create/input_FirstName'), 'value', 'Clinician Manager', 0)

WebUI.verifyElementAttributeValue(findTestObject('Admin/Create/input_LastName'), 'value', 'Aautomation', 0)

WebUI.verifyElementAttributeValue(findTestObject('Admin/Create/input_Email'), 'value', 'TEST_automation@email.com', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Admin/Create/select_UserType'), 'Clinician Manager', false, 0)

WebUI.delay(1)

WebUI.comment('UPDATE')

WebUI.clearText(findTestObject('Admin/Create/input_FirstName'))

WebUI.setText(findTestObject('Admin/Create/input_FirstName'), 'Booking Manager')

WebUI.selectOptionByLabel(findTestObject('Admin/Create/select_UserType'), 'Booking Manager', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Create/button_Update'))

WebUI.waitForElementVisible(findTestObject('Admin/Create/modal_feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Admin/Create/modal_feedback_message'), 'Account successfully updated.')

WebUI.click(findTestObject('Admin/Create/button_Okay'))

WebUI.delay(2)

WebUI.closeBrowser()

