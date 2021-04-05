# Test-Application
Test 1: JSON Parsing: Branch json_parsing
1.1 Write a jsonParser class to parse the data stored in jsonData into a City object. Not all data in jsonData is relevant
1.2 Execute this parser code from an appropriate place in MainActivity so that it parses the JSON data
1.3 Using log statements at this point, output data so that we can be sure that you have processed the data
1.4 Include some appropriate unit tests to validate that you can decode valid JSON objects, that you can deal with invalid objects, etc. As part of this you should create some appropriate test data

Test 2: User Input and Output: Branch user_input
2.1 Create a simple user interface that allows the user to enter the city name and rank.
2.2 Add a button so that this data is copied to a city object along with the device location read from the device
2.3 Create some user interface elements that display this information in a format that is easy for the user to interpret

Test 3: Rx Java & Retrofit: Branch api_call
This test uses the OpenWeather API to request weather for the city name collected in test 2.1
http://api.openweathermap.org/data/2.5/weather?q={city_name}&appid=bec2ea2f434c848c09196f2de96e3c4c
3.1 Using the OpenWeather API weather endpoint above, build a request using Retrofit to the above endpoint that gets weather data for the city added for test 2.1
3.2 Demonstrate your understanding of RxJava by observing the result of the request used for 3.1 and updating the user interface to show the current temperature in Celsius

ALL CODE MERGED IN MASTER BRANCH
