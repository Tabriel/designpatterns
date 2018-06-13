package org.kama.lombok;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Wallet {

    private Integer amount;
    private String name;
}
