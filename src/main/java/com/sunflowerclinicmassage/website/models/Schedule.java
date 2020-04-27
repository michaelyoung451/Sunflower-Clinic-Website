package com.sunflowerclinicmassage.website.models;

public class Schedule {

    private Day day;
    private String hours;

    public Schedule(Day day, String hours) {
        this.day = day;
        this.hours = hours;
    }
}
