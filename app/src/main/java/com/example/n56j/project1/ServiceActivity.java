package com.example.n56j.project1;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ServiceActivity extends FragmentActivity implements OnMapReadyCallback {


    private GoogleMap mMap;
    private double latPbruADouble = 13.071865;
    private double lngPbruADouble = 99.976742;
    private Button listViewButton, addMarkerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_service_layout);

        //bind
        listViewButton = (Button) findViewById(R.id.button16);
        addMarkerButton = (Button) findViewById(R.id.button15);

        //addMarker
        addMarkerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ServiceActivity.this, AddEditActivity.class);
                intent.putExtra("Status", true);
                startActivity(intent);
            }//onclick
        });



        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }//main metton



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng latLng = new LatLng(latPbruADouble, lngPbruADouble);
        // setup pbru center
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 16));
    }//second
}//main
