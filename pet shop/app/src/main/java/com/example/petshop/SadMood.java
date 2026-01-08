package com.example.petshop;

import java.util.Date;

public class SadMood extends Mood {

    // Default constructor
    public SadMood() {
        super();
    }

    // Constructor with custom date
    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "Sad";
    }
}
