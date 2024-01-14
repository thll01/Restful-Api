package org.fmi.homework.DTO.request;

public class LocationRequest {

    private String location;

    public LocationRequest(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
