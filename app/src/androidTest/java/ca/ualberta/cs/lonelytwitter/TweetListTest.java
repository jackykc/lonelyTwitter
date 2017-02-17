package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by jkc1 on 2017-02-17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");


        tweets.addTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));

    }


    public void testGetTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.addTweet(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testDeleteTweet() {

        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.addTweet(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        NormalTweet tweet1 = new NormalTweet("Turtle");
        tweets.addTweet(tweet);
        tweets.addTweet(tweet1);

    }


    // tests for duplication
    public void testDuplicateException() {

        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.addTweet(tweet);
        try {
            tweets.addTweet(tweet);
            // assertion runs if exception not thrown
            assertTrue(false);
        } catch (IllegalArgumentException e) {

        }
    }

    // tests if the tweetlist is chronological
    public void testChronological() {

        TweetList tweets = new TweetList();
        NormalTweet tweet0 = new NormalTweet("some tweet");
        NormalTweet tweet1 = new NormalTweet("some tweet1");
        NormalTweet tweet2 = new NormalTweet("some tweet2");

        tweets.addTweet(tweet0);
        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);

        ArrayList<NormalTweet> returnedTweets = tweets.getTweets();
        assertEquals(returnedTweets.get(0), tweet0);
        assertEquals(returnedTweets.get(1), tweet1);
        assertEquals(returnedTweets.get(2), tweet2);
    }


    // tests if the tweet exists in the tweetlist
    public void testHasTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    // test if the tweetlist has the correct count
    public void testGetCount() {

        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        NormalTweet tweet1 = new NormalTweet("Turtle");
        tweets.addTweet(tweet);
        tweets.addTweet(tweet1);

        assertEquals(tweets.getCount(), 2);
    }
}
