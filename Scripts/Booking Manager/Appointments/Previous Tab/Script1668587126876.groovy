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

WebUI.callTestCase(findTestCase('Login/Login_BookingManager'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Booking Manager/Appointments/Common/page_Title'), 'APPOINTMENTS')

WebUI.click(findTestObject('Booking Manager/Appointments/Tab/tab_Previous'))

if (WebUI.verifyElementVisible(findTestObject('Booking Manager/Appointments/Previous/label_NoRecord'), FailureHandling.OPTIONAL)) {
    WebUI.verifyElementText(findTestObject('Booking Manager/Appointments/Previous/label_NoRecord'), 'It looks like you don\'t have any appointments...')
} else {
    WebUI.verifyElementVisible(findTestObject('Booking Manager/Appointments/Previous/TBRecord1'), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Booking Manager/Appointments/Previous/TBRecord1_Name'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Booking Manager/Appointments/Previous/label_status'), 0)

    WebUI.verifyElementText(findTestObject('Booking Manager/Appointments/Previous/label_status'), 'COMPLETED')
}

WebUI.delay(2)

WebUI.closeBrowser()

