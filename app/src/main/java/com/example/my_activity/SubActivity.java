package com.example.my_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button apple_btn = (Button) findViewById(R.id.app_btn);
        Button facebook_btn = (Button) findViewById(R.id.face_btn);
        Button naver_btn = (Button) findViewById(R.id.nave_btn);
        Button kakao_btn = (Button) findViewById(R.id.kaka_btn);

        apple_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, thirdActivity.class);
                startActivity(intent);
            }
        });

        facebook_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, thirdActivity.class);
                startActivity(intent);
            }
        });

        naver_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, thirdActivity.class);
                startActivity(intent);
            }
        });

        kakao_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, thirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
