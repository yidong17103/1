package com.example.z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ryxxActivity extends AppCompatActivity {
      Button Btn_fh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryxx);
        Btn_fh=findViewById(R.id.btn_fhry);
        Btn_fh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ryxxActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
