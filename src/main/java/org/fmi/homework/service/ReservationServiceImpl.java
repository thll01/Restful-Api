package org.fmi.homework.service;

import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

private ReservationService reservationService;
private LocationService locationService;

    public ReservationServiceImpl(ReservationService reservationService, LocationService locationService) {
        this.reservationService = reservationService;
        this.locationService = locationService;
    }

    @Override
    public void addReservation() {

    }

    @Override
    public void updateReservation() {

    }

    @Override
    public void deleteReservation() {

    }
}
