package com.company;

public class Stone extends Block implements IDestroyedToCobblestone{


    public Stone(String name, int durability, String sound) {
        super(name, durability, sound);
    }

    @Override
    public void blockSound() {
        System.out.println("Cobble sound...");
    }


    @Override
    public void destroy() {
        System.out.println("Now it's Cobblestone...");
    }
}
