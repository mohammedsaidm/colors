package com.example.mohammedsaid.colors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();

        Bundle b=intent.getExtras();
        TextView textView=(TextView)findViewById(R.id.textToWrite);
        //String nam=b.getString("n");
        //int ag=b.getInt("a");
        textView.setText("Welcome "+b.getString("n")+"\nAge "+b.getInt("a"));
    }
}
