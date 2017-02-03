package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jkc1 on 2017-01-20.
 */

/**
 * Interface used by the Tweet class
 * */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage();

    /**
     * Sets message.
     *
     * @param string the string
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String string) throws TweetTooLongException;
}
