package com.designpattern.behavioral.command.impl;

import com.designpattern.behavioral.command.Action;
import com.designpattern.behavioral.receiver.Player;

public class ActionUp implements Action {
    Player player;

    public ActionUp(Player player){
        this.player=player;
    }

    @Override
    public void doAction() {
        player.moveUp();
    }
}
