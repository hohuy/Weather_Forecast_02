package com.framgia.weatherforecast.service;

import com.framgia.weatherforecast.data.model.ResponseWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by hohuy on 12/03/2017.
 */
public interface ApiInterface {
    @GET(ApiConts.BaseURL.BASE_URL_FORECAST + ApiConts.Path.PATH_WEATHER)
    Call<ResponseWeather> getWeather(@Path(ApiConts.Param.PARAM_FORECAST) String location);
}
