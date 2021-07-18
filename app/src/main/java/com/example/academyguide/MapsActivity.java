package com.example.academyguide;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.academyguide.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Campus Positions
        LatLng headingtonCampus = new LatLng(51.75500081819575, -1.2241743397247018);
        LatLng harcourtCampus = new LatLng(51.740449420462056, -1.2918205792736384);
        LatLng wheatleyCampus = new LatLng(51.749293946182775, -1.1271403402225533);
        LatLng swindonCampus = new LatLng(51.56040700208553, -1.8172305124859913);
        LatLng marstonCampus = new LatLng(51.762032883566775, -1.2328155199681345);
        LatLng headhillCampus = new LatLng(51.754182202136676, -1.228725102591681);

        // Accommodation Positions
        LatLng crescentAccom = new LatLng(51.737256575302325, -1.2080877145378135);
        LatLng beechAccom = new LatLng(51.75802390436033, -1.2169465633581151);
        LatLng cheneyAccom = new LatLng(51.75336365686612, -1.2302377746553383);
        LatLng cliveAccom = new LatLng(51.757386901756135, -1.2311529786930548);
        LatLng dorsetAccom = new LatLng(51.758406443371406, -1.216170018083167);
        LatLng friarAccom = new LatLng(51.76648057510883, -1.2346541216304485);
        LatLng harcourtAccom = new LatLng(51.740634585035124, -1.2930541821866695);
        LatLng paradeAccom = new LatLng(51.7420727529903, -1.2029768185865375);
        LatLng sinnetAccom = new LatLng(51.746524100438236, -1.2272004823284175);
        LatLng warnefordAccom = new LatLng(51.75221382333157, -1.2201104177007245);
        LatLng westminsterAccom = new LatLng(51.740265071384414, -1.2946117008823386);
        LatLng paulAccom = new LatLng(51.7415201166216, -1.2031846605834298);
        LatLng sladeAccom = new LatLng(51.74377168540099, -1.2000524445617493);

        // Position Markers
        mMap.addMarker(new MarkerOptions().position(headingtonCampus).title("Headington Campus"));
        mMap.addMarker(new MarkerOptions().position(headhillCampus).title("Headington Hill Campus"));
        mMap.addMarker(new MarkerOptions().position(marstonCampus).title("Marston Campus"));
        mMap.addMarker(new MarkerOptions().position(harcourtCampus).title("Harcourt Hill Campus"));
        mMap.addMarker(new MarkerOptions().position(wheatleyCampus).title("Wheatley Campus"));
        mMap.addMarker(new MarkerOptions().position(swindonCampus).title("Swindon Campus"));

        mMap.addMarker(new MarkerOptions().position(crescentAccom).title("Crescent Hall"));
        mMap.addMarker(new MarkerOptions().position(beechAccom).title("Beech House"));
        mMap.addMarker(new MarkerOptions().position(cheneyAccom).title("Cheney Student Village"));
        mMap.addMarker(new MarkerOptions().position(cliveAccom).title("Clive Booth"));
        mMap.addMarker(new MarkerOptions().position(dorsetAccom).title("Dorset House"));
        mMap.addMarker(new MarkerOptions().position(friarAccom).title("Friar Court"));
        mMap.addMarker(new MarkerOptions().position(harcourtAccom).title("Harcourt Hall"));
        mMap.addMarker(new MarkerOptions().position(paradeAccom).title("Parade Green"));
        mMap.addMarker(new MarkerOptions().position(sinnetAccom).title("Sinnet Court"));
        mMap.addMarker(new MarkerOptions().position(warnefordAccom).title("Warneford Hall"));
        mMap.addMarker(new MarkerOptions().position(westminsterAccom).title("Westminster Hall"));
        mMap.addMarker(new MarkerOptions().position(paulAccom).title("Paul Kent Hall"));
        mMap.addMarker(new MarkerOptions().position(sladeAccom).title("Slade Park"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(headingtonCampus, 10f));

    }
}