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

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_ChangePassword_2'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_ChangePassword_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Profile/Change Password/text_PageTitle'), 0)

WebUI.verifyElementText(findTestObject('Profile/Change Password/text_PageTitle'), 'CHANGE PASSWORD')

WebUI.comment('Empty Fields')

WebUI.scrollToElement(findTestObject('Profile/Change Password/input_ConfirmPassword'), 0)

WebUI.click(findTestObject('Profile/Change Password/button_Submit'))

WebUI.verifyElementAttributeValue(findTestObject('Profile/Change Password/input_CurrentPassword'), 'placeholder', 'This field can\'t be empty', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Change Password/input_NewPassword'), 'placeholder', 'This field can\'t be empty', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Profile/Change Password/input_ConfirmPassword'), 'placeholder', 'This field can\'t be empty', 
    0)

WebUI.delay(2)

WebUI.comment('Wrong current password')

WebUI.setText(findTestObject('Profile/Change Password/input_CurrentPassword'), 'WrongPassword')

WebUI.setText(findTestObject('Profile/Change Password/input_NewPassword'), 'NewPassword123!')

WebUI.setText(findTestObject('Profile/Change Password/input_ConfirmPassword'), 'NewPassword123!')

WebUI.scrollToElement(findTestObject('Profile/Change Password/input_ConfirmPassword'), 0)

WebUI.click(findTestObject('Profile/Change Password/button_Submit'))

WebUI.waitForElementVisible(findTestObject('Profile/Change Password/modal_validation_empty'), 0)

WebUI.verifyElementText(findTestObject('Profile/Change Password/modal_validation_empty'), (('Your current password is not correct.' + 
    '\n') + '\n') + ' Please try again')

WebUI.click(findTestObject('Profile/Change Password/button_Continue_empty'))

WebUI.comment('Does not meet requirements')

WebUI.setText(findTestObject('Profile/Change Password/input_CurrentPassword'), 'Password123!')

WebUI.setText(findTestObject('Profile/Change Password/input_NewPassword'), 'PASSWORD')

WebUI.setText(findTestObject('Profile/Change Password/input_ConfirmPassword'), 'PASSWORD')

WebUI.scrollToElement(findTestObject('Profile/Change Password/input_ConfirmPassword'), 0)

WebUI.click(findTestObject('Profile/Change Password/button_Submit'))

WebUI.waitForElementVisible(findTestObject('Profile/Change Password/modal_validation_invalid'), 0)

WebUI.verifyElementText(findTestObject('Profile/Change Password/modal_validation_invalid'), (((('Your new password does not meet' + 
    '\n') + 'our password requirements.') + '\n') + '\n') + ' Please enter a different password.')

WebUI.click(findTestObject('Profile/Change Password/button_Continue_invalid'))

WebUI.comment('Mismatch Password')

WebUI.setText(findTestObject('Profile/Change Password/input_CurrentPassword'), 'Password123!')

WebUI.setText(findTestObject('Profile/Change Password/input_NewPassword'), 'NewPass123!')

WebUI.setText(findTestObject('Profile/Change Password/input_ConfirmPassword'), 'NewPass')

WebUI.scrollToElement(findTestObject('Profile/Change Password/input_ConfirmPassword'), 0)

WebUI.click(findTestObject('Profile/Change Password/button_Submit'))

WebUI.waitForElementVisible(findTestObject('Profile/Change Password/modal_validation_mismatch'), 0)

WebUI.verifyElementText(findTestObject('Profile/Change Password/modal_validation_mismatch'), ((('Your new password and' + 
    '\n') + 'Confirm password do not match,') + '\n') + 'Please try again')

WebUI.click(findTestObject('Profile/Change Password/button_Continue_mismatch'))

WebUI.comment('Save New Password')

WebUI.setText(findTestObject('Profile/Change Password/input_CurrentPassword'), 'Password123!')

WebUI.setText(findTestObject('Profile/Change Password/input_NewPassword'), 'NewPass123!')

WebUI.setText(findTestObject('Profile/Change Password/input_ConfirmPassword'), 'NewPass123!')

WebUI.scrollToElement(findTestObject('Profile/Change Password/input_ConfirmPassword'), 0)

WebUI.click(findTestObject('Profile/Change Password/button_Submit'))

WebUI.waitForElementVisible(findTestObject('Profile/Change Password/modal_success_message'), 0)

WebUI.verifyElementText(findTestObject('Profile/Change Password/modal_success_message'), ('Your changes have been' + '\n') + 
    ' saved successfully.')

WebUI.click(findTestObject('Profile/Change Password/button_Continue_success'))

WebUI.delay(2)

WebUI.comment('Logout')

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_Logout_2'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_Logout_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Profile/Logout/modal_iframe'), 0)

WebUI.waitForElementVisible(findTestObject('Profile/Logout/modal_LogoutConfirmation'), 0)

WebUI.click(findTestObject('Profile/Logout/button_YesLogout'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Common Objects/text_Login'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/text_Login'), 'LOGIN')

WebUI.comment('Login Old Password')

WebUI.setText(findTestObject('Common Objects/input_email'), 'Testbookingmanager@email.com')

WebUI.setText(findTestObject('Common Objects/input_Password'), 'Password123!')

WebUI.click(findTestObject('Common Objects/button_Login'))

WebUI.waitForElementVisible(findTestObject('Common Objects/validation_Password'), 0)

WebUI.verifyElementText(findTestObject('Common Objects/validation_Password'), 'Password is incorrect. Please try again.')

WebUI.clearText(findTestObject('Common Objects/input_Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Login New Password')

WebUI.setText(findTestObject('Common Objects/input_Password'), 'NewPass123!')

WebUI.click(findTestObject('Common Objects/button_Login'))

WebUI.verifyElementPresent(findTestObject('Common Objects/img_UserIcon'), 0)

WebUI.click(findTestObject('Common Objects/img_UserIcon'))

WebUI.waitForElementVisible(findTestObject('Profile/Dropdown/select_ChangePassword_2'), 0)

WebUI.click(findTestObject('Profile/Dropdown/select_ChangePassword_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Profile/Change Password/text_PageTitle'), 0)

WebUI.verifyElementText(findTestObject('Profile/Change Password/text_PageTitle'), 'CHANGE PASSWORD')

WebUI.comment('Return Original Password')

WebUI.setText(findTestObject('Profile/Change Password/input_CurrentPassword'), 'NewPass123!')

WebUI.setText(findTestObject('Profile/Change Password/input_NewPassword'), 'Password123!')

WebUI.setText(findTestObject('Profile/Change Password/input_ConfirmPassword'), 'Password123!')

WebUI.scrollToElement(findTestObject('Profile/Change Password/input_ConfirmPassword'), 0)

WebUI.click(findTestObject('Profile/Change Password/button_Submit'))

WebUI.waitForElementVisible(findTestObject('Profile/Change Password/modal_success_message'), 0)

WebUI.verifyElementText(findTestObject('Profile/Change Password/modal_success_message'), ('Your changes have been' + '\n') + 
    ' saved successfully.')

WebUI.click(findTestObject('Profile/Change Password/button_Continue_success'))

WebUI.closeBrowser()

