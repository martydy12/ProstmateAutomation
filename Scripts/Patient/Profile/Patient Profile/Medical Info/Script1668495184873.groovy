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

WebUI.callTestCase(findTestCase('Login/Login_Patient'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_Profile'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_Profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/Basic Info/menu_MedicalInfo'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Profile/Medical Info/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Profile/Medical Info/page_Title'), 'MEDICAL INFO')

WebUI.click(findTestObject('Profile/Medical Info/input_DiagnosisDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/Medical Info/button_Today'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Profile/Medical Info/select_Stage'), 'Diagnosis', false)

WebUI.selectOptionByLabel(findTestObject('Profile/Medical Info/select_FamilyHistory'), 'Unsure', false)

WebUI.setText(findTestObject('Profile/Medical Info/input_Height'), '150')

WebUI.setText(findTestObject('Profile/Medical Info/input_Weight'), '55')

WebUI.comment('GP Details')

WebUI.setText(findTestObject('Profile/Medical Info/input_GPName'), 'Mike Flores')

WebUI.setText(findTestObject('Profile/Medical Info/input_GPAddress'), 'Melbourne')

WebUI.setText(findTestObject('Profile/Medical Info/input_GPPhone'), '2234444111')

WebUI.comment('Specialist Details')

WebUI.setText(findTestObject('Profile/Medical Info/input_SpecialistName'), 'Andrew Whales')

WebUI.setText(findTestObject('Profile/Medical Info/input_SpecialistAddress'), 'Queensland')

WebUI.setText(findTestObject('Profile/Medical Info/input_SpecialistPhone'), '5562854311')

WebUI.selectOptionByLabel(findTestObject('Profile/Medical Info/select_Specialty'), 'Medical Oncologist', false)

WebUI.comment('Medication / Allergies')

WebUI.setText(findTestObject('Profile/Medical Info/textarea_CurrentMedication'), 'Highblood Maintenance')

WebUI.setText(findTestObject('Profile/Medical Info/textarea_Allergies'), 'NONE')

WebUI.comment('Any Difficulties')

WebUI.scrollToElement(findTestObject('Profile/Medical Info/textarea_Allergies'), 0)

WebUI.check(findTestObject('Profile/Medical Info/checkbox_Osteoporosis'))

WebUI.check(findTestObject('Profile/Medical Info/checkbox_HighBlood'))

WebUI.check(findTestObject('Profile/Medical Info/checkbox_Arthritis'))

WebUI.scrollToElement(findTestObject('Profile/Medical Info/button_Save'), 0)

WebUI.click(findTestObject('Profile/Medical Info/button_Save'))

WebUI.waitForElementVisible(findTestObject('Common Objects/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/feedback_message'), 'Changes saved successfully')

WebUI.delay(2)

WebUI.comment('Check if changes was saved')

Date today = new Date()

String todaysDate = today.format('dd-MMM-YYYY')

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_DiagnosisDate'), 'value', '' + todaysDate.toString(), 
    0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Medical Info/select_Stage'), 'Diagnosis', false, 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Medical Info/select_FamilyHistory'), 'Unsure', false, 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_Height'), 'value', '150', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_Weight'), 'value', '55', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_GPName'), 'value', 'Mike Flores', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_GPAddress'), 'value', 'Melbourne', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_GPPhone'), 'value', '2234444111', 0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_SpecialistName'), 'value', 'Andrew Whales', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_SpecialistAddress'), 'value', 'Queensland', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/input_SpecialistPhone'), 'value', '5562854311', 0)

WebUI.verifyOptionSelectedByLabel(findTestObject('Profile/Medical Info/select_Specialty'), 'Medical Oncologist', false, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/textarea_CurrentMedication'), 'value', 'Highblood Maintenance', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Medical Info/textarea_Allergies'), 'value', 'NONE', 0)

WebUI.verifyElementChecked(findTestObject('Profile/Medical Info/checkbox_Osteoporosis'), 0)

WebUI.verifyElementChecked(findTestObject('Profile/Medical Info/checkbox_HighBlood'), 0)

WebUI.verifyElementChecked(findTestObject('Profile/Medical Info/checkbox_Arthritis'), 0)

WebUI.closeBrowser()

