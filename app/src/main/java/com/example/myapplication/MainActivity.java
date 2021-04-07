package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnClear,btnDot;
    TextView header;
    EditText ans;
    float valueOne,valueTwo;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnDot=(Button)findViewById(R.id.btnDot);
        header=(TextView)findViewById(R.id.header);
        ans=(EditText)findViewById(R.id.ans);

        btn0.setOnClickListener(v -> ans.setText(ans.getText()+"0"));
        btn1.setOnClickListener(v -> ans.setText(ans.getText()+"1"));
        btn2.setOnClickListener(v -> ans.setText(ans.getText()+"2"));
        btn3.setOnClickListener(v -> ans.setText(ans.getText()+"3"));
        btn4.setOnClickListener(v -> ans.setText(ans.getText()+"4"));
        btn5.setOnClickListener(v -> ans.setText(ans.getText()+"5"));
        btn6.setOnClickListener(v -> ans.setText(ans.getText()+"6"));
        btn7.setOnClickListener(v -> ans.setText(ans.getText()+"7"));
        btn8.setOnClickListener(v -> ans.setText(ans.getText()+"8"));
        btn9.setOnClickListener(v -> ans.setText(ans.getText()+"9"));

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }else{
                    valueOne=Float.parseFloat(ans.getText()+"");
                    add=true;
                    ans.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne=Float.parseFloat(ans.getText()+"");
                sub=true;
                ans.setText(null);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne=Float.parseFloat(ans.getText()+"");
                mul=true;
                ans.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne=Float.parseFloat(ans.getText()+"");
                div=true;
                ans.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo=Float.parseFloat(ans.getText()+"");
                if(add){
                    ans.setText(valueOne+valueTwo+"");
                    add=false;
                }
                if(sub){
                    ans.setText(valueOne-valueTwo+"");
                    sub=false;
                }
                if(mul){
                    ans.setText(valueOne*valueTwo+"");
                    mul=false;
                }
                if(div){
                    ans.setText(valueOne/valueTwo+"");
                    div=false;
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+".");
            }
        });
    }
}