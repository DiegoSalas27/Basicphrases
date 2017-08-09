package com.example.android.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view){

        int id = view.getId();
        String ourId = "";

        //this way you get the string of the id given in the xml file
        ourId = view.getResources().getResourceEntryName(id);

        //we get another id for every single resource (reusable one to refer to each one of them)
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.android.basicphrases");

        //R.raw.doyouspeakenglish returns an integer (a long one)
        mPlayer = MediaPlayer.create(this, resourceId);
        mPlayer.start();


        Log.i("Button tapped", ourId);

    }
}
