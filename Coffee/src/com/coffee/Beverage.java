package com.coffee;

enum Sizes {
    Small, Medium, Large;
}

public abstract class Beverage {
    protected String description;
    protected Sizes size;
    protected double cost;

    public String getDescription(){
        return description;
    }

    public void setSize(Sizes size){
        this.size = size;
    }
    public Sizes getSize(){
        return size;
    }

    public abstract double cost();
}
