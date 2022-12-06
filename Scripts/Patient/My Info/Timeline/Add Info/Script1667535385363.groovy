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

WebUI.click(findTestObject('Patient/Menu/menu_MyInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/text_Title'), 'MY INFO')

WebUI.click(findTestObject('Patient/My_Info/Tab/tab_Timeline'))

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_AddInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 0)

WebUI.comment('Empty Info Type')

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/validation_InfoType'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Timeline/validation_InfoType'), 'This field can\'t be empty')

WebUI.comment('Info Type: APPOINTMENT')

WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 'Appointment', false)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/select_Specialist'), 0)

WebUI.clearText(findTestObject('Patient/My_Info/Timeline/input_Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

'Empty Fields'
WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/validation_Specialist'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Timeline/validation_Specialist'), 'This field can\'t be empty')

WebUI.verifyElementText(findTestObject('Patient/My_Info/Timeline/validation_Date'), 'This field can\'t be empty')

'Input more than 250 Characters'
WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_Comment'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem!!!')

WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_Comment'), 'value', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem', 
    0)

Date today = new Date()

String todaysDate = today.format('dd-MMM-YYYY')

'Verify default date'
WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_Date'), 'value', '' + todaysDate.toString(), 
    0)

WebUI.clearText(findTestObject('Patient/My_Info/Timeline/input_Comment'))

'Save Appointment'
WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/select_Specialist'), 'Urologist', false)

WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_Comment'), 'I want to set an appointment today')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.comment('Info Type: DECISION')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_AddInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 0)

WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 'Decision', false)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/input_Date'), 0)

'Verify default date'
WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_Date'), 'value', '' + todaysDate.toString(), 
    0)

'Save Decision'
WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_Comment'), 'Automation: DECISION')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.comment('Info Type: JOURNAL')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_AddInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 0)

WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 'Journal', false)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/input_Date'), 0)

'Verify default date'
WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_Date'), 'value', '' + todaysDate.toString(), 
    0)

'Save Journal'
WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_Comment'), 'Automation: JOURNAL')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.comment('Info Type: PSA')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_AddInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 0)

WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 'PSA', false)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/input_Date'), 0)

'Verify default date'
WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_Date'), 'value', '' + todaysDate.toString(), 
    0)

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/validation_PSAResult'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Timeline/validation_PSAResult'), 'Special character not allowed')

WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_PSAResult'), '!@a')

WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_PSAResult'), 'value', '', 0)

'Save PSA'
WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_PSAResult'), '101')

WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_Comment'), 'Automation: PSA')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.comment('Info Type: TO DO')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_AddInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 0)

WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 'To Do', false)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/input_Date'), 0)

'Verify default date'
WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_Date'), 'value', '' + todaysDate.toString(), 
    0)

'Save To Do'
WebUI.click(findTestObject('Patient/My_Info/Timeline/radio_Began'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_Comment'), 'Automation: To Do')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.comment('Info Type: TREATMENT')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_AddInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 0)

WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/select_InfoType'), 'Treatment', false)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/select_TreatmentType'), 0)

'Verify default date'
WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_StartDate'), 'value', '' + todaysDate.toString(), 
    0)

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

'Empty fields'
WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/validation_TreatmentType'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Timeline/validation_TreatmentType'), 'This field can\'t be empty')

WebUI.verifyElementText(findTestObject('Patient/My_Info/Timeline/validation_TreatmentStatus'), '    Please select status')

WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/select_TreatmentType'), 'Chemotherapy', false)

'Save Treatment'
WebUI.click(findTestObject('Patient/My_Info/Timeline/radio_Planned'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Patient/My_Info/Timeline/input_Comment'), 'Automation: Treatment')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/input_Comment'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_SaveInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.closeBrowser()

