package com.example.firstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.firstone.model.factory;
import com.example.firstone.model.interfaceClass;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    factory fac =new factory();
    interfaceClass obj = fac.getModel();
    Spinner spinner;
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        spinner=findViewById(R.id.spinner2);
        arr=new ArrayList<>();
        for(int i=0;i<obj.getAllData().size();i++)
        {
            arr.add(obj.getAllData().get(i).getStr());
        }
        arrayAdapter=new ArrayAdapter<String>(Activity2.this, android.R.layout.simple_spinner_dropdown_item, arr);
        spinner.setAdapter(arrayAdapter);
    }

    public void view(View view) {
        Intent intent = new Intent(this, Activity3.class);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String myObj = gson.toJson(spinner.getSelectedItem());
        editor.putString("mydata", myObj);
        editor.commit();
        startActivity(intent);


    }
}