package com.example.birthday_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private TextView myTexts;
    // private TextView weatherTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTexts = (TextView) findViewById(R.id.good_morning_text);
        //weatherTexts = (TextView) findViewById(R.id.weather_List);
        String[] names = ToyNamesList.getToyNames();
        //String[] weather = WeatherList.printList();
        for (String name:names){
            myTexts.append(name+"\n\n\n");


        }
    }
}