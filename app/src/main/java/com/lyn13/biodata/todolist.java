package com.lyn13.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class todolist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        Button buttonsimpan = (Button) findViewById(R.id.buttonsim);
        buttonsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(todolist.this, "Berhasil Disimpan", Toast.LENGTH_LONG).show();


            }


        });
    }
}