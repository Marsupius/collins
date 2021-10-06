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
    InitialPanel iPanel;
    InitialFrame iFrame;
    
    public View(){
        iFrame = new InitialFrame();
        iPanel = iFrame.getiPanel();
    }

    
    public InitialPanel getiPanel() {
        return iPanel;
    }

    public InitialFrame getiFrame() {
        return iFrame;
    }
    
}
