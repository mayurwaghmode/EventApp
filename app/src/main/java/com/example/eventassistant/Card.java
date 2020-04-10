package com.example.eventassistant;

public class Card {
    private String line1;
    private String line2;
    private String line3;
    private String line4;

    public Card(String line1 ,String line2, String line3, String line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }
    public String getLine3() {
        return line3;
    }
    public String getLine4() {
        return line4;
    }

}