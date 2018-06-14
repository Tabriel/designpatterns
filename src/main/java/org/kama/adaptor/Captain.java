package org.kama.adaptor;


import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class Captain {

    @Setter
    private RowingBoat myBoat;

    public void sail() {
        myBoat.row();
    }
}
