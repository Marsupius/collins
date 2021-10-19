/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.awt.Color;

/**
 *
 * @author joc6
 */
public class Category extends Notification {

    private Color notificationColor;
    private int notificationIcon;

    public Category(Color currentSource, int currentLocation, String message) {
        super(message); //added for superclass
        this.notificationColor = currentSource;
        this.notificationIcon = currentLocation;
    }

    public Color getNotificationColor() {
        return notificationColor;
    }

    public void setNotificationColor(Color notificationColor) {
        this.notificationColor = notificationColor;
    }

    public int getNotificationIcon() {
        return notificationIcon;
    }

    public void setNotificationIcon(int notificationIcon) {
        this.notificationIcon = notificationIcon;
    }

    @Override
    public String toString() {
        return "Current color: " + Integer.toString(notificationColor.getRGB())
                + ", Notification Icon: " + notificationIcon;
        //intended to use serializable data to read and print colors, not eactly sure how it works et but putting it here so you know what I was going for
        //From here: https://stackoverflow.com/questions/2394388/java-how-to-convert-a-color-tostring-into-a-color
    }

}
