package com.designpattern.behavioral.command.impl;

import com.designpattern.behavioral.command.Action;
import com.designpattern.behavioral.receiver.Player;

public class ActionDown implements Action {
    Player player;

    public ActionDown(Player player){
        this.player=player;
    }

    @Override
    public void doAction() {
        player.moveDown();
    }
}
