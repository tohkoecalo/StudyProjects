package com.coffee;

public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        switch (size){
            case Large:     return 2.29;
            case Medium:    return 1.99;
            case Small:     return 1.69;
            default:        return 0;
        }
    }
}
