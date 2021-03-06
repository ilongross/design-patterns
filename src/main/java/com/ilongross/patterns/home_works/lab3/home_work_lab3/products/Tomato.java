package com.ilongross.patterns.home_works.lab3.home_work_lab3.products;

import com.ilongross.patterns.home_works.lab3.home_work_lab3.interfaces.Product;

public class Tomato implements Product {

    private int calories;

    public Tomato(int calories) {
        this.calories = calories;
    }

    @Override
    public int countCalories() {
        return calories;
    }
}
