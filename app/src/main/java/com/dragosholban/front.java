package com.dragosholban;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class front extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(v -> {
            Intent intent= new Intent(front.this,MainActivity.class);
            startActivity(intent);
        });
    }
}
