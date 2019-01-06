package com.example.z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qdActivity extends AppCompatActivity {
    Button Btn_qd_qd,Btn_qd_fh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qd);
        Btn_qd_qd=findViewById(R.id.btn_qd_qd);
        Btn_qd_fh=findViewById(R.id.btn_qd_fh);
        Btn_qd_fh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(qdActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
