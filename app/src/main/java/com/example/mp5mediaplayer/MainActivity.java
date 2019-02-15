package com.example.mp5mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView IMV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IMV = (ImageView) findViewById(R.id.imageView);
    }
    MediaPlayer media;
    public void usa(View view){
        if (media.isPlaying()){
            media.stop();
        }
        media = MediaPlayer.create(this, R.raw.usa);
        IMV.setImageResource(R.drawable.usa);
    }
    public void Canada(View view){
        if (media.isPlaying()){
            media.stop();
        }
        media = MediaPlayer.create(this, R.raw.canada);
        IMV.setImageResource(R.drawable.canada);
    }
    public void Mexico(View view){
        if (media.isPlaying()){
            media.stop();
        }
        media = MediaPlayer.create(this, R.raw.mexico);
        IMV.setImageResource(R.drawable.mexico);
    }
    public void PP(View view){
        if (media.isPlaying()){
            media.stop();
        }
        else{
            media.start();
        }
    }

}
