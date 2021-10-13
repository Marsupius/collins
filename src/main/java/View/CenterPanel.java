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
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class CenterPanel extends JPanel {
    // attributes
    ArrayList<JButton> headers = new ArrayList<JButton>();
    ArrayList<JButton> rowData = new ArrayList<JButton>();
    Border border = new LineBorder(Color.BLUE, 9);

    public CenterPanel() {
        super();
    }
 
    public void setupCenterPanel(int rows, int cols) {
        setLayout(new GridLayout(rows + 1, cols)); //change according to difficulty setting
        // create header labels and add to panel
        for(int c = 0; c < cols; c++) {
            JButton label = new JButton("Drop");
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setBackground(Color.LIGHT_GRAY);
            label.setBorder(BorderFactory.createLineBorder(Color.black));
            headers.add(label);
            add(headers.get(c));
        }
        // create row data buttons and add to panel
        int r = 1;
        for(int i = 0; i < rows; i++) {
            for(int c = 0; c < cols; c++) {
                JButton btn = new JButton();
                btn.setBackground(Color.LIGHT_GRAY);
                rowData.add(btn);
                add(btn);
                btn.setBorder(border);
                r++;
            }
        }        
        validate();
        repaint();
    }
    
    public void panelUpdate(ArrayList<ArrayList<String>> lines, 
            ArrayList<String> heads) {
        for (int h = 0; h < heads.size(); h++) {
            headers.get(h).setText(heads.get(h));
        }
        int b = 0;
        for (int d = 0; d < lines.size() - 1; d++) {
            ArrayList<String> data = lines.get(d);
            for (int i = 0; i < data.size(); i++) {
                rowData.get(b).setText(data.get(i));
                b++;
            } 
        }
        validate();
        repaint();
    }    
    public ArrayList<JButton> getHeaders() {
        return headers;
    }

    public ArrayList<JButton> getRowData() {
        return rowData;
    }
    
}
