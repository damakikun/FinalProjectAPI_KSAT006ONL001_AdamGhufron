<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET - Resouce Lists</name>
   <tag></tag>
   <elementGuidId>948f1422-0d4b-4266-b1d0-90aaa464afc3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://reqres.in/api/unknown/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementPropertyValue(response, 'page', 1)
WS.verifyElementPropertyValue(response, 'per_page', 6)
WS.verifyElementPropertyValue(response, 'total', 12)
WS.verifyElementPropertyValue(response, 'total_pages', 2)
WS.verifyElementPropertyValue(response, 'data[0].id', 1)
WS.verifyElementPropertyValue(response, 'data[0].name', &quot;cerulean&quot;)
WS.verifyElementPropertyValue(response, 'data[0].year', 2000)
WS.verifyElementPropertyValue(response, 'data[0].color', &quot;#98B2D1&quot;)
WS.verifyElementPropertyValue(response, 'data[0].pantone_value', &quot;15-4020&quot;)
WS.verifyElementPropertyValue(response, 'data[1].id', 2)
WS.verifyElementPropertyValue(response, 'data[1].name', &quot;fuchsia rose&quot;)
WS.verifyElementPropertyValue(response, 'data[1].year', 2001)
WS.verifyElementPropertyValue(response, 'data[1].color', &quot;#C74375&quot;)
WS.verifyElementPropertyValue(response, 'data[1].pantone_value', &quot;17-2031&quot;)
WS.verifyElementPropertyValue(response, 'data[2].id', 3)
WS.verifyElementPropertyValue(response, 'data[2].name', &quot;true red&quot;)
WS.verifyElementPropertyValue(response, 'data[2].year', 2002)
WS.verifyElementPropertyValue(response, 'data[2].color', &quot;#BF1932&quot;)
WS.verifyElementPropertyValue(response, 'data[2].pantone_value', &quot;19-1664&quot;)
WS.verifyElementPropertyValue(response, 'data[3].id', 4)
WS.verifyElementPropertyValue(response, 'data[3].name', &quot;aqua sky&quot;)
WS.verifyElementPropertyValue(response, 'data[3].year', 2003)
WS.verifyElementPropertyValue(response, 'data[3].color', &quot;#7BC4C4&quot;)
WS.verifyElementPropertyValue(response, 'data[3].pantone_value', &quot;14-4811&quot;)
WS.verifyElementPropertyValue(response, 'data[4].id', 5)
WS.verifyElementPropertyValue(response, 'data[4].name', &quot;tigerlily&quot;)
WS.verifyElementPropertyValue(response, 'data[4].year', 2004)
WS.verifyElementPropertyValue(response, 'data[4].color', &quot;#E2583E&quot;)
WS.verifyElementPropertyValue(response, 'data[4].pantone_value', &quot;17-1456&quot;)
WS.verifyElementPropertyValue(response, 'data[5].id', 6)
WS.verifyElementPropertyValue(response, 'data[5].name', &quot;blue turquoise&quot;)
WS.verifyElementPropertyValue(response, 'data[5].year', 2005)
WS.verifyElementPropertyValue(response, 'data[5].color', &quot;#53B0AE&quot;)
WS.verifyElementPropertyValue(response, 'data[5].pantone_value', &quot;15-5217&quot;)
WS.verifyElementPropertyValue(response, 'support.url', &quot;https://reqres.in/#support-heading&quot;)
WS.verifyElementPropertyValue(response, 'support.text', &quot;To keep ReqRes free, contributions towards server costs are appreciated!&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
