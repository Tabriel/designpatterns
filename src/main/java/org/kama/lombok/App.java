package org.kama.lombok;

import lombok.val;

public class App {

    public static void main(String... args) {

        val topNotch = User.builder()
                .firstName("Gigi")
                .lastName("Becali")
                .email("jiji@fcsb.ro")
                .build();

        topNotch.setEmail("domnu.gigi@fcsb.ro");
        //topNotch.setWallet(new Wallet(300, "Maruntis"));

        System.out.println(topNotch.getFullName());
        System.out.println(topNotch.getEmail());
    }
}
