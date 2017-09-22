package com.coolweather.android.gson;

/**
 * Created by zhengwei on 2017/9/21.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
