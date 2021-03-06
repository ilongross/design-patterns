package com.ilongross.patterns.home_works.lab3.home_work_lab3.products;

import com.ilongross.patterns.home_works.lab3.home_work_lab3.interfaces.Product;

public class Pastry implements Product {

    private int caloriesInBowl;

    public Pastry(int caloriesInBowl) {
        this.caloriesInBowl = caloriesInBowl;
    }

    @Override
    public int countCalories() {
        return caloriesInBowl;
    }
}
