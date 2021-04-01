package com.coffee;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Sizes.Large);
        System.out.println(beverage.getDescription() + " cost is "+ beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Sizes.Large);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " cost is "+ beverage2.cost());
    }
}
