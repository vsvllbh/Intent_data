package com.example.vsvll.intent_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.EditText);
        button = findViewById(R.id.Sumbit);

    }

    public void onClick(View view) {
        String Name = editText.getText().toString();
        if(Name.length() == 0){
            editText.setError("You must Enter Your Name");
        }
        else{

            Intent intent = new Intent(MainActivity.this,SecondPage.class);
            //the below line will send the data to the next page using the Name
            intent.putExtra("Name",Name);
            startActivity(intent);

        }

    }
}
