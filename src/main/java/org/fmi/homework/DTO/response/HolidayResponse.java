package org.fmi.homework.DTO.response;

public class HolidayResponse {

    private String content;

    public HolidayResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
