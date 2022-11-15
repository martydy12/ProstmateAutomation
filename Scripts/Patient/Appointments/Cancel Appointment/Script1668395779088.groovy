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

'IMPORTANT: Make resolution 1920x1080, Scale 125%-150% before execution'
WebUI.callTestCase(findTestCase('Login/Login_Patient'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Patient/Menu/menu_Appointments'))

WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/text_Title'), 'APPOINTMENTS')

if (WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Tab/tab_Today'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Patient/Appointments/Tab/tab_Pending'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/table_Record'), 0)

    if (WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1'), FailureHandling.OPTIONAL)) {
        WebUI.comment('Cancel Cancellation')

        WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1'), FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Patient/Appointments/Pending/TBRecord1_MenuCancel'), FailureHandling.STOP_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1_Cancel'), 0)

        WebUI.click(findTestObject('Patient/Appointments/Pending/TBRecord1_Cancel'), FailureHandling.STOP_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/modal_CancelAppointment'), 0)

        WebUI.click(findTestObject('Patient/Appointments/Pending/button_CancelNo'), FailureHandling.STOP_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/text_Title'), 0)

        WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/text_Title'), 'APPOINTMENTS')

        WebUI.click(findTestObject('Patient/Appointments/Tab/tab_Pending'), FailureHandling.STOP_ON_FAILURE)

        WebUI.comment('Cancel Appointment ')

        WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1'), FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Patient/Appointments/Pending/TBRecord1_MenuCancel'), FailureHandling.STOP_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1_Cancel'), 0)

        WebUI.click(findTestObject('Patient/Appointments/Pending/TBRecord1_Cancel'), FailureHandling.STOP_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/modal_CancelAppointment'), 0)

        WebUI.click(findTestObject('Patient/Appointments/Pending/button_CancelYes'), FailureHandling.STOP_ON_FAILURE)

        WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/modal_SuccessAppointmentCancelled'), 0)

        WebUI.click(findTestObject('Patient/Appointments/Pending/button_Close'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        WebUI.click(findTestObject('Patient/Appointments/Tab/tab_Pending'), FailureHandling.STOP_ON_FAILURE)

        if (WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1'), FailureHandling.OPTIONAL)) {
            WebUI.comment('Cancel Appointment ')

            WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1'), FailureHandling.OPTIONAL)

            WebUI.click(findTestObject('Patient/Appointments/Pending/TBRecord1_MenuCancel'), FailureHandling.STOP_ON_FAILURE)

            WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1_Cancel'), 0)

            WebUI.click(findTestObject('Patient/Appointments/Pending/TBRecord1_Cancel'), FailureHandling.STOP_ON_FAILURE)

            WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/modal_CancelAppointment'), 0)

            WebUI.click(findTestObject('Patient/Appointments/Pending/button_CancelYes'), FailureHandling.STOP_ON_FAILURE)

            WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/modal_SuccessAppointmentCancelled'), 
                0)

            WebUI.click(findTestObject('Patient/Appointments/Pending/button_RequestNewAppointment'), FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(2)

            WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Common/text_Title'), 0)

            WebUI.verifyElementText(findTestObject('Patient/Appointments/Common/text_Title'), 'REQUEST APPOINTMENT')

            WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
        } else {
            WebUI.verifyElementNotPresent(findTestObject('Patient/Appointments/Pending/table_Record'), 0)
        }
    } else {
        WebUI.verifyElementNotPresent(findTestObject('Patient/Appointments/Pending/table_Record'), 0)
    }
} else {
    WebUI.verifyElementNotPresent(findTestObject('Patient/Appointments/Pending/table_Record'), 0)
}

WebUI.delay(3)

WebUI.closeBrowser()

if (true) {
}

