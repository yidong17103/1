package com.example.z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Btn_zb,Btn_ry,Btn_qd,Btn_qt,Btn_cx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Btn_zb=findViewById(R.id.btn_zb);
    Btn_ry=findViewById(R.id.btn_ry);
    Btn_qd=findViewById(R.id.btn_qd);
    Btn_qt=findViewById(R.id.btn_qt);
    Btn_cx=findViewById(R.id.btn_cx);
    Btn_zb.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,sjActivity.class);
            startActivity(intent);
        }
    });

        Btn_ry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ryxxActivity.class);
                startActivity(intent);
            }
        });

        Btn_qd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,qdActivity.class);
                startActivity(intent);
            }
        });

        Btn_qt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,qtActivity.class);
                startActivity(intent);
            }
        });
        Btn_cx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,cxActivity.class);
                startActivity(intent);
            }
        });






}
}
