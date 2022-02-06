package com.company;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setData(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String Print(){
        return day + "/" + month + "/" + year;
    }
}
