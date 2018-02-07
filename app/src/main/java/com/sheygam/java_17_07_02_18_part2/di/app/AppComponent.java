package com.sheygam.java_17_07_02_18_part2.di.app;

import com.sheygam.java_17_07_02_18_part2.di.main.MainComponent;
import com.sheygam.java_17_07_02_18_part2.di.main.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by gregorysheygam on 07/02/2018.
 */
@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    MainComponent plus(MainModule mainModule);
}
