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

//def data = findTestData('Data Files/datalogin')
//
//def userName = data.getObjectValue('username', 2)
//def password = data.getObjectValue('password', 2)
//
//WebUI.comment(userName)
//WebUI.comment(password)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.applitools.com/')

WebUI.setText(findTestObject('Object Repository/Login/input_Username_username'), 'Synrieal')

WebUI.setText(findTestObject('Object Repository/Login/input_Password_password'), 'user_secret')

WebUI.click(findTestObject('Object Repository/Login/a_Sign in'))



WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/a_Add Account'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/a_Make Payment'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/h6_Financial Overview'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/h6_Recent Transactions'), 10, FailureHandling.STOP_ON_FAILURE)

