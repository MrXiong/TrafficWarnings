package com.traffic.warnings;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.IOException;
import java.io.InputStream;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayActivity extends AppCompatActivity {

    @BindView(R.id.video_play)
    VideoView mVideoView;
    private String uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        ButterKnife.bind(this);
        uri = ("android.resource://" + getPackageName() + "/" + R.raw.v1);
        initVideo();
    }

    private void initVideo() {
        MediaController localMediaController = new MediaController(this);
        mVideoView.setMediaController(localMediaController);
  /*      mVideoView.setVideoURI(Uri.parse("https://github.com/MrXiong/TrafficWarnings/blob/master/app/src/main/res/raw/v1.mp4"));
        mVideoView.start();*/


        String url="http://ivi.bupt.edu.cn/hls/cctv6hd.m3u8";
        mVideoView.setVideoPath(url);
        mVideoView.requestFocus();
        mVideoView.start();
    }
}
