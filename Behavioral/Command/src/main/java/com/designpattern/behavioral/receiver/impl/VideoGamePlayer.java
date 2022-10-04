package com.designpattern.behavioral.receiver.impl;

import com.designpattern.behavioral.receiver.Player;

public class VideoGamePlayer implements Player {

    public void moveUp(){
        System.out.println("Going Up");
    }

    public void moveDown(){
        System.out.println("Going Down");
    }

    public void moveLeft(){
        System.out.println("Going Left");
    }

    public void moveRight(){
        System.out.println("Going Right");
    }
}
