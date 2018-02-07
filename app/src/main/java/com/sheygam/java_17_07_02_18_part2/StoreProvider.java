package com.sheygam.java_17_07_02_18_part2;

import android.content.Context;
import android.util.Log;

/**
 * Created by gregorysheygam on 07/02/2018.
 */

public class StoreProvider {
    private Context context;

    public StoreProvider(Context context) {
        this.context = context;
    }

    public void saveToken(){
        Log.d("MY_TAG", "saveToken: ");
    }
}
