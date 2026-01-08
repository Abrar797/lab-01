package com.example.petshop;

import java.util.Date;

// Abstract base class
public abstract class Mood {

    // Encapsulation: private attribute
    private Date date;

    // Constructor 1: default date
    public Mood() {
        this.date = new Date();
    }

    // Constructor 2: custom date
    public Mood(Date date) {
        this.date = date;
    }

    // Getter
    public Date getDate() {
        return date;
    }

    // Setter
    public void setDate(Date date) {
        this.date = date;
    }

    // Each mood must describe itself
    public abstract String getMood();
}

