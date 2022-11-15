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

if (WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Tab/tab_Today'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Patient/Appointments/Tab/tab_Pending'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Patient/Appointments/Pending/table_Record'), 0)

    if (WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Pending/label_NoRecord'), FailureHandling.OPTIONAL)) {
        WebUI.verifyElementText(findTestObject('Patient/Appointments/Pending/label_NoRecord'), 'There’s no appointments to display...')
    } else {
        WebUI.verifyElementVisible(findTestObject('Patient/Appointments/Pending/TBRecord1'), FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Patient/Appointments/Pending/TBRecord1_Name'), FailureHandling.STOP_ON_FAILURE)
    }
} else {
    WebUI.verifyElementNotPresent(findTestObject('Patient/Appointments/Pending/table_Record'), 0)
}

WebUI.delay(3)

WebUI.closeBrowser()

