package com.designpattern.behavioral;

import com.designpattern.behavioral.command.Action;
import com.designpattern.behavioral.command.impl.ActionDown;
import com.designpattern.behavioral.command.impl.ActionLeft;
import com.designpattern.behavioral.command.impl.ActionRight;
import com.designpattern.behavioral.command.impl.ActionUp;
import com.designpattern.behavioral.invoker.Controller;
import com.designpattern.behavioral.invoker.impl.JoyStickGameController;
import com.designpattern.behavioral.receiver.Player;
import com.designpattern.behavioral.receiver.impl.VideoGamePlayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        //Receiver Object
        Player player = new VideoGamePlayer();

        //Concrete Command
        Action up = new ActionUp(player);
        Action down = new ActionDown(player);
        Action left = new ActionLeft(player);
        Action right = new ActionRight(player);

        //Invoker
        Controller controller = new JoyStickGameController(up,down,left,right);

        //Client Action
        try(BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))){
            while (true){
                System.out.print("Enter Option [UP|DOWN|LEFT|RIGHT] : ");
                String option = inputReader.readLine().toUpperCase();
                if("UP".equals(option)){
                    controller.up();
                } else if("DOWN".equals(option)){
                    controller.down();
                } else if("LEFT".equals(option)){
                    controller.left();
                } else if("RIGHT".equals(option)){
                    controller.right();
                } else{
                    System.out.print("Unknown option entered. Exiting");
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
