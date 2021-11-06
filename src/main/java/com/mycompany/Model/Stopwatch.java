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
public class Stopwatch implements Printable {

    private int timer;

    public Stopwatch(int runTimer) {
        this.timer = runTimer;

    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    @Override
    public void print() {
        System.out.println("Printing Stopwatch");
    }
    public void task(){
        System.out.println("Stopwatch Task");
    }
}
