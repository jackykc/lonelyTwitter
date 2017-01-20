package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jkc1 on 2017-01-20.
 */

public class happy extends Mood {

    public happy(Date date) {
        super(date);
    }

    @Override
    public String myMood(){
        return "I am happy";
    };
}
