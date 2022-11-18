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

WebUI.click(findTestObject('Clinician Manager/Menu/menu_Clinicians'))

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 'CLINICIANS')

WebUI.comment('Search Created Clinician')

WebUI.setText(findTestObject('Clinician Manager/Clinician/Search/input_SearchClinician'), 'Madden')

WebUI.click(findTestObject('Clinician Manager/Clinician/Search/button_SearchClinician'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Search/TBRecord1'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Search/TBRecord1_LastName'), 'Madden')

WebUI.click(findTestObject('Clinician Manager/Clinician/Search/TBRecord1_LastName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 'EDIT CLINICIAN')

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianFirstName'), 'value', 
    'David', 0)

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianLastName'), 'value', 
    'Madden', 0)

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/Input_ClinicianEmail'), 'value', 'david.maiden@email.com', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianPhoneNumber'), 'value', 
    '4142236612', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Clinician Manager/Clinician/Create/dropdown_ClinicianSpecialty'), 'Medical Consultant', 
    false, 0)

WebUI.comment('Emty fields')

WebUI.clearText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianFirstName'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianLastName'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianPhoneNumber'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Clinician Manager/Clinician/Create/dropdown_ClinicianSpecialty'), 'Please select', 
    false)

WebUI.scrollToElement(findTestObject('Clinician Manager/Clinician/Create/button_Update'), 0)

WebUI.click(findTestObject('Clinician Manager/Clinician/Create/button_Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Create/validation_FirstName'), 'This field can\'t be empty.')

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Create/validation_LastName'), 'This field can\'t be empty.')

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Create/validation_PhoneNumber'), 'This field can\'t be empty.')

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Create/validation_Specialty'), 'This field can\'t be empty.')

WebUI.delay(1)

WebUI.comment('Name validations')

'First Name - Input more than 50 charactes'
WebUI.setText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianFirstName'), 'Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.')

'Only 50 characters'
WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianFirstName'), 'value', 
    'Hubert Blaine Wolfeschlegelsteinhausenbergerdorff ', 0)

'Last Name - Input more than 50 charactes'
WebUI.setText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianLastName'), 'Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.')

'Only 50 characters'
WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianLastName'), 'value', 
    'Hubert Blaine Wolfeschlegelsteinhausenbergerdorff ', 0)

WebUI.delay(1)

WebUI.comment('Phone Number Validations')

'Input alpha and special characters'
WebUI.setText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianPhoneNumber'), '@@asd')

'Cannot input'
WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianPhoneNumber'), 'value', 
    '', 0)

WebUI.delay(1)

WebUI.comment('Cancel')

WebUI.click(findTestObject('Clinician Manager/Clinician/Create/button_Cancel'))

WebUI.click(findTestObject('Clinician Manager/Clinician/Create/button_CancelYes'))

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 'CLINICIANS')

WebUI.delay(1)

WebUI.setText(findTestObject('Clinician Manager/Clinician/Search/input_SearchClinician'), 'Madden')

WebUI.click(findTestObject('Clinician Manager/Clinician/Search/button_SearchClinician'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Search/TBRecord1'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Search/TBRecord1_LastName'), 'Madden')

WebUI.click(findTestObject('Clinician Manager/Clinician/Search/TBRecord1_LastName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 'EDIT CLINICIAN')

WebUI.clearText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianFirstName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianFirstName'), 'Mark David')

WebUI.clearText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianPhoneNumber'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianPhoneNumber'), '4553322761')

WebUI.scrollToElement(findTestObject('Clinician Manager/Clinician/Create/button_Update'), 0)

WebUI.click(findTestObject('Clinician Manager/Clinician/Create/button_Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Create/modal_feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Create/modal_feedback_message'), 'Account successfully updated.')

WebUI.click(findTestObject('Clinician Manager/Clinician/Create/button_Okay'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 'CLINICIANS')

WebUI.comment('Check if successfully updated')

WebUI.setText(findTestObject('Clinician Manager/Clinician/Search/input_SearchClinician'), 'Madden')

WebUI.click(findTestObject('Clinician Manager/Clinician/Search/button_SearchClinician'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Search/TBRecord1'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Search/TBRecord1_LastName'), 'Madden')

WebUI.click(findTestObject('Clinician Manager/Clinician/Search/TBRecord1_LastName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 'EDIT CLINICIAN')

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianFirstName'), 'value', 
    'Mark David', 0)

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianLastName'), 'value', 
    'Madden', 0)

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/Input_ClinicianEmail'), 'value', 'david.maiden@email.com', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Clinician Manager/Clinician/Create/input_ClinicianPhoneNumber'), 'value', 
    '4553322761', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Clinician Manager/Clinician/Create/dropdown_ClinicianSpecialty'), 'Medical Consultant', 
    false, 0)

WebUI.delay(2)

WebUI.closeBrowser()

