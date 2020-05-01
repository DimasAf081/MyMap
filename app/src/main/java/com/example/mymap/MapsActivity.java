package com.example.mymap;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng kontrakan = new LatLng(-7.909468, 112.576110);
        mMap.addMarker(new MarkerOptions().position(kontrakan).title("Kontrakan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kontrakan));

        LatLng spbu = new LatLng(-7.905046, 112.572214);
        mMap.addMarker(new MarkerOptions().position(spbu).title("SPBU PERTAMINA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu));

        LatLng spbu1 = new LatLng(-7.909775, 112.578975);
        mMap.addMarker(new MarkerOptions().position(spbu1).title("Eni Lubricant"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu1));

        LatLng spbu2 = new LatLng(-7.911709, 112.578295);
        mMap.addMarker(new MarkerOptions().position(spbu2).title("Pertamini depan masjid al Falah"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu2));

        LatLng spbu3 = new LatLng(-7.914878, 112.577267);
        mMap.addMarker(new MarkerOptions().position(spbu3).title("Bu juwita toko bensin"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu3));

        LatLng spbu4 = new LatLng(-7.918495, 112.575610);
        mMap.addMarker(new MarkerOptions().position(kontrakan).title("Pom Mini DW"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kontrakan));

        LatLng spbu5 = new LatLng(-7.914936, 112.584155);
        mMap.addMarker(new MarkerOptions().position(spbu4).title("Bengkel Pom Mini "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu5));

        LatLng spbu6 = new LatLng(-7.916400, 112.583016);
        mMap.addMarker(new MarkerOptions().position(spbu6).title("Pom Mini GM 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu6));


    }
}
