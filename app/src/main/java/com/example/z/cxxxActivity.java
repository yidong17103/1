package com.example.z;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cxxxActivity extends AppCompatActivity {
        Button Btn_cx_xx,Btn_cx_qd,Btn_cx_qt,Btn_cx_fh;
        EditText Et_cx_id;
        TextView Tv_cx_xx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cxxx);
        Btn_cx_xx=findViewById(R.id.btn_cx_xx);
        Btn_cx_qd=findViewById(R.id.btn_qd_qd);
        Btn_cx_qt=findViewById(R.id.btn_cx_qt);
        Et_cx_id=findViewById(R.id.et_cx_id);
        Tv_cx_xx=findViewById(R.id.tv_cx_xx);

    }
}
