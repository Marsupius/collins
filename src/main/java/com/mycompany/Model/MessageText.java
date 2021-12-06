/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

/**
 *
 * @author joc6
 */
public class MessageText extends Notification{

    private String source;
    private String plot;

    public MessageText(String currentSource, String currentLocation, int currentTimeRemaining, String location, String plot, String timeLeft) {
        super(location, plot); //added for superclass
        this.source = currentSource;
        this.plot = currentLocation;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPlot() {
        return plot;
    }

    public void setLocation(String location) {
        this.plot = location;
    }

    @Override
    public String toString()
    {
        return "Source: " +source + "Location: " + plot ;
    }
}
