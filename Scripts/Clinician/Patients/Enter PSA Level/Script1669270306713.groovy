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

WebUI.click(findTestObject('Clinician/Menu/menu_Patients'))

WebUI.verifyElementText(findTestObject('Clinician/Patients/Common/page_Title'), 'MY PATIENTS')

WebUI.setText(findTestObject('Clinician/Patients/Search/input_SearchPatient'), 'Automation')

WebUI.click(findTestObject('Clinician/Patients/Search/button_Search'))

WebUI.waitForElementVisible(findTestObject('Clinician/Patients/Search/TBRecord1'), 0)

WebUI.click(findTestObject('Clinician/Patients/Search/TBRecord1_FirstName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Clinician/Patients/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician/Patients/Common/page_Title'), 'PATIENT TEST AUTOMATION')

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Clinician/Patients/Tab/tab_PSA'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementVisible(findTestObject('Clinician/Patients/PSA/button_EnterPSALevel'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Clinician/Patients/PSA/button_EnterPSALevel'))
} else {
    WebUI.click(findTestObject('Clinician/Patients/PSA/button_EnterPSALevel_NoRecords'))
}

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Default Date')

Date today = new Date()

String todaysDate = today.format('dd-MMM-YYYY')

'Verify default date'
WebUI.verifyElementAttributeValue(findTestObject('Clinician/Patients/PSA/input_Date'), 'value', '' + todaysDate.toString(), 
    0)

WebUI.comment('Validations')

WebUI.scrollToElement(findTestObject('Clinician/Patients/PSA/input_PSAResult'), 0)

'Submit empty PSA result'
WebUI.click(findTestObject('Clinician/Patients/PSA/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Clinician/Patients/PSA/input_Date'), 0)

WebUI.waitForElementVisible(findTestObject('Clinician/Patients/PSA/validation_PSAResult'), 0)

WebUI.verifyElementText(findTestObject('Clinician/Patients/PSA/validation_PSAResult'), 'Required field!')

'Input non numeric characters'
WebUI.setText(findTestObject('Clinician/Patients/PSA/input_PSAResult'), 'asd@!')

WebUI.verifyElementAttributeValue(findTestObject('Clinician/Patients/PSA/input_PSAResult'), 'value', '', 0)

WebUI.delay(1)

'Input more than 250 Characters'
WebUI.setText(findTestObject('Clinician/Patients/PSA/input_Comment'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem!!!')

WebUI.verifyElementAttributeValue(findTestObject('Clinician/Patients/PSA/input_Comment'), 'value', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem', 
    0)

WebUI.clearText(findTestObject('Clinician/Patients/PSA/input_PSAResult'))

WebUI.delay(1)

WebUI.comment('Save PSA result')

WebUI.setText(findTestObject('Clinician/Patients/PSA/input_PSAResult'), '85')

WebUI.setText(findTestObject('Clinician/Patients/PSA/input_Comment'), 'Enter PSA - Automation ')

WebUI.scrollToElement(findTestObject('Clinician/Patients/PSA/input_PSAResult'), 0)

WebUI.click(findTestObject('Clinician/Patients/PSA/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Common Objects/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

