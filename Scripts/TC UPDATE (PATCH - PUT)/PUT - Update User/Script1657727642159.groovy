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

response = WS.sendRequest(findTestObject('PUT-PATCH/PUT - Update User', [('name') : name, ('job') : job, ('userId') : userId]))

// verify response code
WS.verifyResponseStatusCode(response, 200)

// define new slurper object to parse response
def slurper = new JsonSlurper()
// parse response and store as a Map object
Map result = slurper.parseText(response.getResponseBodyContent())

// verify 'name' response against 'name' from data file
WS.verifyElementPropertyValue(response, 'name', name)
println("name (expected): " + name)
println("name (actual): " + result.name)

// verify 'name' response against 'name' from data file
WS.verifyElementPropertyValue(response, 'job', job)
println("job (expected): " + job)
println("job (actual): " + result.job)

// verify 'updatedAt' response
WS.verifyElementPropertyValue(response, 'updatedAt', result.updatedAt)
println("updatedAt:"+ result.updatedAt)



