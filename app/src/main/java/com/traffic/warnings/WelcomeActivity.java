package com.traffic.warnings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends AppCompatActivity {

    @BindView(R.id.btn_play_list)
    Button mBtnPlayList;
    @BindView(R.id.btn_play)
    Button mBtnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_play_list, R.id.btn_play})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_play_list:

                break;
            case R.id.btn_play:
                startActivity(new Intent(this, PlayActivity.class));
                break;
        }
    }
}
