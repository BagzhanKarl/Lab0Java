package com.company;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour,int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public boolean nextSeconds(){
        second += 1;
        return false;
    }

    public boolean previousSeconds(){
        second -= 1;
        return false;
    }

    public String toString(){
        return hour + "/" + minute + "/" + second;
    }

}
