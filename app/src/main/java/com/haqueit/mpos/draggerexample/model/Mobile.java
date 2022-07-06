package com.haqueit.mpos.draggerexample.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    @Inject
     Battery battery;
     Proccessor proccessor;
    @Inject
    public Mobile( Proccessor proccessor) {
        this.battery = battery;
      //  this.proccessor = proccessor;
        Log.e("MyMobile", "Mobile: ");
    }

    public void run(){
        Log.e("MyMobile", "run: ");
    }
    @Inject
    public void connectCharger(Charger charger){
        charger.setCharger(this);
    }
}
