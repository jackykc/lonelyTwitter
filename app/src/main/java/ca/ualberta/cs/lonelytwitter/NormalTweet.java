package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jkc1 on 2017-01-20.
 */


public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * returns boolean to see if the tweet is important
     * */
    @Override
    public Boolean isImportant() {
        return true;
    }
}

