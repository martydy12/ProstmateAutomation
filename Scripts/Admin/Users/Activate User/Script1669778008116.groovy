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

WebUI.callTestCase(findTestCase('Login/Login_ConfigAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Table List/page_Title'), 'USERS')

WebUI.comment('UPDATE USER - Clinician')

'Deactivated'
WebUI.verifyElementText(findTestObject('Admin/Table List/TBRecord1_Status'), 'Deactivated')

WebUI.click(findTestObject('Admin/Table List/TBRecord1_LastName'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/Table List/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Admin/Table List/page_Title'), 'EDIT USER')

WebUI.verifyElementPresent(findTestObject('Admin/Activate-Deactivate/button_Activate'), 0)

WebUI.click(findTestObject('Admin/Activate-Deactivate/button_Activate'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Admin/Activate-Deactivate/label_Activate'), 0)

WebUI.verifyElementText(findTestObject('Admin/Activate-Deactivate/label_Activate'), 'ACTIVATE ADMIN')

WebUI.click(findTestObject('Admin/Activate-Deactivate/button_ActivateConfirm'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Common Objects/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/feedback_message'), 'User has been activated successfully.')

WebUI.scrollToElement(findTestObject('Admin/Activate-Deactivate/button_Deactivate'), 0)

WebUI.verifyElementPresent(findTestObject('Admin/Activate-Deactivate/button_Deactivate'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

