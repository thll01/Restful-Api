package org.fmi.homework.controller;

import org.fmi.homework.service.ReservationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ReservationController {
private ReservationService reservationService;

public ReservationController(ReservationService reservationService) {
    this.reservationService = reservationService;
}

}
