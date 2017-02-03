package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jkc1 on 2017-01-20.
 */

/**
 * Super class mood
 */

public abstract class Mood {

    private Date date;

    /**
     * Constructors
     *
     * @param date the date
     */
    public Mood(Date date) {
        this.date = date;
    }

    /**
     * Instantiates a new Mood.
     */
    public Mood() {
        this.date = new Date(System.currentTimeMillis());
    }

    /**
     * Methods
     *
     * @return the date
     */
// gets the date
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Abstract method to be implemented by subclasses
     *
     * @return the string
     */
    public abstract String myMood();

}
