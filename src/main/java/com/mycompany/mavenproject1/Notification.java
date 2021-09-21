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
public class Notification {

    private String message; //possibly change/combine with message text to make/send notifications in one

    public Notification(String actualMessage) {
        this.message = actualMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
