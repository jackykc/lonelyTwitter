package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutionException;

/**
 * Created by jkc1 on 2017-01-20.
 */

public abstract class Tweet implements Tweetable{

    private Date date;
    private String message;
    private ArrayList<Mood> moodList;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(Date date, String message) {
        this.message = message;
        this.date = date;
    }

    public Tweet() {
        super();
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{

        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void addMood(Mood mood) {
        moodList.add(mood);
    }

    public abstract Boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
