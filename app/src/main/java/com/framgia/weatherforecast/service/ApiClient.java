package com.framgia.weatherforecast.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hohuy on 12/03/2017.
 */
public class ApiClient {
    private static Retrofit retrofit;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                .baseUrl(ApiConts.BaseURL.BASE_URL_FORECAST+ApiConts.APIKey.API_KEY_FORECAST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        }
        return retrofit;
    }
}