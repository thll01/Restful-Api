package org.fmi.homework.DTO.request;

public class UpdataHoliday {

    private Long id;
    private String location;
    private String title;
    private String date;
    private int duration;
    private double price;
    private int freeSlots;

    public UpdataHoliday(Long id, String location, String title, String date, int duration, double price, int freeSlots) {
        this.id = id;
        this.location = location;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.price = price;
        this.freeSlots = freeSlots;
    }

    public UpdataHoliday() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFreeSlots() {
        return freeSlots;
    }

    public void setFreeSlots(int freeSlots) {
        this.freeSlots = freeSlots;
    }




}
