package Controller;

import View.View;
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
    private View view;



    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    public ListModel<Notification> getToDOModel(){
        return this.model;
    }

    public void addStudent(String location, String subject, String timeLeft){
        boolean add = true;
        Notification n;
        for (int i = 0; i < this.model.getSize(); i++){
            n = this.model.getElementAt(i);
            if (n.getSubject().equals(subject)){
                add = false;
            }
        }
        if (add){
            this.model.addNotification(location, subject, timeLeft);
        }
        else{
            System.out.println("The Student's name is identical to another previously entered student name. Please try again");
        }
    }

    public void removeStudent(int[] studentIndices){
        this.model.removeNotification(studentIndices);
    }
}
