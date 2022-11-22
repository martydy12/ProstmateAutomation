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

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Search/TBRecord1_Status'), 'Active')

WebUI.click(findTestObject('Clinician Manager/Clinician/Search/TBRecord1_LastName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Common/page_Title'), 'EDIT CLINICIAN')

WebUI.scrollToElement(findTestObject('Clinician Manager/Clinician/Activate-Deactivate/button_Deactivate'), 0)

WebUI.verifyElementPresent(findTestObject('Clinician Manager/Clinician/Activate-Deactivate/button_Deactivate'), 0)

WebUI.click(findTestObject('Clinician Manager/Clinician/Activate-Deactivate/button_Deactivate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Clinician Manager/Clinician/Activate-Deactivate/label_Deactivate'), 0)

WebUI.verifyElementText(findTestObject('Clinician Manager/Clinician/Activate-Deactivate/label_Deactivate'), 'DEACTIVATE USER')

WebUI.click(findTestObject('Clinician Manager/Clinician/Activate-Deactivate/button_DeactivateConfirm'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Common Objects/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/feedback_message'), 'User has been deactivated successfully.')

WebUI.scrollToElement(findTestObject('Clinician Manager/Clinician/Activate-Deactivate/button_Activate'), 0)

WebUI.verifyElementPresent(findTestObject('Clinician Manager/Clinician/Activate-Deactivate/button_Activate'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

