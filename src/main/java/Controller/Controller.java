package Controller;


import com.mycompany.Model.Model;
import com.mycompany.Model.Notification;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author joc6
 */
public class Controller {
    private Model model;



    public Controller(Model model) {
        this.model = model;
    }

    public ListModel<Notification> getModel(){
        return this.model;
    }

    public void addNotification(String location, String plot){
        boolean add = true;
        Notification s;
        for (int i = 0; i < this.model.getSize(); i++){
            s = this.model.getElementAt(i);
            if (s.getPlot().equals(plot)){
                add = false;
                break;
            }
        }
        if (add){
            this.model.addNotification(location, plot);
        }
        else{
            System.out.println("The Notification is identical to another previously entered student name. Please try again");
        }
    }
    //duplicate filtering didnt work, cant figure out why
    
    

    public void removeNotification(int[] notificationIndices){
        this.model.removeNotification(notificationIndices);
        System.out.println("Notification removed (from controller)");
    }
}

