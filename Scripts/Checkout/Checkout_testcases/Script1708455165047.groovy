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

WebUI.openBrowser(GlobalVariable.base_url)

WebUI.setText(findTestObject('Login_pageObject/field_username'), GlobalVariable.username_standarduser)

WebUI.setText(findTestObject('Login_pageObject/field_password'), GlobalVariable.password)

WebUI.click(findTestObject('Login_pageObject/button_login'))

WebUI.verifyElementVisible(findTestObject('Login_pageObject/homepage'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Checkout_pageObject/button_AddToCart'))

WebUI.click(findTestObject('Object Repository/Checkout_pageObject/icon_cart'))

WebUI.click(findTestObject('Object Repository/Checkout_pageObject/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Checkout_pageObject/field_firstName'), 
    'meida')

WebUI.setText(findTestObject('Object Repository/Checkout_pageObject/field_lastName'), 
    'safira')

WebUI.setText(findTestObject('Object Repository/Checkout_pageObject/field_postalCode'), 
    '123')

WebUI.click(findTestObject('Object Repository/Checkout_pageObject/Button_continue'))

WebUI.click(findTestObject('Object Repository/Checkout_pageObject/button_Finish'))

WebUI.click(findTestObject('Object Repository/Checkout_pageObject/button_Back_Home'))

WebUI.closeBrowser()

