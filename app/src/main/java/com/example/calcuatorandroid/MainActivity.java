package com.example.calcuatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnone;
    private Button btntwo;
    private Button btnthree;
    private Button btnfour;
    private Button btnfive;
    private Button btnsix;
    private Button btnseven;
    private Button btneight;
    private Button btnnine;
    private Button btnzero;
    private Button btnplus;
    private Button btntime;
    private Button btnminus;
    private Button btndivide;
    private Button btnreset;
    private Button btnequal;
    private Button btndelet;
    private Button btnpoint;

    private TextView operand1;
    private TextView operand2;
    private TextView operation;
    private TextView equa;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnone = findViewById(R.id.one);
         btntwo = findViewById(R.id.two);
         btnthree = findViewById(R.id.three);
         btnfour = findViewById(R.id.four);
         btnfive = findViewById(R.id.five);
         btnsix = findViewById(R.id.six);
         btnseven = findViewById(R.id.seven);
         btneight = findViewById(R.id.eight);
         btnnine = findViewById(R.id.nine);
         btnzero = findViewById(R.id.zero);
         btnplus = findViewById(R.id.plus);
         btntime = findViewById(R.id.time);
         btnminus = findViewById(R.id.minus);
         btndivide = findViewById(R.id.divide);
         btnreset = findViewById(R.id.reset);
         btnequal = findViewById(R.id.equal);
         btndelet = findViewById(R.id.delet);
        btnpoint = findViewById(R.id.point);
         operand1 = findViewById(R.id.operand1);
         operand2 = findViewById(R.id.operand2);
         operation = findViewById(R.id.operation);
         equa = findViewById(R.id.equa);
         result = findViewById(R.id.result);



        btnone.setOnClickListener(this);
        btntwo.setOnClickListener(this);
        btnthree.setOnClickListener(this);
        btnfour.setOnClickListener(this);
        btnfive.setOnClickListener(this);
        btnsix.setOnClickListener(this);
        btnseven.setOnClickListener(this);
        btneight.setOnClickListener(this);
        btnnine.setOnClickListener(this);
        btnzero.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        btntime.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnreset.setOnClickListener(this);
        btndelet.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        btnpoint.setOnClickListener(this);
        operation.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

     switch (v.getId())  {

         case R.id.one:
             operand1.setText(operand1.getText().toString() + "1");
             break;
         case R.id.two:
             operand1.setText(operand1.getText().toString() + "2");
             break;

         case R.id.three:
             operand1.setText(operand1.getText().toString() + "3");
             break;
         case R.id.four:
             operand1.setText(operand1.getText().toString() + "4");
             break;
         case R.id.five:
             operand1.setText(operand1.getText().toString() + "5");
             break;
         case R.id.six:
             operand1.setText(operand1.getText().toString() + "6");
             break;
         case R.id.seven:
             operand1.setText(operand1.getText().toString() + "7");
             break;
         case R.id.eight:
             operand1.setText(operand1.getText().toString() + "8");
             break;
         case R.id.nine:
             operand1.setText(operand1.getText().toString() + "9");
             break;
         case R.id.zero:
             operand1.setText(operand1.getText().toString() + "0");
             break;
         case R.id.point:
             operand1.setText(operand1.getText().toString() + ".");
             break;
         case R.id.reset:
           operand1.setText("");
             operand2.setText("");
             operation.setText("");
             result.setText("");
             equa.setText("");
             break;
         case R.id.plus :
             operation.setText( "+");
             operand2.setText(operand1.getText().toString());
             operand1.setText("");
             break;
         case R.id.time :
             operation.setText( "*");
             operand2.setText(operand1.getText().toString());
             operand1.setText("");
             break;
         case R.id.minus :
             operation.setText( "-");
             operand2.setText(operand1.getText().toString());
             operand1.setText("");
             break;
         case R.id.divide :
             operation.setText( "/");
             operand2.setText(operand1.getText().toString());
             operand1.setText("");
             break;
         case R.id.equal:
             equa.setText("=");
             if (operation.getText().toString().equals("+")) {
                 float a=Float.parseFloat(operand1.getText().toString());
                 float b=Float.parseFloat(operand2.getText().toString());
                 result.setText(String.valueOf(a+b));

             }
             if (operation.getText().toString().equals("*")) {
                 float a=Float.parseFloat(operand1.getText().toString());
                 float b=Float.parseFloat(operand2.getText().toString());
                 result.setText(String.valueOf(a*b));

             }
             if (operation.getText().toString().equals("-")) {
                 float a=Float.parseFloat(operand1.getText().toString());
                 float b=Float.parseFloat(operand2.getText().toString());
                 result.setText(String.valueOf(b-a));

             }
             if (operation.getText().toString().equals("/")) {
                 float a=Float.parseFloat(operand1.getText().toString());
                 float b=Float.parseFloat(operand2.getText().toString());
                 result.setText(String.valueOf(b/a));

             }
             break;
         case R.id.delet:
             if (!(operand1.getText().toString().equals(""))) {
                 operand1.setText(operand1.getText().toString().substring(0,
                         operand1.getText().toString().length() - 1));
             }
             else {

             }
             break;





     }

    }
}