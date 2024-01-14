package org.fmi.homework.DTO.request;

public class ReservationRequest {
    private Long id;

    public ReservationRequest(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
