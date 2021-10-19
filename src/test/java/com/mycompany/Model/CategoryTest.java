/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Model;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author joc6
 */
public class CategoryTest {
    
    public CategoryTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    
    //angry for some reason V
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }

    /**
     * Test of getNotificationColor method, of class Category.
     */
    @org.junit.jupiter.api.Test
    public void testGetNotificationColor() {
        System.out.println("getNotificationColor");
        Category instance = new Category(Color.GREEN, 1, "message");
        Color expResult = Color.GREEN;
        Color result = instance.getNotificationColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNotificationIcon method, of class Category.
     */
    @org.junit.jupiter.api.Test
    public void testGetNotificationIcon() {
        System.out.println("getNotificationIcon");
        Category instance = new Category(Color.GREEN, 1, "message");
        int expResult = 1;
        int result = instance.getNotificationIcon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setNotificationColor method, of class Category.
     */
    @org.junit.jupiter.api.Test
    public void testSetNotificationColor() {
        System.out.println("setNotificationColor");
        Color notificationColor = Color.GREEN;
        Category instance = new Category(Color.GREEN, 1, "message");
        instance.setNotificationColor(notificationColor);
        
        // now that you have set the notification color to GREEN,
        // you need to see test that assumption
        assertEquals(Color.GREEN, instance.getNotificationColor());
    }


    /**
     * Test of setNotificationIcon method, of class Category.
     */
    @org.junit.jupiter.api.Test
    public void testSetNotificationIcon() {
        System.out.println("setNotificationIcon");
        int notificationIcon = 1;
        Category instance = new Category(Color.GREEN, 1, "message");
        instance.setNotificationIcon(notificationIcon);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
