package com.framgia.weatherforecast.data.model;
import com.google.gson.annotations.SerializedName;
import static android.R.attr.offset;
/**
 * Created by hohuy on 12/03/2017.
 */
public class ResponseWeather {
    @SerializedName("latitude")
    private double mLatitude;
    @SerializedName("longitude")
    private double mLongitude;
    @SerializedName("timezone")
    private String mTimezone;
    @SerializedName("offset")
    private int mOffset;
    @SerializedName("currently")
    private Weather mWeather;
    @SerializedName("daily")
    private DailyWeather mDailyWeather;
    public double getLatitude() {
        return mLatitude;
    }
    public void setLatitude(double latitude) {
        this.mLatitude = latitude;
    }
    public double getLongitude() {
        return mLongitude;
    }
    public void setLongitude(double longitude) {
        this.mLongitude = longitude;
    }
    public String getTimezone() {
        return mTimezone;
    }
    public void setTimezone(String timezone) {
        this.mTimezone = timezone;
    }
    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.mOffset = offset;
    }
    public Weather getCurrently() {
        return mWeather;
    }
    public void setCurrently(Weather weather) {
        this.mWeather = weather;
    }
    public DailyWeather getDaily() {
        return mDailyWeather;
    }
    public void setDaily(DailyWeather dailyWeather) {
        this.mDailyWeather = dailyWeather;
    }
}