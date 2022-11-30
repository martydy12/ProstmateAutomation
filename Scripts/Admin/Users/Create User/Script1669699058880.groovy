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

WebUI.click(findTestObject('Admin/Create/button_Create'))

WebUI.waitForElementVisible(findTestObject('Admin/Table List/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Admin/Table List/page_Title'), 'CREATE USER')

WebUI.comment('Validations')

'Submit empty fields'
WebUI.click(findTestObject('Admin/Create/button_Create'))

WebUI.verifyElementText(findTestObject('Admin/Create/validation_FirstName'), 'This field can\'t be empty.')

WebUI.verifyElementText(findTestObject('Admin/Create/validation_LastName'), 'This field can\'t be empty.')

WebUI.verifyElementText(findTestObject('Admin/Create/validation_Email'), 'This field can\'t be empty.')

WebUI.verifyElementText(findTestObject('Admin/Create/validation_UserType'), 'This field can\'t be empty.')

WebUI.delay(1)

'Submit invalid email'
WebUI.setText(findTestObject('Admin/Create/input_Email'), 'Test@@gmail.com')

WebUI.click(findTestObject('Admin/Create/button_Create'))

WebUI.verifyElementText(findTestObject('Admin/Create/validation_Email'), 'Invalid email address. Please enter a valid email address.')

WebUI.clearText(findTestObject('Admin/Create/input_Email'), FailureHandling.STOP_ON_FAILURE)

'Submit existing email'
WebUI.setText(findTestObject('Admin/Create/input_Email'), 'TestClinicianManager@email.com')

WebUI.click(findTestObject('Admin/Create/button_Create'))

WebUI.verifyElementText(findTestObject('Admin/Create/validation_Email'), 'Email already registered. Please enter a different email address.')

WebUI.clearText(findTestObject('Admin/Create/input_Email'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

'Verify options present'
WebUI.verifyOptionsPresent(findTestObject('Admin/Create/select_UserType'), ['Please Select', 'Clinician Manager', 'Booking Manager'])

WebUI.delay(1)

WebUI.comment('CREATE USER - Clinician Manager')

WebUI.setText(findTestObject('Admin/Create/input_FirstName'), 'Clinician Manager')

WebUI.setText(findTestObject('Admin/Create/input_LastName'), 'Aautomation')

WebUI.setText(findTestObject('Admin/Create/input_Email'), 'TEST_automation@email.com')

WebUI.selectOptionByLabel(findTestObject('Admin/Create/select_UserType'), 'Clinician Manager', false)

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Create/button_Create'))

WebUI.waitForElementVisible(findTestObject('Admin/Create/modal_feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Admin/Create/modal_feedback_message'), 'Account successfully created.')

WebUI.click(findTestObject('Admin/Create/button_Okay'))

WebUI.comment('CHECK IF CREATED USER WAS DISPLAYED')

WebUI.waitForElementVisible(findTestObject('Admin/Table List/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Admin/Table List/page_Title'), 'USERS')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_LastName'), 'Aautomation')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_FirstName'), 'Clinician Manager')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_Email'), 'TEST_automation@email.com')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_UserType'), 'Clinician Manager')

WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_Status'), 'Registered')

WebUI.delay(2)

WebUI.closeBrowser()

