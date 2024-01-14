package org.fmi.homework.service;

import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationService locationService;
    private ReservationService reservationService;

    public LocationServiceImpl(LocationService locationService, ReservationService reservationService) {
        this.locationService = locationService;
        this.reservationService = reservationService;
    }

    @Override
    public Void addLocation() {
        return null;
    }

    @Override
    public Void updateLocation() {
        return null;
    }

    @Override
    public Void deleteLocation() {
        return null;
    }
}
