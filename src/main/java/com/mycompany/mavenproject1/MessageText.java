/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author joc6
 */
public class MessageText extends Notification{

    private String source;
    private String location;
    private int timeRemaining; //should get from timer

    public MessageText(String currentSource, String currentLocation, int currentTimeRemaining, String message) {
        super(message); //added for superclass
        this.source = currentSource;
        this.location = currentLocation;
        this.timeRemaining = currentTimeRemaining;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    @Override
    public String toString()
    {
        return "Source: " +source + "Location: " + location + "Time remaining: " + timeRemaining;
    }
}
