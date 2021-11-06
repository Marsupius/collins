package com.mycompany.Model;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package com.mycompany.Model;

import java.util.ArrayList;

*/

import com.mycompany.Model.MessageText;
import com.mycompany.Model.Notification;

import java.util.ArrayList;

/**
 *
 * @author joc6
 */

public class TestHarness {
    
    public TestHarness(){
    //Testing MessageText class OLD NEEDS UPDATES
    /*MessageText testText = new MessageText("Ardougne", "Herb", 4, "message");
    if (testText != null){
        System.out.println("Test Text created successfully!"); 
        System.out.println("Location: " + testText.getLocation() + ", Icon: " + 
                testText.getSource() + ", Time Remaining: " + testText.getTimeRemaining());
    }
    //Testing Notification class
    Notification testNotification = new Notification("Your ____ in ____ has ____ left.");
    if (testNotification != null){
        System.out.println("Test Notification created successfully!");
        System.out.println("Test Notification: " + testNotification.getMessage());
    }*/
        ArrayList<Colorable> paintShop = new ArrayList<>();
        ArrayList<Car> carShop = new ArrayList<>();
        for (int i = 0; i < carShop.size(); i++){
            carShop.get(i).honk();
        }
        for (int i = 0; i < paintShop.size(); i++){
            paintShop.get(i).color();
        }
}
    public void testClassHeirarchy(){
        ArrayList testCollection = new ArrayList();
        
    }
}
