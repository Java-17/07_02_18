package com.sheygam.java_17_07_02_18_part2;

import android.util.Log;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;

/**
 * Created by gregorysheygam on 07/02/2018.
 */

public class HttpProvider {
    private OkHttpClient client;
    private Gson gson;

    public HttpProvider(OkHttpClient client, Gson gson) {
        this.client = client;
        this.gson = gson;
    }

    public void login(){
        Log.d("MY_TAG", "login: ");
    }
}
