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

WebUI.click(findTestObject('Patient/Menu/menu_Assessments'))

WebUI.waitForElementVisible(findTestObject('Patient/Assessments/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Assessments/Common/page_Title'), 'QUESTIONNAIRE')

WebUI.click(findTestObject('Patient/Assessments/Common/button_BeginHealthQuestion'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Assessments/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Assessments/Common/page_Title'), 'NEEDS')

WebUI.click(findTestObject('Patient/Assessments/Needs/range6_distress'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Needs/range6_distress'), 0)

WebUI.check(findTestObject('Patient/Assessments/Needs/checkbox_Work'))

WebUI.check(findTestObject('Patient/Assessments/Needs/checkbox_Partner'))

WebUI.check(findTestObject('Patient/Assessments/Needs/checkbox_Urinary'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Needs/checkbox_Work'), 0)

WebUI.check(findTestObject('Patient/Assessments/Needs/checkbox_Sadness'))

WebUI.setText(findTestObject('Patient/Assessments/Needs/textarea_Others'), 'Remembering past')

WebUI.scrollToElement(findTestObject('Patient/Assessments/Needs/textarea_Others'), 0)

WebUI.click(findTestObject('Patient/Assessments/Common/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Assessments/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Assessments/Common/page_Title'), 'DEPRESSION')

WebUI.scrollToElement(findTestObject('Patient/Assessments/Common/page_Title'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_Interest_NotAtAll'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_Interest_NotAtAll'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_FeelingDown_Several'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_FeelingDown_Several'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_TroubleFallingSeveral'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_TroubleFallingSeveral'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_FeelingTiredSeveral'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_FeelingTiredSeveral'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_PoorAppetiteMorethan'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_PoorAppetiteMorethan'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_FeelingBadSeveral'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_FeelingBadSeveral'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_ConcentrateNotAtAll'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_ConcentrateNotAtAll'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_MovingNotAtAll'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_MovingNotAtAll'), 0)

WebUI.click(findTestObject('Patient/Assessments/Depression/range_ThoughtsNearly'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Depression/range_ThoughtsNearly'), 0)

WebUI.click(findTestObject('Patient/Assessments/Common/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Assessments/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Assessments/Common/page_Title'), 'ANXIETY')

WebUI.scrollToElement(findTestObject('Patient/Assessments/Common/page_Title'), 0)

WebUI.click(findTestObject('Patient/Assessments/Anxiety/range_FeelingNervousNotAtAll'))

WebUI.scrollToElement(findTestObject('Patient/Assessments/Anxiety/range_FeelingNervousNotAtAll'), 0)

WebUI.click(findTestObject('Patient/Assessments/Anxiety/range_AbletoStopSeveral'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Patient/Assessments/Anxiety/range_AbletoStopSeveral'), 0)

WebUI.click(findTestObject('Patient/Assessments/Anxiety/range_WorryingSeveral'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Patient/Assessments/Anxiety/range_WorryingSeveral'), 0)

WebUI.click(findTestObject('Patient/Assessments/Anxiety/range_TroubleRelaxNearly'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Patient/Assessments/Anxiety/range_TroubleRelaxNearly'), 0)

WebUI.click(findTestObject('Patient/Assessments/Anxiety/range_RestlessMorethan'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Patient/Assessments/Anxiety/range_RestlessMorethan'), 0)

WebUI.click(findTestObject('Patient/Assessments/Anxiety/range_AnnoyedSeveral'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Patient/Assessments/Anxiety/range_AnnoyedSeveral'), 0)

WebUI.click(findTestObject('Patient/Assessments/Anxiety/range_AfraidSeveral'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Patient/Assessments/Anxiety/range_AfraidSeveral'), 0)

WebUI.click(findTestObject('Patient/Assessments/Common/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Patient/Assessments/Common/page_Title'), 0)

WebUI.verifyElementText(findTestObject('Patient/Assessments/Common/page_Title'), 'PHYSICAL ACTIVITY')

WebUI.setText(findTestObject('Patient/Assessments/Physical Activity/input_StrenuousFrequency'), '3')

WebUI.setText(findTestObject('Patient/Assessments/Physical Activity/input_StrenuousDuration'), '30')

WebUI.setText(findTestObject('Patient/Assessments/Physical Activity/input_ModerateFrequency'), '2')

WebUI.setText(findTestObject('Patient/Assessments/Physical Activity/input_ModerateDuration'), '60')

WebUI.setText(findTestObject('Patient/Assessments/Physical Activity/input_MildFrequency'), '2')

WebUI.setText(findTestObject('Patient/Assessments/Physical Activity/input_MildDuration'), '60')

WebUI.setText(findTestObject('Patient/Assessments/Physical Activity/input_ResistanceFrequency'), '4')

WebUI.setText(findTestObject('Patient/Assessments/Physical Activity/input_ResistanceDuration'), '60')

WebUI.click(findTestObject('Patient/Assessments/Physical Activity/radio_Sometimes'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Patient/Assessments/Physical Activity/radio_Sometimes'), 0)

WebUI.click(findTestObject('Patient/Assessments/Common/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Common Objects/feedback_message'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/feedback_message'), 'Health Questionnaire successfully saved.')

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

