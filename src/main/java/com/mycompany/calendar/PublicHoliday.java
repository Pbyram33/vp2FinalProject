/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calendar;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PublicHoliday {

    @JsonProperty("date")
    private String date;

    @JsonProperty("localName")
    private String localName;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("countryCode")
    private String countryCode;
    
    @JsonProperty("fixed")
    private String fixed;
    
    @JsonProperty("global")
    private String global;
    
    @JsonProperty("counties")
    private List<String> counties;
    
    @JsonProperty("launchYear")
    private String launchYear;
    
    @JsonProperty("types")
    private List<String> types;
    
    public PublicHoliday() {
    }
    
    public PublicHoliday(String date, String localName, String name, List<String> types, List<String> counties) {
        this.date = date;
        this.localName = localName;
        this.name = name;
        this.types = types;
        this.counties = counties;
    }

    public String getDate() {
        return date;
    }
    
    public String getLocalName() {
        return localName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setLocalName(String localName) {
        this.localName = localName;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}