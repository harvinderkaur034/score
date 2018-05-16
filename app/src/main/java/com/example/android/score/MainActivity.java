package com.example.android.score;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int outTeamA = 0;
    int outTeamB = 0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void addOneForTeamA(View v) {
        if (outTeamA < 10) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addFourForTeamA(View v) {
        if (outTeamA < 10) {
            scoreTeamA = scoreTeamA + 4;
            displayForTeamA(scoreTeamA);
        }
    }

    public void addSixForTeamA(View v) {
        if (outTeamA < 10) {
            scoreTeamA = scoreTeamA + 6;
            displayForTeamA(scoreTeamA);
        }
    }

    public void outForTeamA(View v) {
        if (outTeamA < 10) {
            outTeamA = outTeamA + 1;
        }
        displayForTeamA1(outTeamA);
    }


    public void addOneForTeamB(View v) {
        if (outTeamB < 10) {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
    }

    public void addFourForTeamB(View v) {
        if (outTeamB < 10) {
            scoreTeamB = scoreTeamB + 4;
            displayForTeamB(scoreTeamB);
        }
    }

    public void addSixForTeamB(View v) {
        if (outTeamB < 10) {
            scoreTeamB = scoreTeamB + 6;
            displayForTeamB(scoreTeamB);
        }
    }

    public void outForTeamB(View v) {
        if (outTeamB < 10) {
            outTeamB = outTeamB + 1;
        }
        displayForTeamB1(outTeamB);
    }


    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        outTeamA = 0;
        outTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamA1(outTeamA);
        displayForTeamB1(outTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamA1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_A1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_B1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
