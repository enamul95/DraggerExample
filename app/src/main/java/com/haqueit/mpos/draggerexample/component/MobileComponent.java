package com.haqueit.mpos.draggerexample.component;

import com.haqueit.mpos.draggerexample.MainActivity;
import com.haqueit.mpos.draggerexample.model.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {
    Mobile getMobile();
    void inject(MainActivity activity);
}
