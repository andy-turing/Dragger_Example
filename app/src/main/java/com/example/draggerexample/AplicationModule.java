package com.example.draggerexample;

import dagger.Module;
import dagger.Provides;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

@Module
public class AplicationModule {
    private Application aplication;

    public AplicationModule(Application application){
        this.aplication = application;
    }

    @Provides
    @Singleton
    public Context providerContext(){
        return  aplication;
    }
}
