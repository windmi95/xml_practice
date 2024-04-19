package com.example.my_activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

public class thirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        TextView textview;
        textview = findViewById(R.id.textViewSpannable);
        String content = textview.getText().toString();//textview text 가져오기
        SpannableString spannableString = new SpannableString(content);// 객체 생성

        String word = "제리아빠";
        int start = content.indexOf(word);
        int end = start + word.length();

        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#028A0F")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textview.setText(spannableString);
        // textview = "제리아빠" 글자색(초록색) 지정





    }





}
