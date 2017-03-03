package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.robotium.solo.Solo;

import junit.framework.TestCase;

import org.w3c.dom.Text;

/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();
    }

    public void testTweet(){

        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body), "TestTweet" );

        solo.clickOnButton("Save");


        solo.clearEditText((EditText) solo.getView(R.id.body));

        assertTrue(solo.waitForText("TestTweet"));

        solo.clickOnButton("Clear");

        assertFalse(solo.searchText("testTweet"));

    }

    public void testClickTweetList(){
        LonelyTwitterActivity activity = (LonelyTwitterActivity)solo.getCurrentActivity();

        solo.assertCurrentActivity("Wrong activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");
        solo.enterText((EditText) solo.getView(R.id.body), "TestTweet");
        solo.clickOnButton("Save");
        solo.waitForText("TestTweet");

        final ListView oldTweetsList = activity.getOldTweetsList();
        Tweet tweet = (Tweet) oldTweetsList.getItemAtPosition(0);
        assertEquals("TestTweet", tweet.getMessage());

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong Activity", EditTweetActivity.class);

        // lab 7 here
        // test if the tweet message being displayed in EditTweetActivity is the
        // same as the message in the tweet
        EditTweetActivity editActivity = (EditTweetActivity)solo.getCurrentActivity();
        solo.waitForText("TestTweet");

        final TextView tweetMessage = editActivity.getTweetMessage();
        final TextView tweetDate = editActivity.getTweetDate();
        assertEquals("TestTweet", tweetMessage.getText());
        assertEquals(tweet.getDate().toString(), tweetDate.getText().toString());

        solo.goBack();
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);

    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}