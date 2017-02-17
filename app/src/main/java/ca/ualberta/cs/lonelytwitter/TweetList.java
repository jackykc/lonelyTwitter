package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by jkc1 on 2017-02-17.
 */

public class TweetList {

    private ArrayList<NormalTweet> tweets =  new ArrayList<NormalTweet>();

    public void addTweet(NormalTweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }

    }

    public int getCount() {
        return tweets.size();
    }

    public ArrayList<NormalTweet> getTweets() {
        return tweets;
    }

    public boolean hasTweet(NormalTweet tweet) {
        return tweets.contains(tweet);
    }

    public NormalTweet getTweet(int index) {
        return tweets.get(index);
    }

    public void delete(NormalTweet tweet) {
        tweets.remove(tweet);
    }
}
