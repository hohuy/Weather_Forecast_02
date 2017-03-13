package com.framgia.weatherforecast.data.model;
import com.google.gson.annotations.SerializedName;

import java.util.List;
/**
 * Created by hohuy on 12/03/2017.
 */
   public class DailyWeather {
        @SerializedName("summary")
        private String mSummary;
        @SerializedName("icon")
        private String mIcon;
        @SerializedName("data")
        private List<Weather> mData;
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
        public List<Weather> getData() {
            return mData;
        }
        public void setData(List<Weather> data) {
            this.mData = data;
        }
    }