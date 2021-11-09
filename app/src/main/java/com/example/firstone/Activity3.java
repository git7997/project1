package com.example.firstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.firstone.model.Data;
import com.google.gson.Gson;

public class Activity3 extends AppCompatActivity {
    ImageView img;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        img=findViewById(R.id.imageView3);
        spinner=findViewById(R.id.spinner2);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String data = prefs.getString("mydata", "");
        Gson gson = new Gson();
        String data1 = gson.fromJson(data, String.class);

        if(data1=="Back workout"){
            img.setBackgroundResource(R.drawable.back);
        }else if(data1=="Chest workout")
        {
            img.setBackgroundResource(R.drawable.chest);
        }else if(data1=="Legs workout")
        {
            img.setBackgroundResource(R.drawable.leg);
        }else if(data1=="Arms workout")
        {
            img.setBackgroundResource(R.drawable.arm);
        }
    }
}