package com.example.bluefaceapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.displayTV)
    TextView displayTV;
    @BindView(R.id.tempTV)
    TextView tempTV;
    @BindView(R.id.cityNameET)
    EditText cityNameET;
    @BindView(R.id.cityRankET)
    EditText cityRankET;
    @BindView(R.id.displayBTN)
    Button displayBTN;
    private City city;
    private double latitude, longitude;
    private static final int REQUEST_LOCATION = 2;


    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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

    private void getUserLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            // Check Permissions Now
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION);
        } else {
            // permission has been granted, continue as usual
            Task<Location> locationResult = LocationServices
                    .getFusedLocationProviderClient(this /** Context */)
                    .getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
                        @Override
                        public void onSuccess(Location location) {
                            // Got last known location. In some rare situations this can be null.
                            if (location != null) {
                                // Logic to handle location object
                                latitude = location.getLatitude();
                                longitude = location.getLongitude();
                                Log.d(TAG, String.valueOf(latitude) + longitude);
                            } else {
                                Log.d(TAG, "No location returned");
                            }
                        }
                    });
        }
    }

    @OnClick(R.id.displayBTN)
    public void displayCityDetailsInTV() {
        city = new City();
        city.setName(String.valueOf(cityNameET.getText()));
        city.setRank(Integer.parseInt(String.valueOf(cityRankET.getText())));
        displayTV.setText("City is: " + city.getName() + " Rank is: " + city.getRank());
        getUserLocation();

    }
}