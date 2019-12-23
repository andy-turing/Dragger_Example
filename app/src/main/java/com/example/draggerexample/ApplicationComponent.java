package com.example.draggerexample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity target);
}
