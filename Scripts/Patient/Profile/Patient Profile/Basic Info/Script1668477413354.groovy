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

WebUI.callTestCase(findTestCase('Login_Patient'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_Profile'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_Profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/Basic Info/menu_BasicInfo'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Profile/Basic Info/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Profile/Basic Info/page_Title'), 'BASIC INFORMATION')

WebUI.comment('BASIC INFORMATION - Next button')

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_FirstName'), 'value', 'Patient', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_LastName'), 'value', 'Test', 0)

'Input Preferred Name'
WebUI.setText(findTestObject('Profile/Basic Info/input_PreferredName'), 'Automation Patient')

WebUI.clearText(findTestObject('Profile/Basic Info/input_DateBirth'), FailureHandling.STOP_ON_FAILURE)

'Update Birthday'
WebUI.setText(findTestObject('Profile/Basic Info/input_DateBirth'), '25-Dec-1950')

'Add Gender'
WebUI.selectOptionByLabel(findTestObject('Profile/Basic Info/select_GenderID'), 'Male', false)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_Postcode'), 'value', '1111', 0)

WebUI.comment('ADD CONTACT DETAILS')

'Add Preferred Contact Method'
WebUI.selectOptionByLabel(findTestObject('Profile/Basic Info/select_ContactMethod'), 'Phone', false)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_Email'), 'value', 'TestPatient2@email.com', 0)

'Select Primary Phone Type'
WebUI.selectOptionByLabel(findTestObject('Profile/Basic Info/select_PhoneType'), 'Mobile', false)

'Add Primary Phone Number'
WebUI.setText(findTestObject('Profile/Basic Info/input_PhoneNum'), '0911223344', FailureHandling.STOP_ON_FAILURE)

WebUI.comment('ADD Medical / Insurance')

'Add Medicare No'
WebUI.setText(findTestObject('Profile/Basic Info/input_Medicare'), '2345567711', FailureHandling.STOP_ON_FAILURE)

'Add Position ID'
WebUI.setText(findTestObject('Profile/Basic Info/input_PositionNo'), '5', FailureHandling.STOP_ON_FAILURE)

'Select Private Health Insurance'
WebUI.selectOptionByLabel(findTestObject('Profile/Basic Info/select_PrivateHealthInsurance'), 'Yes', false)

WebUI.comment('ADD Emergency Contact')

WebUI.setText(findTestObject('Profile/Basic Info/input_EmergencyName'), 'Cassy Freeman', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Profile/Basic Info/input_EmergencyRelationship'), 'Daughter', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Profile/Basic Info/input_EmergencyPhoneNum'), '1299333333', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Profile/Basic Info/select_EmergencyPhoneType'), 'Mobile', false)

WebUI.delay(2)

WebUI.click(findTestObject('Profile/Basic Info/button_Next'))

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/feedback_message'), 'Changes saved successfully')

WebUI.verifyElementText(findTestObject('Profile/Medical Info/page_Title'), 'MEDICAL INFO')

WebUI.delay(2)

WebUI.comment('Upload Image - SAVE Button')

WebUI.click(findTestObject('Profile/Medical Info/menu_BasicInfo'))

WebUI.waitForElementVisible(findTestObject('Profile/Basic Info/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Profile/Basic Info/page_Title'), 'BASIC INFORMATION')

'Change the path in variable base on the location of the image in your device'
WebUI.uploadFile(findTestObject('Profile/Basic Info/button_UploadImage'), Upload)

WebUI.comment('Check if changes was save')

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_FirstName'), 'value', 'Patient', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_LastName'), 'value', 'Test', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_PreferredName'), 'value', 'Automation Patient', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_DateBirth'), 'value', '25-Dec-1950', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Basic Info/select_GenderID'), 'Male', false, 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_Postcode'), 'value', '1111', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Basic Info/select_ContactMethod'), 'Phone', false, 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_Email'), 'value', 'TestPatient2@email.com', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Basic Info/select_PhoneType'), 'Mobile', false, 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_PhoneNum'), 'value', '0911223344', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_Medicare'), 'value', '2345567711', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_PositionNo'), 'value', '5', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Basic Info/select_PrivateHealthInsurance'), 'Yes', false, 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_EmergencyName'), 'value', 'Cassy Freeman', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_EmergencyRelationship'), 'value', 'Daughter', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_EmergencyPhoneNum'), 'value', '1299333333', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Basic Info/select_EmergencyPhoneType'), 'Mobile', false, 0)

WebUI.scrollToElement(findTestObject('Profile/Basic Info/button_Save'), 0)

WebUI.click(findTestObject('Profile/Basic Info/button_Save'))

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/feedback_message'), 'Changes saved successfully')

'To check if file was uploaded successfully'
WebUI.verifyElementPresent(findTestObject('Profile/Basic Info/modal_FileUploadSuccess'), 0)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/Basic Info/button_FileModalClose'))

WebUI.delay(2)

WebUI.closeBrowser()

