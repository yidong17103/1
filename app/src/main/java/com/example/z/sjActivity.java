package com.example.z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sjActivity extends AppCompatActivity {
    Button Btn_fzb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sj);
        Btn_fzb=findViewById(R.id.btn_fhzb);
        Btn_fzb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sjActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
