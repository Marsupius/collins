package View;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class NorthPanel extends JPanel {

    NorthPanel nPanel;

    private JButton nextButton;
    private JButton lastButton;
    private JButton addButton;
    private JButton deleteButton;

    public NorthPanel()
    {
        super();
        setLayout(new GridLayout());
        nextButton = new JButton("Next");
        lastButton = new JButton("Previous");
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        add(nextButton);
        add(lastButton);
        add(addButton);
        add(deleteButton);

        validate();
        repaint();
    }


}
