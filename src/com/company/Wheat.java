package com.company;

public class Wheat extends Block implements IGrow{


    public Wheat(String name, int durability, String sound) {
        super(name, durability, sound);
    }

    @Override
    public void blockSound() {
        System.out.println("Wheat sound...");
    }
    public void grow(){
        System.out.println("Growing...");
    }

}
