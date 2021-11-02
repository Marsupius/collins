package Controller;

import View.View;
import com.mycompany.Model.Model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import javax.swing.JButton;

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
        //view.CenterInitialSetup(model.getBoard().getRows(), model.getBoard().getColumns());
    }
}
