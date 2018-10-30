package com.mahendra;

public class Date {
    private int day=1, month=1, year=2018;

    public Date(int day, int month, int year){
        if(year >=2000 && year<=2018){
            this.year = year;
        }
        if(month>=1 && month<=12){
            this.month = month;
        }
        this.day = day;
    }

    public String toString(){
        return "Date: "+day+"/"+month+"/"+year;
    }

    public static void main(String[] args) {
        Date d = new Date(13,5,2010);
        System.out.println(d);
    }
}
