import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')

WebUI.navigateToUrl(SiteUrl)

WebUI.setText(findTestObject('Login/input_Login_exampleInputEmail1'), UserName)

WebUI.setText(findTestObject('Login/input_Login_exampleInputPasswo'), Password)

WebUI.click(findTestObject('Login/button_Login'))

WebUI.click(findTestObject('AddShop/ShopDetails'))

WebUI.click(findTestObject('AddShop/button_My Shop'))
WebUI.delay(5)
WebUI.click(findTestObject('AddShop/Category'))

WebUI.click(findTestObject('AddShop/a_Eateries'))

WebUI.setText(findTestObject('AddShop/input_Name_form-control'), ShopName)

WebUI.setText(findTestObject('AddShop/input_Address_form-control'), ShopAddress)
WebUI.delay(5)
WebUI.click(findTestObject('AddShop/input_Name_form-control'))
WebUI.setText(findTestObject('AddShop/input_Phone_form-control'), ShopPhone)
WebUI.click(findTestObject('AddShop/button_Create'))
WebUI.delay(7)
