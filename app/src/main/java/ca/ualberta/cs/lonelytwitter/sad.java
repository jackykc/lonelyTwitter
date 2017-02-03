package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jkc1 on 2017-01-20.
 */

/**
 * Sad is a subclass of mood
 * */
public class sad extends Mood {

    public sad(Date date) {
        super(date);
    }

    /**
     * @return "I am sad for a sad mood subclass"
     */

    @Override
    public String myMood(){
        return "I am sad";
    };
}
