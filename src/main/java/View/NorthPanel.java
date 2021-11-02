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

    private JButton title;
    private JButton player;
    private JTextField playerName;
    private JButton next;
    private JButton previous;
    private JButton add;
    private JButton edit;
    private JButton delete;
    Border border = new LineBorder(Color.BLACK, 3);

    public NorthPanel()
    {
        super();
        setLayout(new GridLayout());
        title = new JButton("Plugin Main Panel");
        player = new JButton();
        playerName = new JTextField("Enter RSIGN(RuneScape In-game name): ");
        next = new JButton("Next");
        previous = new JButton("Previous");
        add = new JButton("Add");
        edit = new JButton("Edit");
        delete = new JButton("Delete");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        player.setBorder(border);
        add(title);
        add(player);
        add(playerName);
        add(next);
        add(previous);
        add(add);
        add(edit);
        add(delete);
        validate();
        repaint();
    }


}
