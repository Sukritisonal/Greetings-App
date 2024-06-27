package com.mastercoding.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.greetingsapp.R;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button myBtn;
    TextView title;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        myBtn = findViewById(R.id.btn);
        title = findViewById(R.id.title);


        myBtn.setOnClickListener(v -> {

            String inputName = editText.getText().toString();

            Toast.makeText(
                    MainActivity.this,
                    "Welcome "+inputName +" to our App",
                    Toast.LENGTH_LONG).show();
        });

    }
}