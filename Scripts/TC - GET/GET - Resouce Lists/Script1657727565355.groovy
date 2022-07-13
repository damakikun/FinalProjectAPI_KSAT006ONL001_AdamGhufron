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

response = WS.sendRequest(findTestObject('GET/GET - Resouce Lists'))

WS.getResponseStatusCode(response)

WS.verifyElementPropertyValue(response, 'page', 1)
WS.verifyElementPropertyValue(response, 'per_page', 6)
WS.verifyElementPropertyValue(response, 'total', 12)
WS.verifyElementPropertyValue(response, 'total_pages', 2)
WS.verifyElementPropertyValue(response, 'data[0].id', 1)
WS.verifyElementPropertyValue(response, 'data[0].name', "cerulean")
WS.verifyElementPropertyValue(response, 'data[0].year', 2000)
WS.verifyElementPropertyValue(response, 'data[0].color', "#98B2D1")
WS.verifyElementPropertyValue(response, 'data[0].pantone_value', "15-4020")
WS.verifyElementPropertyValue(response, 'data[1].id', 2)
WS.verifyElementPropertyValue(response, 'data[1].name', "fuchsia rose")
WS.verifyElementPropertyValue(response, 'data[1].year', 2001)
WS.verifyElementPropertyValue(response, 'data[1].color', "#C74375")
WS.verifyElementPropertyValue(response, 'data[1].pantone_value', "17-2031")
WS.verifyElementPropertyValue(response, 'data[2].id', 3)
WS.verifyElementPropertyValue(response, 'data[2].name', "true red")
WS.verifyElementPropertyValue(response, 'data[2].year', 2002)
WS.verifyElementPropertyValue(response, 'data[2].color', "#BF1932")
WS.verifyElementPropertyValue(response, 'data[2].pantone_value', "19-1664")
WS.verifyElementPropertyValue(response, 'data[3].id', 4)
WS.verifyElementPropertyValue(response, 'data[3].name', "aqua sky")
WS.verifyElementPropertyValue(response, 'data[3].year', 2003)
WS.verifyElementPropertyValue(response, 'data[3].color', "#7BC4C4")
WS.verifyElementPropertyValue(response, 'data[3].pantone_value', "14-4811")
WS.verifyElementPropertyValue(response, 'data[4].id', 5)
WS.verifyElementPropertyValue(response, 'data[4].name', "tigerlily")
WS.verifyElementPropertyValue(response, 'data[4].year', 2004)
WS.verifyElementPropertyValue(response, 'data[4].color', "#E2583E")
WS.verifyElementPropertyValue(response, 'data[4].pantone_value', "17-1456")
WS.verifyElementPropertyValue(response, 'data[5].id', 6)
WS.verifyElementPropertyValue(response, 'data[5].name', "blue turquoise")
WS.verifyElementPropertyValue(response, 'data[5].year', 2005)
WS.verifyElementPropertyValue(response, 'data[5].color', "#53B0AE")
WS.verifyElementPropertyValue(response, 'data[5].pantone_value', "15-5217")
WS.verifyElementPropertyValue(response, 'support.url', "https://reqres.in/#support-heading")
WS.verifyElementPropertyValue(response, 'support.text', "To keep ReqRes free, contributions towards server costs are appreciated!")

