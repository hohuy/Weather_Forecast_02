package com.framgia.weatherforecast.service;

/**
 * Created by hohuy on 15/03/2017.
 */
public class ApiConts {
    public class BaseURL {
        public static final String BASE_URL_FORECAST = "https://api.darksky.net/forecast/";
    }

    public class Param {
        public static final String PARAM_FORECAST = "location";
    }

    public class Path {
        public static final String PATH_WEATHER =
            BaseURL.BASE_URL_FORECAST + APIKey.API_KEY_FORECAST + "/{location}";
    }

    public class APIKey {
        public static final String API_KEY_FORECAST = "95e653cee837942eb2a44aa6439ed057";
    }
}
