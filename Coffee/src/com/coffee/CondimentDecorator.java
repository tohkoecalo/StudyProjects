package com.coffee;

public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;
    public abstract double cost();
}
