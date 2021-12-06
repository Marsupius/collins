/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.io.Serializable;

/**
 *
 * @author joc6
 */
public class Notification extends SuperList implements Printable, Serializable {

    private String location;
    private String plot;

    public Notification(String location, String plot) {
        this.location = location;
        this.plot = plot;
    }

    public String getPlot() {
        return this.plot;
    }

    @Override
    public String toString() {
        return "Location - " + location + ", Plot - " + plot;
    }

    @Override
    public void print() {
        System.out.println("Printing Notification");
    }
  
    
    
}
