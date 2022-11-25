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

WebUI.click(findTestObject('Clinician/Patients/Tab/tab_Notes'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Add New Note')

WebUI.click(findTestObject('Clinician/Notes/button_AddNewNote'))

WebUI.waitForElementVisible(findTestObject('Clinician/Notes/textarea_PatientNote'), 0)

'Input more than 500 characters'
WebUI.setText(findTestObject('Clinician/Notes/textarea_PatientNote'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop!!!!')

WebUI.verifyElementAttributeValue(findTestObject('Clinician/Notes/textarea_PatientNote'), 'value', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop!!', 
    0)

WebUI.delay(1)

WebUI.clearText(findTestObject('Clinician/Notes/textarea_PatientNote'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Clinician/Notes/textarea_PatientNote'), 'Automation - Test Note')

WebUI.delay(1)

WebUI.click(findTestObject('Clinician/Notes/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Common Objects/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/feedback_message'), 'Patient note successfully saved!')

WebUI.delay(2)

WebUI.comment('Search non existing Note')

WebUI.setText(findTestObject('Clinician/Notes/input_SearchNote'), 'Don\'t know')

WebUI.click(findTestObject('Clinician/Notes/button_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician/Notes/label_NoRecords'), 0)

WebUI.verifyElementText(findTestObject('Clinician/Notes/label_NoRecords'), 'No items to show...')

WebUI.delay(2)

WebUI.comment('Reset')

WebUI.click(findTestObject('Clinician/Notes/button_Reset'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Clinician/Notes/input_SearchNote'), 'placeholder', 'Search Notes', 0)

WebUI.delay(2)

WebUI.comment('Search the created note')

Date today = new Date()

String todaysDate = today.format('dd-mm-yy')

WebUI.setText(findTestObject('Clinician/Notes/input_SearchNote'), 'Automation - Test Note')

WebUI.click(findTestObject('Clinician/Notes/button_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician/Notes/TBRecord1'), 0)

WebUI.verifyElementText(findTestObject('Clinician/Notes/TBRecord1_Date'), '' + todaysDate.toString())

WebUI.verifyElementText(findTestObject('Clinician/Notes/TBRecord1_Clinician'), 'TestClinician Automation')

WebUI.verifyElementText(findTestObject('Clinician/Notes/TBRecord1_Type'), 'General')

WebUI.verifyElementText(findTestObject('Clinician/Notes/TBRecord1_NoteDetails'), 'Automation - Test Note')

WebUI.delay(2)

WebUI.closeBrowser()

