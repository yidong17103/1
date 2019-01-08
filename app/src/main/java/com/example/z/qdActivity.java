package com.example.z;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class qdActivity extends AppCompatActivity {
    Button Btn_qd_qd,Btn_qd_fh;
    EditText editText_qd_name,editText_qd_id;
    private String b;
    private String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qd);
        Btn_qd_qd=findViewById(R.id.btn_qd_qd);
        Btn_qd_fh=findViewById(R.id.btn_qd_fh);
        editText_qd_name=findViewById(R.id.edt_qd_name);
        editText_qd_id=findViewById(R.id.edtTxt_qd_id);
        Btn_qd_fh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(qdActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Btn_qd_qd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Btn_qd_qd();
            }
        });
    }
    public void Btn_qd_qd(){
        a = editText_qd_name.getText().toString().trim();
        b = editText_qd_id.getText().toString().trim();
        if (a.equals("霍林清")&&b.equals("1711605006")){
            Toast.makeText(qdActivity.this,"霍林清签到成功",Toast.LENGTH_LONG).show();
        }
        if (a.equals("曾浪平")&&b.equals("1711605003")){
            Toast.makeText(qdActivity.this,"曾浪平签到成功",Toast.LENGTH_LONG).show();
        }
    else {
            Toast.makeText(qdActivity.this,"签到失败",Toast.LENGTH_LONG).show();
        }

    }
}

