package org.kama.iterator;

import lombok.val;

public class App {

    public static void main(String[] args) {

        val chest = new TreasureChest();
        ItemIterator weaponItems = chest.iterator(ItemType.POTION);

        while(weaponItems.hasNext()) {
            System.out.println(weaponItems.next());
        }
    }
}
