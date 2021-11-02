/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author joc6
 */
public class InitialFrame extends JFrame {
    InitialPanel iPanel;
    NorthPanel cPanel;
    CenterPanel nPanel;
    
    public InitialFrame(){
        super("IST 440W Semester Project");
        //setupLayoutForMacs(); ** if needed **
        iPanel = new InitialPanel();
        cPanel = iPanel.getnPanel();
        nPanel = iPanel.getcPanel();
        add(iPanel, "Center");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setVisible(true);
    }

    public InitialPanel getiPanel() {
        return iPanel;
    }

    public NorthPanel getcPanel() {
        return cPanel;
    }

    public CenterPanel getnPanel() {
        return nPanel;
    }
    
}
