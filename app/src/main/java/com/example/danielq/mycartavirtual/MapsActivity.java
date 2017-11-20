package com.example.danielq.mycartavirtual;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng upb = new LatLng(6.242348, -75.589601);
        LatLng restaur = new LatLng(6.243894, -75.596987);
        mMap.addMarker(new MarkerOptions().position(restaur).title("Restaurante"));
        mMap.addMarker(new MarkerOptions().position(upb).title("UPB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(upb));

        googleMap.addPolyline(new PolylineOptions().geodesic(true)
                .add(new LatLng(6.242348, -75.589601))
                .add(new LatLng(6.243894, -75.596987))
        );
    }
}