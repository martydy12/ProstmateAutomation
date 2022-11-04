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

WebUI.click(findTestObject('Patient/menu_MyInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/text_Title'), 'MY INFO')

WebUI.click(findTestObject('Patient/My_Info/tab_PSA'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/PSA/button_EnterPSALevel'), 0)

WebUI.click(findTestObject('Patient/My_Info/PSA/button_EnterPSALevel'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/PSA/input_Date'), 0)

Date today = new Date()

String todaysDate = today.format('dd-MMM-YYYY')

'Verify default date'
WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/Timeline/input_Date'), 'value', '' + todaysDate.toString(), 
    0)

WebUI.scrollToElement(findTestObject('Patient/My_Info/PSA/button_Save'), 0)

WebUI.click(findTestObject('Patient/My_Info/PSA/button_Save'))

'Empty field'
WebUI.waitForElementVisible(findTestObject('Patient/My_Info/PSA/validation_PSAResult'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/PSA/validation_PSAResult'), 'Required field!')

'Input more than 250 Characters'
WebUI.setText(findTestObject('Patient/My_Info/PSA/input_Comment'), 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem!!!')

WebUI.verifyElementAttributeValue(findTestObject('Patient/My_Info/PSA/input_Comment'), 'value', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.Lorem', 
    0)

