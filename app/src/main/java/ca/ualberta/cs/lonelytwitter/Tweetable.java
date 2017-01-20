package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jkc1 on 2017-01-20.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}
