package org.kama.proxy;

import lombok.val;

public class App {

    public static void main(String[] args) {

        val towerProxy = TowerFactory.createBlackTower(2);

        //val tower =TowerFactory.createBlackTower(5);

        towerProxy.enter(new Wizard("Gifi"));
        towerProxy.enter(new Wizard("Gandalf"));
        towerProxy.enter(new Wizard("Harry Ollar"));
        towerProxy.enter(new Wizard("Un A"));
        towerProxy.enter(new Wizard("Omu Negru"));
        towerProxy.enter(new Wizard("Fara Frica"));
    }

}
