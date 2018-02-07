package com.sheygam.java_17_07_02_18_part2.di.main;

import com.sheygam.java_17_07_02_18_part2.MainActivity;

import dagger.Subcomponent;

/**
 * Created by gregorysheygam on 07/02/2018.
 */
@Subcomponent(modules = {MainModule.class})
@MainScope
public interface MainComponent {
    void inject(MainActivity activity);
}
