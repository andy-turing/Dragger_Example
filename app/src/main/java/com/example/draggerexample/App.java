package com.example.draggerexample;

import android.app.Application;

import dagger.android.DaggerApplication;

public class App extends Application {
    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder().aplicationModule
                (new AplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }

}
