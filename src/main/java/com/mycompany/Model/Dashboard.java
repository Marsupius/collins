/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.util.ArrayList;

/**
 *
 * @author joc6
 */
public class Dashboard implements Printable {

    private ArrayList<Integer> activeNotifications; //data-type to change
    private ArrayList<Integer> display;//data-type to change

    public Dashboard(ArrayList<Integer> dashActiveNotifications, ArrayList<Integer> dashDisplay) {
        this.activeNotifications = dashActiveNotifications;
        this.display = dashDisplay;
    }

    public ArrayList<Integer> getActiveNotifications() {
        return activeNotifications;
    }

    public void setActiveNotifications(ArrayList<Integer> activeNotifications) {
        this.activeNotifications = activeNotifications;
    }

    public ArrayList<Integer> getDisplay() {
        return display;
    }

    public void setDisplay(ArrayList<Integer> display) {
        this.display = display;
    }


    @Override
    public void print() {

    }
}
