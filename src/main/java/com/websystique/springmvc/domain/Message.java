package com.websystique.springmvc.domain;

public class Message {
    String name;
    String text;

    public Message(String text, String name) {
        this.text = text;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
