package org.kama.iterator;

import lombok.RequiredArgsConstructor;
import lombok.val;

@RequiredArgsConstructor
public class TreasureChestIterator implements ItemIterator {

    private final TreasureChest chest;
    private final ItemType itemType;
    private Integer lastId = -1;

    @Override
    public boolean hasNext() {
        return findNextId() != -1;
    }

    @Override
    public Item next() {
        lastId = findNextId();
        if (lastId != -1) {
            return chest.getItems().get(lastId);
        }
        return null;
    }

    private Integer findNextId() {
        val items = chest.getItems();
        Boolean found = false;
        Integer startId = lastId;
        while(!found) {
            startId += 1;

            if (startId >= items.size()) {
               startId = -1;
               break;
            }

            if (itemType.equals(ItemType.ANY) || items.get(startId).getType().equals(itemType)) {
                break;
            }
        }

        return startId;
    }
}
