/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.Color;

/**
 *
 * @author joc6
 */
public class Category extends Notification{

    private Color notificationColor;
    private int notificationIcon;

    public Category(Color currentSource, int currentLocation,  String message) {
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

}
