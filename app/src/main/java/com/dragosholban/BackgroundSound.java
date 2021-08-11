package com.dragosholban;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class BackgroundSound extends Service {
    public static MediaPlayer myPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {


        myPlayer = MediaPlayer.create(this,R.raw.song);
        myPlayer.setLooping(false);
        //setting loop play to true
        //this will make the ringtone continuously playing         // Set looping
    }
    @Override
    public void onStart(Intent intent, int startid) {

        myPlayer.start();
    }
    @Override
    public void onDestroy() {

        myPlayer.stop();
    }
    public static void stop(){
        myPlayer.stop();
    }


}