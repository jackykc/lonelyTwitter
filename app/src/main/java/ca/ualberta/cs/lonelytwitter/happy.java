package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jkc1 on 2017-01-20.
 */
public class happy extends Mood {

    /**
     * Instantiates a new Happy.
     *
     * @param date the date
     */
    public happy(Date date) {
        super(date);
    }

    /**
     * returns boolean to see if the tweet is important
     * */
    @Override
    public String myMood(){
        return "I am happy";
    };
}
