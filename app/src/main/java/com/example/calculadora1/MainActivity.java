package com.example.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1, num2;
    Button btnSoma, btnSub, btnMult, btnDiv;

    int n1, n2, soma, sub, div, mult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.resultado);
        num1 =  (EditText) findViewById(R.id.num1);
        num2 =  (EditText)findViewById(R.id.num2);
        btnSoma = findViewById(R.id.btnSoma);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMult = findViewById(R.id.btnMult);
    }

    public void Soma (View g){

        String n1string = num1.getText().toString();
        String n2string = num2.getText().toString();

        if(n1string.isEmpty() || n2string.isEmpty()){
            result.setText(" Informe o numero");
        }
        else {

            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());

            if (n1 != 0 && n2 != 0) {
                soma = n1 + n2;
                result.setText(Integer.toString(soma));
            } else {
                result.setText(" 0 + Qualquer numero é ele mesmo ");
            }

        }

    }

    public void Sub (View V) {

        String n1string = num1.getText().toString();
        String n2string = num2.getText().toString();

        if (n1string.isEmpty() || n2string.isEmpty()) {
            result.setText(" Informe o numero");
        } else {


            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());

            if (n1 != 0 && n2 != 0) {
                sub = n1 - n2;
                result.setText(Integer.toString(sub));
            } else {
                result.setText(" 0 - Qualquer numero é ele mesmo ");
            }

        }
    }
        public void Mult (View m){

            String n1string = num1.getText().toString();
            String n2string = num2.getText().toString();

            if(n1string.isEmpty() || n2string.isEmpty()){
                result.setText("Informe o numero");
            }
            else {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                if (n1 != 0 && n2 != 0) {
                    mult = n1 * n2;
                    result.setText(Integer.toString(mult));
                } else {
                    result.setText(" Todo numero multiplicado por 0 é 0! ");
                }
            }
        }


        public void Div (View d){

            String n1string = num1.getText().toString();
            String n2string = num2.getText().toString();

            if(n1string.isEmpty() || n2string.isEmpty()){
                result.setText("Informe o numero");
            }
            else {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                if (n1 != 0 && n2 != 0) {
                    div = n1 / n2;
                    result.setText(Integer.toString(div));
                } else {
                    result.setText("Não é possivel dividir por 0! ");
                }
            }

        }


    }


