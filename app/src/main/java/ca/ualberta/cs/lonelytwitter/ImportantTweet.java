package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jkc1 on 2017-01-20.
 */
public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return true;
    }

}
