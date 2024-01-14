package org.fmi.homework.service;

import org.fmi.homework.repository.HolidayRepository;
import org.springframework.stereotype.Service;

@Service
public class HolidayServiceImpl implements HolidayService {
private HolidayRepository holidayRepository;
private LocationService locationService;
private ReservationService reservationService;

public HolidayServiceImpl(HolidayRepository holidayRepository, LocationService locationService, ReservationService reservationService) {
    this.holidayRepository = holidayRepository;
    this.locationService = locationService;
    this.reservationService = reservationService;
}


    @Override
    public Void addHoliday() {
        return null;
    }

    @Override
    public Void updateHoliday() {
        return null;
    }

    @Override
    public Void deleteHoliday() {
        return null;
    }
}
