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

WebUI.click(findTestObject('Patient/Menu/menu_MyInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/text_Title'), 'MY INFO')

WebUI.click(findTestObject('Patient/My_Info/Tab/tab_Timeline'))

WebUI.click(findTestObject('Patient/My_Info/View by Type/dropdown_SelectType'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Patient/My_Info/View by Type/checkbox_SelectAll'))

WebUI.delay(2)

WebUI.check(findTestObject('Patient/My_Info/View by Type/checkbox_Treatment'))

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/label_Date'), 0)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/dropdown_EditDelete1'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/dropdown_EditDelete1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/button_Edit1'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_Edit1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/edit_select_InfoType'), 0)

WebUI.comment('Update 1st record')

WebUI.click(findTestObject('Patient/My_Info/Timeline/radio_Began'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Patient/My_Info/Timeline/edit_input_Comment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Patient/My_Info/Timeline/edit_input_Comment'), 'Chemotherapy has began')

WebUI.delay(2)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.comment('Update 2nd record')

Date today = new Date()

String todaysDate = today.format('dd-MMM-YYYY')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.click(findTestObject('Patient/My_Info/View by Type/dropdown_SelectType'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Patient/My_Info/View by Type/checkbox_SelectAll'))

WebUI.delay(2)

WebUI.check(findTestObject('Patient/My_Info/View by Type/checkbox_ToDo'))

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/label_Date'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/dropdown_EditDelete1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/button_Edit1'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_Edit1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/edit_select_InfoType'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/radio_Completed'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Patient/My_Info/Timeline/edit_input_CompletedDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Patient/My_Info/Timeline/edit_input_CompletedDate'), '' + todaysDate.toString())

WebUI.clearText(findTestObject('Patient/My_Info/Timeline/edit_input_Comment'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Patient/My_Info/Timeline/edit_input_Comment'), ((('Completed TASKS:' + '\n') + '-Check up') + 
    '\n') + '-Drink Medicine')

WebUI.delay(2)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.delay(2)

WebUI.comment('Update 3rd record')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.click(findTestObject('Patient/My_Info/View by Type/dropdown_SelectType'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Patient/My_Info/View by Type/checkbox_SelectAll'))

WebUI.delay(2)

WebUI.check(findTestObject('Patient/My_Info/View by Type/checkbox_PSA'))

WebUI.scrollToElement(findTestObject('Patient/My_Info/Timeline/label_Date'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/dropdown_EditDelete1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/button_Edit1'), 0)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_Edit1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Timeline/edit_select_InfoType'), 0)

WebUI.selectOptionByLabel(findTestObject('Patient/My_Info/Timeline/edit_select_InfoType'), 'Journal', false)

WebUI.setText(findTestObject('Patient/My_Info/Timeline/edit_input_Comment'), 'Update PSA to Journal', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Patient/My_Info/Timeline/button_Update'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Life Event successfully added')

WebUI.closeBrowser()

