package com.framgia.weatherforecast.data.model;
import com.google.gson.annotations.SerializedName;
/**
 * Created by hohuy on 12/03/2017.
 */
public class Weather {
    @SerializedName("time")
    private int mTime;
    @SerializedName("summary")
    private String mSummary;
    @SerializedName("icon")
    private String mIcon;
    @SerializedName("nearestStormDistance")
    private int mNearestStormDistance;
    @SerializedName("nearestStormBearing")
    private int mNearestStormBearing;
    @SerializedName("precipIntensity")
    private int mPrecipIntensity;
    @SerializedName("precipProbability")
    private int mPrecipProbability;
    @SerializedName("temperature")
    private double mTemperature;
    @SerializedName("apparentTemperature")
    private double mApparentTemperature;
    @SerializedName("dewPoint")
    private double mDewPoint;
    @SerializedName("humidity")
    private double mHumidity;
    @SerializedName("windSpeed")
    private double mWindSpeed;
    @SerializedName("windBearing")
    private int mWindBearing;
    @SerializedName("visibility")
    private double mVisibility;
    @SerializedName("cloudCover")
    private double mCloudCover;
    @SerializedName("pressure")
    private double mPressure;
    @SerializedName("ozone")
    private double mOzone;
    public int getTime() {
        return mTime;
    }
    public void setTime(int time) {
        this.mTime = time;
    }
    public String getSummary() {
        return mSummary;
    }
    public void setSummary(String summary) {
        this.mSummary = summary;
    }
    public String getIcon() {
        return mIcon;
    }
    public void setIcon(String icon) {
        this.mIcon = icon;
    }
    public int getNearestStormDistance() {
        return mNearestStormDistance;
    }
    public void setNearestStormDistance(int nearestStormDistance) {
        this.mNearestStormDistance = nearestStormDistance;
    }
    public int getNearestStormBearing() {
        return mNearestStormBearing;
    }
    public void setNearestStormBearing(int nearestStormBearing) {
        this.mNearestStormBearing = nearestStormBearing;
    }
    public int getPrecipIntensity() {
        return mPrecipIntensity;
    }
    public void setPrecipIntensity(int precipIntensity) {
        this.mPrecipIntensity = precipIntensity;
    }
    public int getPrecipProbability() {
        return mPrecipProbability;
    }
    public void setPrecipProbability(int precipProbability) {
        this.mPrecipProbability = precipProbability;
    }
    public double getTemperature() {
        return mTemperature;
    }
    public void setTemperature(double temperature) {
        this.mTemperature = temperature;
    }
    public double getApparentTemperature() {
        return mApparentTemperature;
    }
    public void setApparentTemperature(double apparentTemperature) {
        this.mApparentTemperature = apparentTemperature;
    }
    public double getDewPoint() {
        return mDewPoint;
    }
    public void setDewPoint(double dewPoint) {
        this.mDewPoint = dewPoint;
    }
    public double getHumidity() {
        return mHumidity;
    }
    public void setHumidity(double humidity) {
        this.mHumidity = humidity;
    }
    public double getWindSpeed() {
        return mWindSpeed;
    }
    public void setWindSpeed(double windSpeed) {
        this.mWindSpeed = windSpeed;
    }
    public int getWindBearing() {
        return mWindBearing;
    }
    public void setWindBearing(int windBearing) {
        this.mWindBearing = windBearing;
    }
    public double getVisibility() {
        return mVisibility;
    }
    public void setVisibility(double visibility) {
        this.mVisibility = visibility;
    }
    public double getCloudCover() {
        return mCloudCover;
    }
    public void setCloudCover(double cloudCover) {
        this.mCloudCover = cloudCover;
    }
    public double getPressure() {
        return mPressure;
    }
    public void setPressure(double pressure) {
        this.mPressure = pressure;
    }
    public double getOzone() {
        return mOzone;
    }
    public void setOzone(double ozone) {
        this.mOzone = ozone;
    }
}