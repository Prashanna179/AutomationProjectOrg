Feature: Validating Place APIs

Scenario: Verify if Place is being successfully added using AddPlaceAPI

		Given Add Place Payload with "<name>" "<language>" "<address>"
		When user calls "addPlaceAPI" with "POST" http request
		Then the API call got success with status code 200
		And "status" in response body is "OK"
		And "scope" in response body is "APP"
		And verify "<name>" with placeID using "getPlaceAPI"

		Examples:
		|name     |language      |address            |
		|Sipcot   |Tamil         |Siruseri, Chennai  |
		|Elcot		|German				 |Sholling					 |