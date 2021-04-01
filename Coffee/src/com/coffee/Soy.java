package com.coffee;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + " and Soy";
    }

    @Override
    public double cost() {
        switch (beverage.size){
            case Large:     return beverage.cost() + 0.3;
            case Medium:    return beverage.cost() + 0.2;
            case Small:     return beverage.cost() + 0.1;
            default:        return beverage.cost();
        }
    }
}
