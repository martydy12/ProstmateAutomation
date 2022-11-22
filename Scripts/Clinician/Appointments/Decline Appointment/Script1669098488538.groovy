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

WebUI.click(findTestObject('Clinician/Menu/menu_Appointments'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Clinician/Appointments/Common/page_Title'), 'APPOINTMENTS')

WebUI.click(findTestObject('Clinician/Appointments/Tab/tab_Pending'))

if (WebUI.verifyElementVisible(findTestObject('Clinician/Appointments/Pending/TBRecord1'), FailureHandling.OPTIONAL)) {
    WebUI.comment('Cancel Decline Appointment')

    WebUI.click(findTestObject('Clinician/Appointments/Pending/TBRecord1_Decline'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Clinician/Appointments/Pending/modal_Decline'), 0)

    WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Clinician/Appointments/Pending/button_DeclineNo'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Clinician/Appointments/Common/page_Title'), 0)

    WebUI.delay(2)

    WebUI.comment('Decline Appointment')

    WebUI.click(findTestObject('Clinician/Appointments/Pending/TBRecord1_Decline'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Clinician/Appointments/Pending/modal_Decline'), 0)

    WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Clinician/Appointments/Pending/textarea_DeclinedComment'), 'I am out sick today, please request another time and day. Thanks')

    WebUI.click(findTestObject('Clinician/Appointments/Pending/button_DeclineYes'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementVisible(findTestObject('Clinician/Appointments/Pending/label_NoRecord'), FailureHandling.OPTIONAL)

    WebUI.verifyElementText(findTestObject('Clinician/Appointments/Pending/label_NoRecord'), 'It looks like you don\'t have any appointments...')
}

WebUI.delay(3)

WebUI.closeBrowser()

