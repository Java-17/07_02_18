package com.sheygam.java_17_07_02_18_part2;

import android.app.Application;
import android.content.Context;

import com.sheygam.java_17_07_02_18_part2.di.app.AppComponent;
import com.sheygam.java_17_07_02_18_part2.di.app.AppModule;
import com.sheygam.java_17_07_02_18_part2.di.app.DaggerAppComponent;
import com.sheygam.java_17_07_02_18_part2.di.main.MainComponent;
import com.sheygam.java_17_07_02_18_part2.di.main.MainModule;

/**
 * Created by gregorysheygam on 07/02/2018.
 */

public class App extends Application {
    private AppComponent component;
    private MainComponent mainComponent;

    public static App get(Context context){
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = prepareComponent();
    }

    private AppComponent prepareComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public MainComponent plusMain(MainModule mainModule){
        if(mainComponent == null){
            mainComponent = component.plus(mainModule);
        }
        return mainComponent;
    }

    public void clearMain(){
        mainComponent = null;
    }
}
