package com.example.vsvll.intent_data;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.Sumbit);

        //here the Name convention should be same
        String Name = getIntent().getStringExtra("Name");
        textView.setText("Hello "+Name+"!!");
    }

    public void Click(View view) {

        Intent intent = new Intent(SecondPage.this,MainActivity.class);
        startActivity(intent);

    }
}
