package com.example.firstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.firstone.model.Info;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    EditText txtu;
    EditText txtu2;
    EditText pass;
    EditText weight;
    EditText hight;
  SharedPreferences share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        share=getSharedPreferences("folder", Context.MODE_PRIVATE);
        txtu=(EditText)findViewById(R.id.tx1);
        txtu2=(EditText)findViewById(R.id.tx2);
        pass=(EditText)findViewById(R.id.pass);
        weight=(EditText)findViewById(R.id.weight);
        hight=(EditText)findViewById(R.id.hight);


    }



    public void next(View view) {
        Thread thread = new Thread(new threadclass(10));
        thread.start();
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
        Info info=new Info(txtu.getText().toString(),txtu2.getText().toString(),pass.getText().toString(),
                weight.getText().toString(),hight.getText().toString());
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String data1 = gson.toJson(info);

        editor.putString("data", data1);
        editor.commit();
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);

    }
    class threadclass implements Runnable {
        int seconds;

        public threadclass(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {

            for (int i = 0; i < seconds; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
