package com.example.socialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_del,btn_cln;
    TextView textView1,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_del = findViewById(R.id.btn_del);
        btn_cln = findViewById(R.id.btn_cln);
        textView1=findViewById(R.id.text_1);
        textView2=findViewById(R.id.text_2);
        textView3=findViewById(R.id.text_3);
        textView4=findViewById(R.id.text_4);
        textView4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_cln.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_0){
            if (textView1.getText().equals("")){
            textView1.setText("0");}
            else if (textView1.getText().length()==1&&textView2.getText().equals("")){
                textView2.setText("0");
            }else if (textView2.getText().length()==1&&textView3.getText().equals("")){
                textView3.setText("0");
            }else if (textView3.getText().length()==1){
                textView4.setText("0");
            }
            Log.d("ovi", "onClick: "+textView2.getText().length());
        }else if (v.getId()==R.id.btn_1){

        }else if (v.getId()==R.id.btn_2){

        }else if (v.getId()==R.id.btn_3){

        }else if (v.getId()==R.id.btn_4){

        }else if (v.getId()==R.id.btn_5){

        }else if (v.getId()==R.id.btn_6){

        }else if (v.getId()==R.id.btn_7){

        }else if (v.getId()==R.id.btn_8){

        }else if (v.getId()==R.id.btn_9){

        }else if (v.getId()==R.id.btn_del){

        }else if (v.getId()==R.id.btn_cln){


        }
    }
}
