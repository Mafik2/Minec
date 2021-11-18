package com.company;

public abstract class Block {
    protected String name;
    protected int durability;
    protected String sound;

    public Block(String name, int durability, String sound){
        this.name = name;
        this.durability = durability;
        this.sound = sound;

    }
    public abstract void blockSound();
}
