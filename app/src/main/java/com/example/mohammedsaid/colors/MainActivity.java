package com.example.mohammedsaid.colors;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout re;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void changeToSecondActivity(View view){

        re=(RelativeLayout)findViewById(R.id.relative);
        EditText editText=(EditText)findViewById(R.id.editText);



        if (editText.getText().length()==0) {
            Toast.makeText(this, "لازم تكتب الاسم", Toast.LENGTH_SHORT);
        }
        else {
            Intent intent=new Intent(MainActivity.this,secondActivity.class);
            Bundle b=new Bundle();
            b.putString("n", editText.getText().toString());
            b.putInt("a",23);
            intent.putExtras(b);
            startActivity(intent);
        }
    }
}
