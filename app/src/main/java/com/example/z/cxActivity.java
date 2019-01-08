package com.example.z;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cxActivity extends AppCompatActivity {
    Button Btn_cx_xx, Btn_cx_qd, Btn_cx_qt, Btn_cx_fh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cx);
        Btn_cx_xx = findViewById(R.id.btn_cx_xx);
        Btn_cx_qd = findViewById(R.id.btn_qd_qd);
        Btn_cx_qt = findViewById(R.id.btn_qt_qt);
        Btn_cx_fh = findViewById(R.id.btn_cx_fh);
        Btn_cx_fh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cxActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

