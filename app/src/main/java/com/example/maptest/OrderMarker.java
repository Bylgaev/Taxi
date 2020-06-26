package com.example.maptest;

import com.google.android.gms.maps.model.LatLng;

public class OrderMarker {
    private String currentAddress;
    private String destination;
    private String latitude;
    private String longitude;
    private String time;

    public OrderMarker(){

    }

    public OrderMarker(String currentAddress, String destination, LatLng latLng, String time){
        this.currentAddress = currentAddress;
        this.destination = destination;
        this.latitude = String.valueOf(latLng.latitude);
        this.longitude = String.valueOf(latLng.longitude);
        this.time = time;


    }

    public LatLng getLatLng(){
        return new LatLng(Double.valueOf(latitude), Double.valueOf(longitude));
    }


    public String getCurrentAddress() {
        return currentAddress;
    }
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }



}

