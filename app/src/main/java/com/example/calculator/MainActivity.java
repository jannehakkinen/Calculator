package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText resultView;
    EditText extraView;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_0;
    Button button_multiply;
    Button button_minus;
    Button button_remainder;
    Button button_divide;
    Button button_plus;
    Button button_equals;
    Button button_comma;
    Button button_c;
    private String number1;
    private String number2;
    private String result;
    private float iNumber1;
    private float iNumber2;
    private String calculation;
    private float fResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_0 = (Button)findViewById(R.id.button_0);
        button_1 = (Button)findViewById(R.id.button_1);
        button_2 = (Button)findViewById(R.id.button_2);
        button_3 = (Button)findViewById(R.id.button_3);
        button_4 = (Button)findViewById(R.id.button_4);
        button_5 = (Button)findViewById(R.id.button_5);
        button_6 = (Button)findViewById(R.id.button_6);
        button_7 = (Button)findViewById(R.id.button_7);
        button_8 = (Button)findViewById(R.id.button_8);
        button_9 = (Button)findViewById(R.id.button_9);
        button_multiply = (Button)findViewById(R.id.button_multiply);
        button_divide = (Button)findViewById(R.id.button_divide);
        button_minus = (Button)findViewById(R.id.button_minus);
        button_plus = (Button)findViewById(R.id.button_plus);
        button_remainder = (Button)findViewById(R.id.button_remainder);
        button_equals = (Button)findViewById(R.id.button_equals);
        button_comma = (Button)findViewById(R.id.button_comma);
        button_c = (Button)findViewById(R.id.button_C);
        number1 = "";
        number2 = "";
        result = "";
        fResult = 0;
        calculation = "";
        extraView = (EditText)findViewById(R.id.EditText_ExtraView);
        resultView = (EditText)findViewById(R.id.EditText_ResultView);

        button_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calculation.equals("+")) {
                    result = Float.toString(Float.parseFloat(number1)+Float.parseFloat(number2));
                    System.out.println("pluslasku");

                }else if (calculation.equals("-")) {

                    result = Float.toString(Float.parseFloat(number2)-Float.parseFloat(number1));
                    System.out.println(result);

                }
                else if (calculation.equals("X")) {
                    result = Float.toString(Float.parseFloat(number2)*Float.parseFloat(number1));

                }else if (calculation.equals("/")){
                    result = Float.toString(Float.parseFloat(number2)/Float.parseFloat(number1));
                System.out.println(fResult);
                } else if (calculation.equals("")){ //no calculation argument given
                    result = number1;
                } else {
                    result = "ERROR";
                }

                extraView.setText("");
                resultView.setText(result);
                calculation = "";
                number1 = "";
                number2 = "";
                iNumber1 = 0;
                iNumber2 = 0;

            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = number1;
                System.out.println(number2);
                extraView.setText(number2);
                resultView.setText("+");
                calculation = "+";
                number1 = "";

            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.equals("")) {
                    number1 = "-";

                }else{
                    number2 = number1;
                    extraView.setText(number2);
                    number1 = "";
                    calculation = "-";
                }
                resultView.setText("-");
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = number1;
                extraView.setText(number2);
                resultView.setText("X");
                number1 = "";
                calculation = "X";

            }
        });
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = number1;
                extraView.setText(number2);
                resultView.setText("/");
                number1 = "";
                calculation = "/";

            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "1";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "2";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "3";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "4";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "5";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "6";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "7";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "8";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "9";
                resultView.setText(calculation+number1);
                result = "";
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 += "0";
                resultView.setText(calculation+number1);
                result = "";
            }
        });


    }
}