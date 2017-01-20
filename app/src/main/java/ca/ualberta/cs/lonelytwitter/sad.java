package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jkc1 on 2017-01-20.
 */

public class sad extends Mood {

    public sad(Date date) {
        super(date);
    }

    @Override
    public String myMood(){
        return "I am sad";
    };
}
