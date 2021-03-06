package com.ilongross.patterns.home_works.lab3.home_work_lab3.products;

import com.ilongross.patterns.home_works.lab3.home_work_lab3.interfaces.Product;

public class Milk implements Product {

    private int caloriesInCup;

    public Milk(int calories) {
        this.caloriesInCup = calories;
    }

    @Override
    public int countCalories() {
        return caloriesInCup;
    }
}
