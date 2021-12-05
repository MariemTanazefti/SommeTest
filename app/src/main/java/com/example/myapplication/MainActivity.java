package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txt1,txt2;
    private Button btn;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(EditText)findViewById(R.id.ed_1);
        txt2=(EditText)findViewById(R.id.ed_2);
        result=(TextView)findViewById(R.id.res_txt);
        btn=(Button)findViewById(R.id.btn_s);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nbr1=Integer.parseInt(txt1.getText().toString());
                int nbr2=Integer.parseInt(txt2.getText().toString());
                int somm=nbr1+nbr2;
                result.setText(String.valueOf(somm));
            }

        });
    }




}