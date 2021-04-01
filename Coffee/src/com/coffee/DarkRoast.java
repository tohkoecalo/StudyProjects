package com.coffee;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        switch (size){
            case Large:     return 1.69;
            case Medium:    return 1.39;
            case Small:     return 1.19;
            default:        return 0;
        }
    }
}
