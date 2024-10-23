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

WebUI.callTestCase(findTestCase('Navigation/Navigate to radarbox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_AirNav RadarBox - Global Flight Tracking Intelligence  Live Flight Tracker and Airport Status/button_Contact Us_sc-bTfYlY lnWyFR'))

WebUI.click(findTestObject('Search/label_More Search Options'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Search/input_text_source'), GlobalVariable.Source)

WebUI.click(findTestObject('Search/div_Pune (PNQVAPO)Pune Airport'))

WebUI.sendKeys(findTestObject('Search/input_text_destination'), GlobalVariable.Destination)

WebUI.click(findTestObject('Search/div_Mumbai (BOMVABB)Chhatrapati Shivaji International Airport'))

WebUI.click(findTestObject('Search/button_Search'))

WebUI.waitForElementPresent(findTestObject('Search/div_Searched_flights_list'), 0)

WebUI.verifyElementPresent(findTestObject('Search/div_Searched_flights_list'), 0)

WebUI.takeFullPageScreenshot()

