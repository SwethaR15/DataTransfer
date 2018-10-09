package com.example.admin.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b1;
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn_1);
        e1=(EditText) findViewById(R.id.etn_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = e1.getText().toString();
                if (str.length() == 0){
                    e1.setError("invalid name");

                }
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("NAME",e1.getText().toString());
                startActivity(intent);

            }
        });
    }
}
