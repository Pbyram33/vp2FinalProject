/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calendar;

import java.time.LocalDateTime;

public class Event {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String title;
    private String description;

    public Event(String title, String description, LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.title = title;
        this.description = description;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
