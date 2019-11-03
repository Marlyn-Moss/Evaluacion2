package com.example.evaluacion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button, button2, button3, button4, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21;
    TextView  txtRes;
    EditText txtOp;
    double result;
    String operador;
    String mostrar;
    String reserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        txtOp = findViewById(R.id.txtOp);
        txtRes = findViewById(R.id.txtRes);

        setTitle("MM15-I04-004");

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            //Se cumple que sea Landscape entonces llamo a mis controles

            button19 = findViewById(R.id.button19);
            button20 = findViewById(R.id.button20);
            button21 = findViewById(R.id.button21);

            button19.setOnClickListener(this);
            button20.setOnClickListener(this);
            button21.setOnClickListener(this);


        }


        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.button: {
            mostrar = "";
            txtOp.setText(mostrar);
            reserva = "";
            operador = "";

        }break;

        case R.id.button2:{
        mostrar = txtOp.getText().toString();
        mostrar = mostrar.substring(0,mostrar.length()-1);
        txtOp.setText(mostrar);

        }break;

        case R.id.button3:{

            reserva = txtOp.getText().toString();
            operador =  "+";
            txtOp.setText("");

        }break;

        case R.id.button4:{

            reserva = txtOp.getText().toString();
            operador = "-";
            txtOp.setText("");

        }break;

        case R.id.button6:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "7";
            txtOp.setText(mostrar);

        }break;

        case R.id.button7:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "8";
            txtOp.setText(mostrar);

        }break;

        case R.id.button8:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "9";
            txtOp.setText(mostrar);

        }break;

        case R.id.button9:{
            reserva = txtOp.getText().toString();
            operador = "/";
            txtOp.setText("");

        }break;

        case R.id.button10:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "4";
            txtOp.setText(mostrar);

        }break;

        case R.id.button11:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "5";
            txtOp.setText(mostrar);

        }break;

        case R.id.button12:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "6";
            txtOp.setText(mostrar);

        }break;

        case R.id.button13:{
            reserva = txtOp.getText().toString();
            operador = "*";
            txtOp.setText("");

        }break;

        case R.id.button14:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "1";
            txtOp.setText(mostrar);
        }break;

        case R.id.button15:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "2";
            txtOp.setText(mostrar);
        }break;

        case R.id.button16:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "3";
            txtOp.setText(mostrar);
        }break;

        case R.id.button17:{
            mostrar = txtRes.getText().toString();
            mostrar = mostrar + "1";

            if (operador.equals("+")){
                result = Double.parseDouble(reserva) + Double.parseDouble(txtOp.getText().toString());
                txtRes.setText(String.valueOf(result));
            }
            if (operador.equals("-")){
                result = Double.parseDouble(reserva) - Double.parseDouble(txtOp.getText().toString());
                txtRes.setText(String.valueOf(result));
            }
            if (operador.equals("*")){
                result = Double.parseDouble(reserva) * Double.parseDouble(txtOp.getText().toString());
                txtRes.setText(String.valueOf(result));
            }
            if (operador.equals("/")){
                result = Double.parseDouble(reserva) / Double.parseDouble(txtOp.getText().toString());
                txtRes.setText(String.valueOf(result));
            }

        }break;

        case R.id.button18:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "0";
            txtOp.setText(mostrar);

        }break;

        case R.id.button19:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + "(";
            txtOp.setText(mostrar);

        }break;

        case R.id.button20:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + ")";
            txtOp.setText(mostrar);

        }break;

        case R.id.button21:{
            mostrar = txtOp.getText().toString();
            mostrar = mostrar + ".";
            txtOp.setText(mostrar);

        }break;
        default:{

        }
    }

    }


}

/*
private class string (double a){
        NumberFormat num = new DecimalFormat("##.##");
        String format = num.format(a);
        return num.format(a);
    }
 */
