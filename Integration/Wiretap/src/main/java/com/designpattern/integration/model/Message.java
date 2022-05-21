package com.designpattern.integration.model;

import java.util.Calendar;
import java.util.Date;

public class Message {
    private long id;
    private String text;
    private Date messageDate;

    public Message(long id, String text){
        this.id=id;
        this.text=text;
        messageDate = new Date();
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public Date getMessageDate() { return messageDate; }

    public void setMessageDate(Date messageDate) { this.messageDate = messageDate; }

    @Override
    public String toString() {
        return String.format("{ \"id\":%s, \"text\":\"%s\", \"dated\":\"%s\" }",id,text,messageDate);
    }
}
