package com.example.jiukheo.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected double res = 0.; //result
    protected Button ResultBtn;

    protected void inputNum(){
        }

       protected double co4(double A){

        return 0.;
        }

       protected double mathOp(double x){

        return 0.;
        }

       protected void printNum(double x){


        }
        protected void calc(){

        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button PlusBtn = (Button) findViewById(R.id.PlusBtn);
        Button SubBtn = (Button) findViewById(R.id.SubBtn);
        Button MulBtn = (Button) findViewById(R.id.MulBtn);
        Button DivBtn = (Button) findViewById(R.id.DivBtn);
        Button SinBtn = (Button) findViewById(R.id.SinBtn);
        Button CosBtn = (Button) findViewById(R.id.CosBtn);
        Button ResultBtn = (Button) findViewById(R.id.ResultBtn);
        Button ClearBtn = (Button) findViewById(R.id.ClearBtn);
        Button Num1Btn = (Button) findViewById(R.id.Num1Btn);
        Button Num2Btn = (Button) findViewById(R.id.Num2Btn);
        Button Num3Btn = (Button) findViewById(R.id.Num3Btn);
        Button Num4Btn = (Button) findViewById(R.id.Num4Btn);
        Button Num5Btn = (Button) findViewById(R.id.Num5Btn);
        Button Num6Btn = (Button) findViewById(R.id.Num6Btn);
        Button Num7Btn = (Button) findViewById(R.id.Num7Btn);
        Button Num8Btn = (Button) findViewById(R.id.Num8Btn);
        Button Num9Btn = (Button) findViewById(R.id.Num9Btn);

        EditText Num1 = (EditText) findViewById(R.id.Num1);
        EditText Num2 = (EditText) findViewById(R.id.Num2);

        TextView ResTextView = (TextView) findViewById(R.id.ResTextBtn);


        ResultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
            }
        });
    }
}
