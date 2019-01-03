package com.example.android.quakereport;

public class Quake {

    String mMagnitude;
    String mPlace;
    String mDate;

    public Quake(String magnitude,String place,String date){
        mMagnitude=magnitude;
        mPlace = place;
        mDate = date;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public String getmDate(){
        return mDate;
    }
}