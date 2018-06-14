package org.kama.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreasureChest {

    private final List<Item> items;

    public TreasureChest() {

        this.items = new ArrayList<>();
        items.add(new Item("Potion of life.", ItemType.POTION));
        items.add(new Item("Potion of death.", ItemType.POTION));
        items.add(new Item("Potion of youth.", ItemType.POTION));

        items.add(new Item("Ring of death.", ItemType.WEAPON));
        items.add(new Item("Dust of void.", ItemType.WEAPON));
        items.add(new Item("Bad water.", ItemType.WEAPON));

    }

    public ItemIterator iterator(ItemType itemType) {

        return new TreasureChestIterator(this, itemType);
    }

    public List<Item> getItems() {
        return items;
    }

//Using java style iterator
//    Iterator iterator(ItemType itemType) {
//        return getItems()
//                .stream()
//                .filter(item -> itemType.equals(item.getType()))
//                .iterator();
//    }
}
