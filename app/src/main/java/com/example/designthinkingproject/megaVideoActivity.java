package com.example.designthinkingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class megaVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mega_video);
        VideoView videoView = (VideoView)findViewById(R.id.myMegaVideo);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.megafinalvideoreal));
        videoView.start();
        final MediaController mediaController =
                new MediaController(this);
        videoView.setMediaController(mediaController);
    }
}