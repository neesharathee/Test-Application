package com.example.bluefaceapplication.retrofit;

import com.example.bluefaceapplication.model.Weather;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    //For temperature in Celsius using units=metric
    @GET("weather?APPID=bec2ea2f434c848c09196f2de96e3c4c&units=metric")
    Single<Weather> getWeatherData(@Query("q") String name);


}
