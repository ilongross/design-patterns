package com.ilongross.patterns.gof.behavioral.state.base;

public abstract class PlayerState {
    Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public abstract String onOff();
    public abstract String onPlay();
    public abstract String onPause();
    public abstract String onLock();


}
