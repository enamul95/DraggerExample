package com.haqueit.mpos.draggerexample.model;

import android.util.Log;

import javax.inject.Inject;

public class Charger {
    @Inject
    public Charger() {
    }
    void setCharger(Mobile mobile){
        Log.e("Mymobile","Charging");
    }
}
