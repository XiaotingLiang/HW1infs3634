package com.example.homeworktask1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //NewYork part
        LinearLayout newyork = findViewById(R.id.newyork);
        ImageView newyorkimage = newyork.findViewById(R.id.imageView);
        newyorkimage.setImageResource(R.drawable.newyork);
        TextView newyorktext =newyork.findViewById(R.id.textView2);
        newyorktext.setText(R.string.newyork);
        final TextClock clock1 = newyork.findViewById(R.id.timeclock);
        clock1.setFormat12Hour("h:mmaa");
        clock1.setTimeZone("America/New_York");
        // Sydney part
        LinearLayout sydney= findViewById(R.id.sydney);
        ImageView sydimage = sydney.findViewById(R.id.imageView);
        sydimage.setImageResource(R.drawable.syd);
        TextView sydtext =sydney.findViewById(R.id.textView2);
        sydtext.setText(R.string.sydney);
        final TextClock clocksyd = sydney.findViewById(R.id.timeclock);
        clocksyd.setFormat12Hour("h:mmaa");
        clocksyd.setTimeZone("Australia/Sydney");
        //Beijing
        LinearLayout beijing= findViewById(R.id.beijing);
        ImageView beijingimage = beijing.findViewById(R.id.imageView);
        beijingimage.setImageResource(R.drawable.beijing);
        TextView beijingtext =beijing.findViewById(R.id.textView2);
        beijingtext.setText(R.string.beijing);
        final TextClock clockbeijing = beijing.findViewById(R.id.timeclock);
        clockbeijing.setFormat12Hour("h:mmaa");
        clockbeijing.setTimeZone("Asia/Shanghai");
        //Japan
        LinearLayout japan= findViewById(R.id.japan);
        ImageView japanimage = japan.findViewById(R.id.imageView);
        japanimage.setImageResource(R.drawable.japan);
        TextView japantext =japan.findViewById(R.id.textView2);
        japantext.setText(R.string.japan);
        final TextClock clockjapan = japan.findViewById(R.id.timeclock);
        clockjapan.setFormat12Hour("h:mmaa");
        clockjapan.setTimeZone("Japan");
        //London
        LinearLayout london = findViewById(R.id.london);
        ImageView londonimage = london.findViewById(R.id.imageView);
        londonimage.setImageResource(R.drawable.london);
        TextView londontext =london.findViewById(R.id.textView2);
        londontext.setText(R.string.london);
        final TextClock clocklondon = london.findViewById(R.id.timeclock);
        clocklondon.setFormat12Hour("h:mmaa");
        clocklondon.setTimeZone("Europe/London");


        //Button part
        Button button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clock1.setFormat12Hour("H:mm:ss");
                clocksyd.setFormat12Hour("H:mm:ss");
                clockbeijing.setFormat12Hour("H:mm:ss");
                clockjapan.setFormat12Hour("H:mm:ss");
                clocklondon.setFormat12Hour("H:mm:ss");

            }


        });

        Button button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clock1.setFormat12Hour("h:mmaa");
                clocksyd.setFormat12Hour("h:mmaa");
                clockbeijing.setFormat12Hour("h:mmaa");
                clockjapan.setFormat12Hour("h:mmaa");
                clocklondon.setFormat12Hour("h:mmaa");

            }
        });




    }


}