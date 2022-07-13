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

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

response = WS.sendRequest(findTestObject('POST/POST - Create User', [('name') : name, ('job') : job]))

WS.verifyResponseStatusCode(response, 201)

// define new slurper object to parse response
def slurper = new JsonSlurper()
// parse response and store as a Map object
Map result = slurper.parseText(response.getResponseBodyContent())

// verify 'name' response with datafile request body
WS.verifyElementPropertyValue(response, 'name', name)

// verify 'job' response with datafile request body
WS.verifyElementPropertyValue(response, 'job', job)

// verify 'id' response with datafile request body
WS.verifyElementPropertyValue(response, 'id', result.id)
println(result.id)

// verify 'createdAt' response
WS.verifyElementPropertyValue(response, 'createdAt', result.createdAt)
println(result.createdAt)

