package com.saxena.learningapp;

/**
 * Created by Administrator on 4/14/2017.
 */

public class CardInfo {
    public CardInfo(int image_id, String name, String quote){
        this.setImage_id(image_id);
        this.setName(name);
        this.setQuote(quote);

    }
    private int image_id;
    private String name,quote;



    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote= quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
