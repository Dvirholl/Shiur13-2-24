package com.example.dviraplicationlesson6_2_24;

public class cardModel {
    String text;
    int image;

    public cardModel(String text, int image) {
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return this.text;
    }

    public int getImage() {
        return this.image;
    }
}