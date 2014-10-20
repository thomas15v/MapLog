package com.thomas15v.maplog.plugin.actions;

/**
 * Created by thomas on 18/10/14.
 */
public abstract class Action {

    private String player;

    public Action(String player){
        this.player = player;
    }

    public abstract void undo();

    public String getPlayer() {
        return player;
    }
}
