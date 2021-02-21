package com.example.ooptraining;

public class Piano implements Instrument,HouseDecor {
    String brand;
    boolean digital;

    @Override
    public void bilgi() {
        System.out.println("override method");
    }
}
