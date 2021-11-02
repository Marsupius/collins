package View;

        import com.mycompany.Model.Model;

        import javax.swing.*;
        import java.awt.*;

public class CenterPanel extends JPanel {

    CenterPanel cPanel;
    JList list = new javax.swing.JList<>();;

    public CenterPanel()
    {
        super();
        setLayout(new GridLayout());
        list.setModel();
        add(list);
        validate();
        repaint();
    }
}
