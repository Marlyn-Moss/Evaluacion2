package com.example.evaluacion_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button, button2, button3, button4, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21;
    TextView  txtRes;
    EditText txtOp;

    double num1=0, num2=0, result=0;
    String mos1="", mos2="";
    String mostrar="";

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
            txtOp.setText("");
            mostrar = "";
            mos1 = "";
            mos2 = "";
            result=0;
            txtOp.setText("");
            txtRes.setText("");
            num1 = 0;
            num2 = 0;


        }break;

        case R.id.button2:{
            String text = txtOp.getText().toString();
            text = text.substring(0, text.length()-1);
            txtOp.setText(text);
            txtOp.setSelection(txtOp.getText().length());

            if (!mos2.isEmpty()){
                String Text2 = mos2;
                mos2 = Text2.substring(0, Text2.length()-1);
            }else if (!mos1.isEmpty()){
                String Text1 = mos1;
                mos1 = Text1.substring(0, Text1.length()-1);
            }

        }break;

        case R.id.button3:{

            if (txtOp.getText().length() != 0){
                String text = txtOp.getText().toString();
                if (text.charAt(text.length()-1) == '/' || text.charAt(text.length()-1) == '-' || text.charAt(text.length()-1) == '*'){

                    text = text.substring(0, text.length()-1);
                    txtOp.setText(text + "+");
                    txtOp.setSelection(txtOp.getText().length());
                }else {
                    txtOp.setText(txtOp.getText() + "+");
                    txtOp.setSelection(txtOp.getText().length());
                }
            }
            mostrar = "+";

            if (!mos2.isEmpty() && result != 0) {
                num2 = Double.parseDouble(mos2);

                result = result + num2;
                txtRes.setText(String.valueOf(result));
                num1 = 0;
                num2 = 0;
                mos1 = "";
                mos2 = "";
            }

        }break;

        case R.id.button4:{
            if (txtOp.getText().length() != 0){
                String text = txtOp.getText().toString();
                if (text.charAt(text.length()-1) == '/' || text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '*'){

                    text = text.substring(0, text.length()-1);
                    txtOp.setText(text + "-");
                    txtOp.setSelection(txtOp.getText().length());
                }else {
                    txtOp.setText(txtOp.getText() + "-");
                    txtOp.setSelection(txtOp.getText().length());
                }
            }
            mostrar = "-";

            if (!mos2.isEmpty() && result != 0){
                num2 = Double.parseDouble(mos2);

                result = result - num2;
                txtRes.setText(String.valueOf(result));
                num1 = 0;
                num2 = 0;
                mos1 = "";
                mos2 = "";
            }


        }break;

        case R.id.button6:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "7");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 7;
            }else{
                txtOp.setText(txtOp.getText() + "7");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 7;
            }

        }break;

        case R.id.button7:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "8");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 8;
            }else{
                txtOp.setText(txtOp.getText() + "8");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 8;
            }

        }break;

        case R.id.button8:{

            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "9");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 9;
            }else{
                txtOp.setText(txtOp.getText() + "9");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 9;
            }
        }break;

        case R.id.button9:{
            if (txtOp.getText().length() != 0){
                String text = txtOp.getText().toString();
                if (text.charAt(text.length()-1) == '*' || text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'){

                    text = text.substring(0, text.length()-1);
                    txtOp.setText(text + "/");
                    txtOp.setSelection(txtOp.getText().length());
                }else {
                    txtOp.setText(txtOp.getText() + "/");
                    txtOp.setSelection(txtOp.getText().length());
                }
            }
            mostrar = "/";

            if (!mos2.isEmpty() && result != 0){
                num2 = Double.parseDouble(mos2);

                result = result / num2;
                txtRes.setText(String.valueOf(result));
                num1 = 0;
                num2 = 0;
                mos1 = "";
                mos2 = "";
            }

        }break;

        case R.id.button10:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "4");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 4;
            }else{
                txtOp.setText(txtOp.getText() + "4");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 4;
            }

        }break;

        case R.id.button11:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "5");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 5;
            }else{
                txtOp.setText(txtOp.getText() + "5");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 5;
            }
        }break;

        case R.id.button12:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "6");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 6;
            }else{
                txtOp.setText(txtOp.getText() + "6");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 6;
            }
        }break;

        case R.id.button13:{
            if (txtOp.getText().length() != 0){
                String text = txtOp.getText().toString();
                if (text.charAt(text.length()-1) == '/' || text.charAt(text.length()-1) == '+' || text.charAt(text.length()-1) == '-'){

                    text = text.substring(0, text.length()-1);
                    txtOp.setText(text + "*");
                    txtOp.setSelection(txtOp.getText().length());
                }else {
                    txtOp.setText(txtOp.getText() + "*");
                    txtOp.setSelection(txtOp.getText().length());
                }
            }
            mostrar = "*";

            if (!mos2.isEmpty() && result != 0){
                num2 = Double.parseDouble(mos2);

                result = result * num2;
                txtRes.setText(String.valueOf(result));
                num1 = 0;
                num2 = 0;
                mos1 = "";
                mos2 = "";
            }

        }break;

        case R.id.button14:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "1");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 1;
            }else{
                txtOp.setText(txtOp.getText() + "1");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 1;
            }
        }break;

        case R.id.button15:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "2");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 2;
            }else{
                txtOp.setText(txtOp.getText() + "2");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 2;
            }
        }break;

        case R.id.button16:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "3");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 3;
            }else{
                txtOp.setText(txtOp.getText() + "3");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 3;
            }
        }break;

        case R.id.button17:{
            if (mostrar == "+"){
                if (result == 0) {
                    if (!mos1.isEmpty() && !mos2.isEmpty()) {
                        num1 = Double.parseDouble(mos1);
                        num2 = Double.parseDouble(mos2);

                        result = num1 + num2;
                        txtRes.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                        mos1 = "";
                        mos2 = "";
                    }
                }else{
                    if (!mos2.isEmpty()) {
                        num2 = Double.parseDouble(mos2);

                        result = result + num2;
                        txtRes.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                        mos1 = "";
                        mos2 = "";
                    }
                }
            }else if (mostrar == "-"){
                if (result == 0) {
                    if (!mos1.isEmpty() && !mos2.isEmpty()) {
                        num1 = Double.parseDouble(mos1);
                        num2 = Double.parseDouble(mos2);

                        result = num1 - num2;
                        txtRes.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                        mos1 = "";
                        mos2 = "";
                    }
                }else{
                    if (!mos2.isEmpty()) {
                        num2 = Double.parseDouble(mos2);

                        result = result - num2;
                        txtRes.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                        mos1 = "";
                        mos2 = "";
                    }
                }
            }else if (mostrar == "*"){
                if (result == 0) {
                    if (!mos1.isEmpty() && !mos2.isEmpty()) {
                        num1 = Double.parseDouble(mos1);
                        num2 = Double.parseDouble(mos2);

                        result = num1 * num2;
                        txtRes.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                        mos1 = "";
                        mos2 = "";
                    }
                }else{
                    if (!mos2.isEmpty()) {
                        num2 = Double.parseDouble(mos2);

                        result = result * num2;
                        txtRes.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                        mos1 = "";
                        mos2 = "";
                    }
                }
            }else if (mostrar == "/"){
                if (result == 0) {
                    if (!mos1.isEmpty() && !mos2.isEmpty()) {
                        num1 = Double.parseDouble(mos1);
                        num2 = Double.parseDouble(mos2);

                        result = num1 / num2;
                        txtRes.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                        mos1 = "";
                        mos2 = "";
                    }
                }else{
                    if (!mos2.isEmpty()) {
                        num2 = Double.parseDouble(mos2);

                        result = result / num2;
                        txtRes.setText(String.valueOf(result));
                        num1 = 0;
                        num2 = 0;
                        mos1 = "";
                        mos2 = "";
                    }
                }
            }
            txtOp.setText("");
        }break;

        case R.id.button18:{
            if (mostrar.isEmpty()) {
                txtOp.setText(txtOp.getText() + "0");
                txtOp.setSelection(txtOp.getText().length());

                mos1 = mos1 + 0;
            }else{
                txtOp.setText(txtOp.getText() + "0");
                txtOp.setSelection(txtOp.getText().length());

                mos2 = mos2 + 0;
            }

        }break;

        case R.id.button19:{
            txtOp.setText(txtOp.getText() + "(");
            txtOp.setSelection(txtOp.getText().length());

        }break;

        case R.id.button20:{
            txtOp.setText(txtOp.getText() + ")");
            txtOp.setSelection(txtOp.getText().length());

        }break;

        case R.id.button21:{
            if (mostrar.isEmpty()) {
                if (txtOp.getText().length() != 0) {
                    String text = txtOp.getText().toString();
                    if (text.charAt(text.length() - 1) != '*' && text.charAt(text.length() - 1) != '+' && text.charAt(text.length() - 1) != '-' && text.charAt(text.length() - 1) != '/' && text.charAt(text.length() - 1) != '(' && text.charAt(text.length() - 1) != ')'&& text.charAt(text.length() - 1) != '.') {
                        if (mos1.contains(".") == false){
                            txtOp.setText(txtOp.getText() + ".");
                            txtOp.setSelection(txtOp.getText().length());
                            mos1 = mos1 + ".";
                        }
                    }
                }
            }else{
                if (txtOp.getText().length() != 0) {
                    String text = txtOp.getText().toString();
                    if (text.charAt(text.length() - 1) != '*' && text.charAt(text.length() - 1) != '+' && text.charAt(text.length() - 1) != '-' && text.charAt(text.length() - 1) != '/' && text.charAt(text.length() - 1) != '(' && text.charAt(text.length() - 1) != ')'&& text.charAt(text.length() - 1) != '.') {
                        if (mos2.contains(".") == false) {
                            txtOp.setText(txtOp.getText() + ".");
                            txtOp.setSelection(txtOp.getText().length());
                            mos2 = mos2 + ".";
                        }
                    }
                }
            }
        }break;
        default:{

        }
    }

    }
    public String Escribe(double T) {
        NumberFormat L = new DecimalFormat("##.###");
        return L.format(T);
    }


}


