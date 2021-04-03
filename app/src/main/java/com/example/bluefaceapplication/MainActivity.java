package com.example.bluefaceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JsonData js = new JsonData();
        City city = new City();
        String str = js.getJsonString();
        try {
            JSONObject jObj = new JSONObject(str);
            JSONObject obj = jObj.getJSONObject("city");
            city.setName(obj.getString("name"));
            city.setRank(obj.getInt("rank"));
            Log.d(TAG, city.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}