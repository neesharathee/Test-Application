package com.example.bluefaceapplication.model;

import com.example.bluefaceapplication.model.Main;
import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("main")
    private Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
