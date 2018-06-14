package org.kama.facade.mine;

import lombok.val;

public class App {

    public static void main(String[] args) {

        val mine = new MineFacade();
        mine.startNewDay();
        mine.digOutGold();
        mine.endDay();

    }
}
