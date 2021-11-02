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
public class Notification {

    private String location;
    private String subject;
    private String timeLeft;

    public Notification(String location, String subject, String timeLeft) {
        this.location = location;
        this.subject = subject;
        this.timeLeft = timeLeft;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Notification{" + "location='" + location + '\'' + ", subject='" + subject + '\'' + ", timeLeft='" +
                timeLeft + '\'' + '}';
    }
}
