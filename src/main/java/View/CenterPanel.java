/*
 * Filename: CenterPanel.java
 * Short description: This program is used to create and handle the center panel
 * IST 242 Assignment: Group 1 Final Project
 * @author  Joseph Collins
 * @version 5/3/2021
 */

package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class CenterPanel extends JPanel {
    private JButton player1;
    private JButton player2;
    private JButton update;
    private JButton title;
    private JTextField player1Name;
    private JTextField player2Name;
    Border border = new LineBorder(Color.BLACK, 3);
    
    public CenterPanel()
    {
        super();
        setLayout(new GridLayout());
        title = new JButton("Plugin Main Panel");
        player1 = new JButton();
        player2 = new JButton();
        update = new JButton("Update");
        player1Name = new JTextField("Enter Player 1");
        player2Name = new JTextField("Enter Player 2");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        player1.setBorder(border);
        player2.setBorder(border);
        add(player1);
        add(player1Name);
        add(title);
        add(player2Name);
        add(player2);
        add(update);
        validate();
        repaint();
    }
    
    
    public JTextField getName1()
    {
        return player1Name;
    }
    
    public JTextField getName2()
    {
        return player2Name;
    }
    
    public JButton getUpdate()
    {
        return update;
    }
}
