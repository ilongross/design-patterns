package com.ilongross.patterns.gof.behavioral.template_method;

public abstract class Flag {

    public void drawFlagPole() {
        System.out.println("Draw flagpole");
    }

    public abstract void draw();

}
