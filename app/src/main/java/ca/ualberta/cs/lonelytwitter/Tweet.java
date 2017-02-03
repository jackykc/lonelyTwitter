package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutionException;

/**
 * Created by jkc1 on 2017-01-20.
 */

/**
 * Tweet is a superclass that represents a tweet
 * */
public abstract class Tweet implements Tweetable{

    private Date date;
    private String message;
    private ArrayList<Mood> moodList;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public Tweet(Date date, String message) {
        this.message = message;
        this.date = date;
    }

    /**
     * Instantiates a new Tweet.
     */
    public Tweet() {
        super();
        this.date = new Date();
    }

    /**
     * Gets date.
     *
     * @return the date
     */
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
     * Gets the message from the Tweet class
     * @return the message
     * */
    public String getMessage() {
        return message;
    }


    /**
     * Sets the message for the tweet class
     * @param message the message
     * */
    public void setMessage(String message) throws TweetTooLongException{

        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Add mood.
     *
     * @param mood the mood
     */
    public void addMood(Mood mood) {
        moodList.add(mood);
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    /**
     * @return a formatted string that represents the tweet
     * */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
