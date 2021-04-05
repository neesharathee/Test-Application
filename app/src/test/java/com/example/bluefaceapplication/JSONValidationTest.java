package com.example.bluefaceapplication;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class JSONValidationTest {

    @Test
    public void TestJSON(){
        String actual = "{\"city\": {\n" +
                "\"name\": \"Paris\",\n" +
                "\"rank\": 7,\n" +
                "\"location\": {\"lat\": 48.8588376, \"lon\": 2.2768491}\n" +
                "}\n" +
                "}";
        String failureMessage = "Only one field is expected: name";
        try {
            JSONAssert.assertEquals(failureMessage,
                    "{\"city\": {\n" +
                            "\"name\": \"Paris\"}", actual, JSONCompareMode.STRICT);
        } catch (AssertionError | JSONException ae) {
            assertThat(ae.getMessage());
        }

    }

    private Object assertThat(String message) {
        return message;
    }
}
