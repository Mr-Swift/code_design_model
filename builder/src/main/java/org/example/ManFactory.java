package org.example;

import org.example.entity.Man;

public class ManFactory {
    //简单工厂

    public static Man create(){
        Man man = Man.builder()
                .id("1")
                .age("10")
                .motherName("外婆")
                .build();

        return man;
    }

}
