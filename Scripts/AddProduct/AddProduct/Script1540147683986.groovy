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

WebUI.click(findTestObject('AddProduct/button_Add Product'))
///////////////////////////////////////////

WebUI.click(findTestObject('AddProduct/button_Product'))

WebUI.setText(findTestObject('AddProduct/input_Product Name_form-contro'), ProductName)

WebUI.setText(findTestObject('AddProduct/input__form-control'), ProductPrice)
WebUI.delay(5)
WebUI.click(findTestObject('AddProduct/Page_ReactJS Firebase/button_Create'))
