package com.designpattern.integration.utility;

import com.designpattern.integration.model.Message;

import java.util.Date;

public class MessageCloneUtil {
    public static Message deepClone(Message input){
        //For message object, id(type long) and text(type string) are immutable, but date field is not
        Message output = new Message(input.getId(), input.getText());
        Date clonedDate = new Date();
        clonedDate.setTime(input.getMessageDate().getTime());
        output.setMessageDate(clonedDate);
        return output;
    }
}
