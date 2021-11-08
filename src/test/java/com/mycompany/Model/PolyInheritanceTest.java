package com.mycompany.Model;

import java.util.ArrayList;

public class PolyInheritanceTest {//NOT NECESSARY, DELETE LATER
    ArrayList<Car> carShop = new ArrayList<>();
    Ferrari ferrari = new Ferrari();
    Jeep jeep = new Jeep();

    //carShop.add(this.ferrari);
    //carShop.add(jeep);



    /*ArrayList<Colorable> paintShop = new ArrayList<>();
    Ferrari ferrari = new Ferrari();
    Jeep jeep = new Jeep();

    paintShop.add(ferrari);
    paintShop.add(jeep);

    for (int i = 0; i < paintShop.size(); i++){
        paintShop.get(i).color();
    }*/
}
