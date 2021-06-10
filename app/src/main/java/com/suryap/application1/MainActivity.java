package com.suryap.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button add,sub,mul,div;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        res=findViewById(R.id.text);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f+s;
                res.setText("Result=" +a);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f-s;
                res.setText("Result=" +a);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f*s;
                res.setText("Result=" +a);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                a=f/s;
                res.setText("Result=" +a);
            }
        });
    }
}

