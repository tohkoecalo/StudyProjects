package com.coffee;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " and Soy";
    }

    @Override
    public double cost() {
        switch (beverage.size){
            case Large:     return beverage.cost() + 0.25;
            case Medium:    return beverage.cost() + 0.15;
            case Small:     return beverage.cost() + 0.05;
            default:        return beverage.cost();
        }
    }
}
