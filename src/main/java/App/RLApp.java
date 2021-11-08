/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controller.Controller;
import View.View;
import com.mycompany.Model.Model;

/**
 *
 * @author joc6
 */
public class RLApp
{
    public static void main (String[] args){
        TestHarness testHarness = new TestHarness();
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);

        System.out.println("App Started");
        testClassHeirarchy();
    }
}
