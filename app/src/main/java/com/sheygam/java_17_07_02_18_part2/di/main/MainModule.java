package com.sheygam.java_17_07_02_18_part2.di.main;

import android.content.Context;

import com.google.gson.Gson;
import com.sheygam.java_17_07_02_18_part2.HttpProvider;
import com.sheygam.java_17_07_02_18_part2.MainActivityManager;
import com.sheygam.java_17_07_02_18_part2.StoreProvider;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by gregorysheygam on 07/02/2018.
 */
@Module
public class MainModule {

    @Provides
    @MainScope
    HttpProvider provideHttpProvider(OkHttpClient client, Gson gson){
        return new HttpProvider(client, gson);
    }

    @Provides
    @MainScope
    StoreProvider provideStoreProvider(Context context){
        return new StoreProvider(context);
    }

    @Provides
    @MainScope
    MainActivityManager provideMainManager(HttpProvider httpProvider, StoreProvider storeProvider){
        return new MainActivityManager(httpProvider,storeProvider);
    }
}
