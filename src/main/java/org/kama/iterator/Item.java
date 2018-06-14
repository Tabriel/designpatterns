package org.kama.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    private String name;
    private ItemType type;
}
