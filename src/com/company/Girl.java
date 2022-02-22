package com.company;

public class Girl {
    private Flower flower;
    private short age;

    public Girl (Flower flower, short age) {
        this.flower = flower;
        this.age = age;
    }

    public Flower flower() {
        return flower;
    }

    public void receiveFlower(Flower flower) {
        this.flower = flower;
    }

    public short age() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
