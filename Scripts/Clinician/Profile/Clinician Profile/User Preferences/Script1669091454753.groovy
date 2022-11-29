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

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_Profile'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_Profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Profile/Clinician Additional Basic Info/menu_UserPreferences'), 0)

WebUI.click(findTestObject('Profile/Clinician Additional Basic Info/menu_UserPreferences'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Profile/User Preferences/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Profile/User Preferences/page_Title'), 'USER PREFERENCES')

WebUI.comment('Change Language to Thai')

WebUI.click(findTestObject('Profile/User Preferences/select_Language'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/User Preferences/option_Thai'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/User Preferences/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Common Objects/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/feedback_message'), 'ตั้งค่าภาษาที่ต้องการสำเร็จแล้ว')

WebUI.verifyElementText(findTestObject('Profile/User Preferences/page_Title'), 'ความพอใจของผู้ใช้')

WebUI.delay(2)

WebUI.comment('Change Language to English')

WebUI.click(findTestObject('Profile/User Preferences/select_Language'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/User Preferences/option_English'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Profile/User Preferences/button_SaveThai'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Common Objects/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/feedback_message'), 'Preferred Language Successfully Set')

WebUI.verifyElementText(findTestObject('Profile/User Preferences/page_Title'), 'USER PREFERENCES')

WebUI.delay(2)

WebUI.closeBrowser()

