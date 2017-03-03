/*
 * Copyright (c) 2017. Team A CMPUT 301 University of Alberta. All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of Code of Student Behaviour at University of Alberta.
 * You can find a copy of this liscense in this project, otherwise contact via email
 */

package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class EditTweetActivity extends Activity {
    private static final String FILENAME = "file.sav";

    private ListView oldTweetsList;
    /**
     * The Adapter.
     */
    private ArrayList<Tweet> tweetList;
    private Tweet current;
    int position;

    TextView messageText;
    TextView dateText;


    public TextView getTweetMessage() {
        return messageText;
    }
    public TextView getTweetDate() {
        return dateText;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extra = getIntent().getExtras();
        //position = 0;
        position = extra.getInt("TweetIndex");

        setContentView(R.layout.activity_edit_tweet);
        messageText = (TextView) findViewById(R.id.showTweet);
        dateText = (TextView) findViewById(R.id.showTweetDate);


    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        loadFromFile();
        String message = current.getMessage();
        Date tweetDate = current.getDate();
        messageText.setText(message);
        dateText.setText(tweetDate.toString());

        System.out.println(messageText.getText());

    }

    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            Gson gson = new Gson();
            // Taken from
            // http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
            // 2017-01-26 17:53:59
            tweetList = gson.fromJson(in, new TypeToken<ArrayList<NormalTweet>>(){}.getType());
            current = tweetList.get(position);

            fis.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            tweetList = new ArrayList<Tweet>();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException();
        }
    }

}
