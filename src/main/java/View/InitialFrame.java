/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import static javax.swing.JFrame.EXIT_ON_CLOSE; //exit program when 'x' is clicked

/**
 *
 * @author joc6
 */
public class InitialFrame extends JFrame {
    InitialPanel iPanel;
    Border border = new LineBorder(Color.BLACK, 8);
    
    public InitialFrame(){
        super("IST 440W Semester Project");
        iPanel = new InitialPanel();
        add(iPanel, "Center");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
    }

    public InitialPanel getiPanel() {
        return iPanel;
    }
    
}
