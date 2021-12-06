package com.mycompany.Model;


import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;

import static javax.swing.event.ListDataEvent.INTERVAL_ADDED;
import static javax.swing.event.ListDataEvent.INTERVAL_REMOVED;


public class Model extends WindowAdapter implements ListModel<Notification> {
    ArrayList<Notification> notifications = null;
    ArrayList<ListDataListener> listeners = null;

    public Model(){
        this.notifications = new ArrayList<>();
        this.listeners = new ArrayList<>();
        this.notifications.add(new Notification("Ardougne", "Herb Allotment"));
        this.notifications.add(new Notification("Fossil Island", "Birdhouse Trap"));
        this.notifications.add(new Notification("Port Phasmatys", "Herb Allotment"));

        //persistant data
        FileInputStream fis;
        ObjectInputStream ois;

        try {
            fis = new FileInputStream("NotificationList");
            ois = new ObjectInputStream(fis);
            this.notifications = (ArrayList <Notification>) ois.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("File NotificationList does not exist");
        } catch (IOException e) {
            System.out.println("Cannot create object input stream");
        } catch (ClassNotFoundException e) {
            System.out.println("Something is wrong with the serialized file");
        }
    }
    public void addNotification(Notification notifications) {
        this.notifications.add(notifications);
    }

    public void addNotification(String location, String plot) {
        this.notifications.add(new Notification(location, plot));
        ListDataListener l;
        for (int i = 0; i < this.listeners.size(); i++) {
            l = this.listeners.get(i);
            l.intervalAdded(
                    new ListDataEvent(this, INTERVAL_ADDED, this.notifications.size() - 1, this.notifications.size() - 1)
            );
        }

        //uncomment for persistance

//        //adding persistant data to file
//        FileOutputStream fos;
//        ObjectOutputStream oos;
//
//        try {
//            fos = new FileOutputStream("NotificationList");
//            oos = new ObjectOutputStream(fos);
//            oos.writeObject(this.notifications);
//        } catch (IOException ex ){
//            System.out.println("Something went wrong");
//        }
    }

    public void removeNotification(int[] notificationIndices) {
        for (int i = 0; i <= notificationIndices.length; i++) {
            this.notifications.remove(notificationIndices[i]);
            ListDataListener l;
            for (int j = 0; j < this.listeners.size(); j++) {
                l = this.listeners.get(j);
                l.intervalRemoved(
                        new ListDataEvent(this, INTERVAL_REMOVED, notificationIndices[i], notificationIndices[i])
                );
                System.out.println("Notification removed (from model)");
            }
        }
    }


    @Override
    public int getSize() {
        return this.notifications.size();
    }

    @Override
    public Notification getElementAt(int index) {
        return this.notifications.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        this.listeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        this.listeners.remove(l);
    }

    public void windowClosing(WindowEvent e){
        //save all notifications
        //System.out.println("Window closing");
        //persistant data

    }

}
