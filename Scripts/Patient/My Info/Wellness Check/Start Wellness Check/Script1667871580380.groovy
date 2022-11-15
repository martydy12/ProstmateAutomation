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

WebUI.callTestCase(findTestCase('Login/Login_Patient'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Patient/Menu/menu_MyInfo'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/text_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/text_Title'), 'MY INFO')

WebUI.click(findTestObject('Patient/My_Info/Tab/tab_WellnessCheck'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Wellness Check/button_StartWellnessCheck'), 0)

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/button_StartWellnessCheck'))

WebUI.delay(2)

WebUI.comment('Question 1')

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question1/Q1_1_Poor'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question1/Q1_2_Under'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question1/Q1_3_Average'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question1/Q1_4_Over'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question1/Q1_5_Great'))

WebUI.comment('Question 2')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Wellness Check/Question1/Q1_1_Poor'), 0)

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question2/Q2_4_Over'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question2/Q2_2_Under'))

WebUI.comment('Question 3')

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question3/Q3_1_Poor'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question3/Q3_5_Great'))

WebUI.comment('Question 4')

WebUI.scrollToElement(findTestObject('Patient/My_Info/Wellness Check/Question3/Q3_1_Poor'), 0)

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question4/Q4_5_Great'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question4/Q4_1_Poor'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question4/Q4_4_Over'))

WebUI.comment('Question 5')

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question5/Q5_3_Average'))

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/Question5/Q5_2_Under'))

WebUI.comment('Save')

WebUI.click(findTestObject('Patient/My_Info/Wellness Check/button_Submit'))

WebUI.waitForElementVisible(findTestObject('Patient/My_Info/Common/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Patient/My_Info/Common/feedback_message'), 'Wellness check successfully saved.')

WebUI.delay(2)

WebUI.closeBrowser()

