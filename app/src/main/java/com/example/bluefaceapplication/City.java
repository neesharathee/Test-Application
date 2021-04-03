package com.example.bluefaceapplication;

import android.location.Location;

public class City {
    public String name;
    public int rank;
    public float temperature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString(){
        return "City is: "+name+ " Rank is: " +rank;
    }
}
