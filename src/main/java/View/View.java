/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author joc6
 */
public class View {
    // GUI attributes
    InitialFrame iFrame;
    InitialPanel iPanel;
    NorthPanel cPanel;
    CenterPanel npanel;



    public View() {
        iFrame = new InitialFrame();
        iPanel = iFrame.getiPanel();
        cPanel = iFrame.getcPanel();
        npanel = iFrame.getnPanel();
    }


    /*public void CenterInitialSetup(int lines, int headers) {
        cPanel.setupCenterPanel(lines, headers);
    }

    public void CenterUpdate(ArrayList<ArrayList<String>> lines, ArrayList<String> headers) {
        cPanel.panelUpdate(lines, headers);
    }*/

    public InitialFrame getiFrame() {
        return iFrame;
    }

    public InitialPanel getiPanel() {
        return iPanel;
    }

    public NorthPanel getcPanel() {
        return cPanel;
    }
    
}
