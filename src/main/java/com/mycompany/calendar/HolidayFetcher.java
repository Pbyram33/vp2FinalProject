/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calendar;

/**
 *
 * @author pbyra
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class HolidayFetcher {

    private static final String BASE_URL = "https://date.nager.at/api/v3/publicholidays/";

    public static List<PublicHoliday> getPublicHolidays(String year, String countryCode) throws IOException {
        String url = BASE_URL + year + "/" + countryCode;
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = httpClient.execute(httpGet);
        String jsonResponse = EntityUtils.toString(response.getEntity());

        ObjectMapper objectMapper = new ObjectMapper();
        PublicHoliday[] holidays = objectMapper.readValue(jsonResponse, PublicHoliday[].class);

        return Arrays.asList(holidays);
    }
}
