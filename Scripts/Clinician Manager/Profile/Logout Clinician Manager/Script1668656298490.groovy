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

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_Logout_2'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_Logout_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Profile/Logout/modal_iframe'), 0)

WebUI.comment('Cancel Logout')

WebUI.waitForElementVisible(findTestObject('Profile/Logout/modal_LogoutConfirmation'), 0)

WebUI.click(findTestObject('Profile/Logout/button_Cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.comment('Cancel Logout')

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_Logout_2'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_Logout_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Profile/Logout/modal_iframe'), 0)

WebUI.waitForElementVisible(findTestObject('Profile/Logout/modal_LogoutConfirmation'), 0)

WebUI.click(findTestObject('Profile/Logout/button_YesLogout'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Common Objects/text_Login'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/text_Login'), 'LOGIN')

WebUI.closeBrowser()

