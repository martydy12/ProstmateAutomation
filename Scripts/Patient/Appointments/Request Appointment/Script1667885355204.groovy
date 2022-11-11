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

WebUI.click(findTestObject('Patient/Menu/menu_Appointments'))

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/text_Title'), 'APPOINTMENTS')

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_RequestAppointment'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Appointment Request 1')

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/text_Title'), 'REQUEST APPOINTMENT')

'I want to make a medical appointment'
WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_TalkAbout1'))

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/button_SearchClinician'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_SearchClinician'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/input_SearchClinician'), 0)

WebUI.setText(findTestObject('Patient/Appointments/Request Appointment/input_SearchClinician'), 'TestClinician Automation, Medical Consultant')

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/search_result1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Patient/Appointments/Request Appointment/button_Today'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_Today'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Patient/Appointments/Request Appointment/time_1600'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/time_1600'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_Phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/input_PhoneNumber'), 0)

'Empty phone number'
WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/feedback_message'), 'Please enter your phone number')

'Input alpha and special character'
WebUI.setText(findTestObject('Patient/Appointments/Request Appointment/input_PhoneNumber'), '!@a')

WebUI.verifyElementAttributeValue(findTestObject('Patient/Appointments/Request Appointment/input_PhoneNumber'), 'value', 
    '', 0)

'Input more than 10 digits'
WebUI.setText(findTestObject('Patient/Appointments/Request Appointment/input_PhoneNumber'), '091234567890')

WebUI.verifyElementAttributeValue(findTestObject('Patient/Appointments/Request Appointment/input_PhoneNumber'), 'value', 
    '0912345678', 0)

WebUI.delay(1)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_Next'), FailureHandling.STOP_ON_FAILURE)

Date today = new Date()

String todaysDate = today.format('EEEE dd MMMM YYYY')

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/label_ConsulationDate'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Request Appointment/label_ConsulationDate'), '' + todaysDate.toString())

WebUI.verifyElementText(findTestObject('Patient/Appointments/Request Appointment/label_ConsultationTime'), '04:00 PM - 04:30 PM')

WebUI.verifyElementText(findTestObject('Patient/Appointments/Request Appointment/label_Clinician'), 'Dr. TestClinician Automation, Medical Consultant')

WebUI.verifyElementText(findTestObject('Patient/Appointments/Request Appointment/label_ContactVia'), 'Via Phone')

WebUI.scrollToElement(findTestObject('Patient/Appointments/Request Appointment/checkbox_Terms'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/checkbox_Terms'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_SendRequest'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/modal_SuccessConfirmation'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_NoThanks'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/text_Title'), 'APPOINTMENTS')

WebUI.delay(2)

WebUI.comment('Appointment Request 2')

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_RequestAppointment'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/text_Title'), 'REQUEST APPOINTMENT')

WebUI.scrollToElement(findTestObject('Patient/Appointments/Request Appointment/button_TalkAbout3'), 0)

'I want to speak about my mood and relationships'
WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_TalkAbout3'))

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/button_SearchClinician'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_SearchClinician'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/input_SearchClinician'), 0)

WebUI.setText(findTestObject('Patient/Appointments/Request Appointment/input_SearchClinician'), 'TestClinician Automation, Medical Consultant')

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/search_result1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Patient/Appointments/Request Appointment/button_Today'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_Today'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Patient/Appointments/Request Appointment/time_1200'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/time_1400'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_VideoConference'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/button_Next'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/label_ConsulationDate'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Request Appointment/label_ConsulationDate'), '' + todaysDate.toString())

WebUI.verifyElementText(findTestObject('Patient/Appointments/Request Appointment/label_ConsultationTime'), '02:00 PM - 02:30 PM')

WebUI.verifyElementText(findTestObject('Patient/Appointments/Request Appointment/label_Clinician'), 'Dr. TestClinician Automation, Medical Consultant')

WebUI.verifyElementText(findTestObject('Patient/Appointments/Request Appointment/label_ContactVia'), 'Via Video Conference')

WebUI.scrollToElement(findTestObject('Patient/Appointments/Request Appointment/checkbox_Terms'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/checkbox_Terms'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_SendRequest'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Request Appointment/modal_SuccessConfirmation'), 0)

WebUI.click(findTestObject('Patient/Appointments/Request Appointment/button_StartAssessment'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.closeBrowser()

