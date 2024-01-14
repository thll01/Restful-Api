package org.fmi.homework.DTO.response;

public class LocationResponse {

    private String location;

    public LocationResponse(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
