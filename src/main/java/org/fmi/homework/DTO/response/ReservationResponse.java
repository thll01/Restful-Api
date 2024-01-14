package org.fmi.homework.DTO.response;

public class ReservationResponse {

    private Long id;

    public ReservationResponse(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
