/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JPanel;
import java.awt.*;

/**
 *
 * @author joc6
 */
public class InitialPanel extends JPanel{
    // attributes
    NorthPanel nPanel;
    CenterPanel cPanel;

    public InitialPanel() {
        super();
        setLayout(new BorderLayout());
        cPanel = new CenterPanel();
        add(cPanel, "Center");
        nPanel = new NorthPanel();
        add(nPanel, "North");

    }

    public NorthPanel getnPanel() {
        return nPanel;
    }
    public CenterPanel getcPanel() {
        return cPanel;
    }

}

