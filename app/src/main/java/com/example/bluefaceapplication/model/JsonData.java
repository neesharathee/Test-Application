package com.example.bluefaceapplication.model;

public class JsonData {
    private String paris = "{\"city\": {\n" +
            "\"name\": \"Paris\",\n" +
            "\"rank\": 7,\n" +
            "\"location\": {\"lat\": 48.8588376, \"lon\": 2.2768491}\n" +
            "}\n" +
            "}";

    public String getJsonString() {
        return paris;
    }
}
