package com.example.admin.datatransfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Main2Activity extends AppCompatActivity {
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name = getIntent().getStringExtra("NAME");
        r=(TextView)findViewById(R.id.rst);
        r.setText(name);
        }
    }