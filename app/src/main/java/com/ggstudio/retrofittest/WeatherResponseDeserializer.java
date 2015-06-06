package com.ggstudio.retrofittest;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Andrey on 06.06.2015.
 */
public class WeatherResponseDeserializer implements JsonDeserializer<WeatherResponse> {

    @Override
    public WeatherResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {

        JsonObject jsonObject = json.getAsJsonObject();

        WeatherResponse weatherResponse = new WeatherResponse();

        weatherResponse.setCiteName(jsonObject.getAsJsonPrimitive("name").getAsString());
        weatherResponse.setCityId(jsonObject.getAsJsonPrimitive("id").getAsString());

        return weatherResponse;

    }
}
