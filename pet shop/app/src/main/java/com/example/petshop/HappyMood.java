package com.example.petshop;

import java.util.Date;

public class HappyMood extends Mood {

    // Default constructor
    public HappyMood() {
        super();
    }

    // Constructor with custom date
    public HappyMood(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Happy";
    }
}
