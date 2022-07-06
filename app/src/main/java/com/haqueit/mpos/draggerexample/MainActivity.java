package com.haqueit.mpos.draggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.haqueit.mpos.draggerexample.component.DaggerMobileComponent;
import com.haqueit.mpos.draggerexample.component.MobileComponent;
import com.haqueit.mpos.draggerexample.model.Battery;
import com.haqueit.mpos.draggerexample.model.Mobile;
import com.haqueit.mpos.draggerexample.model.Proccessor;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    //field injections
    @Inject
    Mobile mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Battery battery = new Battery();
      //  Proccessor proccessor = new Proccessor();
        //Mobile mobile = new Mobile(battery,proccessor);

        MobileComponent component = DaggerMobileComponent.create();
      // Mobile mobile = component.getMobile();

        component.inject(this);
       mobile.run();

    }
}