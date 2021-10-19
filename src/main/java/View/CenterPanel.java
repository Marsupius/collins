package View;

        import javax.swing.*;
        import java.awt.*;

public class CenterPanel extends JPanel {


    CenterPanel cPanel;


    public CenterPanel()
    {
        super();
        setLayout(new GridLayout());
        JLabel title = new JLabel("Connect Four");
        JButton player1 = new JButton("Player 1");
        JButton player2 = new JButton("Player 2");

        player1.setBackground(Color.RED);
        title.setHorizontalAlignment(JLabel.CENTER);
        player2.setBackground(Color.YELLOW);

        add(player1);
        add(title);
        add(player2);
        validate();
        repaint();
    }
}
