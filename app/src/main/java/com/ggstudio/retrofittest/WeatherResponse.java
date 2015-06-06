package com.ggstudio.retrofittest;

/**
 * Created by Andrey on 06.06.2015.
 */
public class WeatherResponse {

    String mCiteName;
    String mCityId;


    public String getCiteName() {
        return mCiteName;
    }

    public void setCiteName(String mCiteName) {
        this.mCiteName = mCiteName;
    }

    public String getCityId() {
        return mCityId;
    }

    public void setCityId(String mCityId) {
        this.mCityId = mCityId;
    }
}
