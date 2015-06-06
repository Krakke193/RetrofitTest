package com.ggstudio.retrofittest;



import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.client.Response;

/**
 * Created by Andrey on 06.06.2015.
 */
public interface OpenWeatherMapService {

    @GET("/data/2.5/weather")
    void getWeather(@Query("q") String cityName, Callback<Response> callback);
}
