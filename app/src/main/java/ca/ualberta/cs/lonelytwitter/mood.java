package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jkc1 on 2017-01-20.
 */

public abstract class Mood {

    private Date date;

    /**
     * Constructors
     */

    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date(System.currentTimeMillis());
    }

    /**
     * Methods
     */

    // gets the date
    public Date getDate() {
        return date;
    }

    // sets the date
    public void setDate(Date date) {
        this.date = date;
    }

    // abstract method to be implemented by subclasses
    public abstract String myMood();

}
