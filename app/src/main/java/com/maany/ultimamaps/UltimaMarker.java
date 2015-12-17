package com.maany.ultimamaps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Mayank on 12/17/2015.
 */
public class UltimaMarker {
    private LatLng latLng;
    private String description;
    private String title;

    public UltimaMarker(LatLng latLng, String title, String description) {
        this.latLng = latLng;
        this.description = description;
        this.title = title;
    }
    public UltimaMarker(double latitude, double longitude, String title, String description) {
        latLng = new LatLng(latitude, longitude);
        this.description = description;
        this.title = title;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MarkerOptions getGoogleMapMarker() {
        return new MarkerOptions().position(latLng).title(title).snippet(description);
    }
}
