package com.coffee;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        switch (size){
            case Large:     return 1.29;
            case Medium:    return 0.99;
            case Small:     return 0.69;
            default:        return 0;
        }
    }
}
