package com.example.ooptraining;

public class Musician {
    private String name;
    private String instrument;
    private int age;

    public Musician(String name, String instrument, int age){
        this.age=age;
        this.instrument=instrument;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstrument(String instrument,String password) {
        if (password.matches("22415")){
        this.instrument = instrument;
    }
    }

    public void setAge(int age) {
        this.age = age;
    }
}
