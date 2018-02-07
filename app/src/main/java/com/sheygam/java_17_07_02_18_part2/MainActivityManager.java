package com.sheygam.java_17_07_02_18_part2;

import android.util.Log;

/**
 * Created by gregorysheygam on 07/02/2018.
 */

public class MainActivityManager {
    private HttpProvider webProvider;
    private StoreProvider storeProvider;

    public MainActivityManager(HttpProvider webProvider, StoreProvider storeProvider) {
        this.webProvider = webProvider;
        this.storeProvider = storeProvider;
    }

    public void onLogin(){
        Log.d("MY_TAG", "onLogin: ");
        webProvider.login();
        storeProvider.saveToken();
    }
}
