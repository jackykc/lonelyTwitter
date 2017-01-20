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
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String myMood();

//    public String myMood(){
//        return "default";
//    }
}
