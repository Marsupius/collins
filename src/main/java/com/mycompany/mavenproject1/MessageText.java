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
public class MessageText {

    private String source;
    private String location;
    private int timeRemaining; //should get from timer

    public MessageText(String currentSource, String currentLocation, int currentTimeRemaining) {
        this.source = currentSource;
        this.location = currentLocation;
        this.timeRemaining = currentTimeRemaining;
    }

//public MessageText(){
//
//    String source = "";
//    String location = "";
//    int timeRemaining = 0;
//}
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

}
