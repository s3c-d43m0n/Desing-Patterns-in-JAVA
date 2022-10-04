package com.designpattern.behavioral.invoker.impl;

import com.designpattern.behavioral.command.Action;
import com.designpattern.behavioral.invoker.Controller;

public class GameController implements Controller {
    Action up, down, left, right;

    public GameController(Action up, Action down, Action left, Action right){
        this.up=up;
        this.down=down;
        this.left=left;
        this.right=right;
    }

    public void up(){
        up.doAction();
    }

    public void down(){
        down.doAction();
    }

    public void left(){
        left.doAction();
    }

    public void right(){
        right.doAction();
    }
}
