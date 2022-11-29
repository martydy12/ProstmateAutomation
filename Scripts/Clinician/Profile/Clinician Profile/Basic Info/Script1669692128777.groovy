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

WebUI.callTestCase(findTestCase('Login/Login_Clinician'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_Profile'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_Profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/Clinician Additional Basic Info/menu_BasicInfo'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Profile/Basic Info/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Profile/Basic Info/page_Title'), 'MY PROFILE')

WebUI.comment('Save Info - Next button')

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_FirstName'), 'value', 'TestClinician', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_LastName'), 'value', 'Automation', 0)

WebUI.clearText(findTestObject('Profile/Basic Info/input_DateBirth'), FailureHandling.STOP_ON_FAILURE)

'Update Birthday'
WebUI.setText(findTestObject('Profile/Basic Info/input_DateBirth'), '20-Mar-1970')

WebUI.delay(1)

WebUI.comment('ADD ORGANISATION')

WebUI.click(findTestObject('Profile/Clinician Additional Basic Info/input_OrgName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Profile/Clinician Additional Basic Info/input_OrgName'), 'DBR Health Foundation')

WebUI.setText(findTestObject('Profile/Clinician Additional Basic Info/input_OrgAddress'), 'Melbourne Australia')

WebUI.setText(findTestObject('Profile/Clinician Additional Basic Info/input_OrgSuburb'), '54143')

WebUI.selectOptionByLabel(findTestObject('Profile/Clinician Additional Basic Info/select_OrgState'), 'NSW', false)

WebUI.setText(findTestObject('Profile/Clinician Additional Basic Info/input_OrgPostcode'), '5531')

WebUI.delay(1)

WebUI.comment('CONTACT DETAILS')

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_Email'), 'value', 'TestClinician@email.com', 
    0)

WebUI.selectOptionByLabel(findTestObject('Profile/Basic Info/select_PhoneType'), 'Mobile', false)

'Update Phone'
WebUI.setText(findTestObject('Profile/Basic Info/input_PhoneNum'), '0988776651', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('ROLE/IDENTIFICATION')

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Clinician Additional Basic Info/select_Specialty'), 'Medical Consultant', 
    false, 0)

WebUI.setText(findTestObject('Profile/Clinician Additional Basic Info/input_APHRAID'), '763449211', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Profile/Clinician Additional Basic Info/textarea_BIO'), 'Swiss-German physician and leading health reformer. Paracelsus founded the discipline of toxicology and pioneered the use of chemicals in treating patients. He rebelled against the medical orthodoxy of the day, emphasising practical experience rather than ancient scriptures. He was also one of the first doctors to note illnesses can be psychological in nature.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Profile/Basic Info/button_Save'), 0)

WebUI.click(findTestObject('Profile/Basic Info/button_Save'))

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/feedback_message'), 'Changes saved successfully')

WebUI.delay(2)

WebUI.comment('CHECK IF CHANGES WAS SAVE')

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_FirstName'), 'value', 'TestClinician', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_LastName'), 'value', 'Automation', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_DateBirth'), 'value', '20-Mar-1970', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Clinician Additional Basic Info/input_OrgName'), 'value', 'DBR Health Foundation', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Clinician Additional Basic Info/input_OrgAddress'), 'value', 'Melbourne Australia', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Clinician Additional Basic Info/input_OrgSuburb'), 'value', '54143', 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Clinician Additional Basic Info/select_OrgState'), 'NSW', false, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Clinician Additional Basic Info/input_OrgPostcode'), 'value', 
    '5531', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_Email'), 'value', 'TestClinician@email.com', 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Basic Info/select_PhoneType'), 'Mobile', false, 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Basic Info/input_PhoneNum'), 'value', '0988776651', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Clinician Additional Basic Info/select_Specialty'), 'Medical Consultant', 
    false, 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Clinician Additional Basic Info/input_APHRAID'), 'value', '763449211', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Clinician Additional Basic Info/textarea_BIO'), 'value', 'Swiss-German physician and leading health reformer. Paracelsus founded the discipline of toxicology and pioneered the use of chemicals in treating patients. He rebelled against the medical orthodoxy of the day, emphasising practical experience rather than ancient scriptures. He was also one of the first doctors to note illnesses can be psychological in nature.', 
    0)

WebUI.delay(2)

WebUI.comment('UPLOAD IMAGE')

'Change the path in variable base on the location of the image in your device'
WebUI.uploadFile(findTestObject('Profile/Clinician Additional Basic Info/button_UploadImage'), Upload)

WebUI.scrollToElement(findTestObject('Profile/Basic Info/button_Save'), 0)

WebUI.click(findTestObject('Profile/Basic Info/button_Save'))

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/feedback_message'), 'Changes saved successfully')

'To check if file was uploaded successfully'
WebUI.waitForElementVisible(findTestObject('Profile/Basic Info/modal_FileUploadSuccess'), 0)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/Basic Info/button_FileModalClose'))

WebUI.delay(2)

WebUI.closeBrowser()

