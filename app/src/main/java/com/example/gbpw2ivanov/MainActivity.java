package com.example.gbpw2ivanov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonDot;
    private Button buttonSeven, buttonEight, buttonNine, buttonZero, buttonClear, buttonBack;
    private Button buttonPercent, buttonDiv, buttonMulti, buttonMinus, buttonPlus, buttonEqual;
    private TextView monitor, monitor_2;
    private int intValueOne;
    private int intValueTwo;
    private double doubleValueOne;
    private double doubleValueTwo;
    private int intResult;
    private double doubleResult;
    private String operation;
    private boolean isComma = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonZero = findViewById(R.id.buttonZero);
        buttonDot = findViewById(R.id.buttonDot);
        buttonClear = findViewById(R.id.buttonClear);
        buttonBack = findViewById(R.id.buttonBack);
        buttonPercent = findViewById(R.id.percent);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonEqual = findViewById(R.id.buttonEqual);
        monitor = findViewById(R.id.monitor);
        monitor_2 = findViewById(R.id.monitor_2);


        buttonOne.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonOne.getText());
        });


        buttonTwo.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonTwo.getText());
        });

        buttonThree.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonThree.getText());
        });

        buttonFour.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonFour.getText());
        });

        buttonFive.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonFive.getText());
        });

        buttonSix.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonSix.getText());
        });

        buttonSeven.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonSeven.getText());
        });

        buttonEight.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonEight.getText());
        });

        buttonNine.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonNine.getText());
        });

        buttonZero.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonZero.getText());
        });

        buttonPlus.setOnClickListener(view -> {
//            if (isComma) {
//                monitor.append(monitor_2.getText() + "+");
//                doubleValueOne = Double.parseDouble(String.valueOf(monitor_2.getText()));
//                monitor_2.setText(null);
//                operation = "+";
//            } else {
                monitor.append(monitor_2.getText() + "+");
                intValueOne = Integer.parseInt(String.valueOf(monitor_2.getText()));
                monitor_2.setText(null);
                operation = "+";
//            }
        });

        buttonMinus.setOnClickListener(view -> {
//            if (isComma) {
//                monitor.append(monitor_2.getText() + "-");
//                doubleValueOne = Double.parseDouble(String.valueOf(monitor_2.getText()));
//                monitor_2.setText(null);
//                operation = "-";
//            } else {
                monitor.append(monitor_2.getText() + "-");
                intValueOne = Integer.parseInt(String.valueOf(monitor_2.getText()));
                monitor_2.setText(null);
                operation = "-";
//            }
        });

        buttonDiv.setOnClickListener(view -> {
//            if (isComma) {
//                monitor.append(monitor_2.getText() + "÷");
//                doubleValueOne = Double.parseDouble(String.valueOf(monitor_2.getText()));
//                monitor_2.setText(null);
//                operation = "÷";
//            } else {
                monitor.append(monitor_2.getText() + "÷");
                intValueOne = Integer.parseInt(String.valueOf(monitor_2.getText()));
                monitor_2.setText(null);
                operation = "÷";
//            }
        });

        buttonMulti.setOnClickListener(view -> {
//            if (isComma) {
//                monitor.append(monitor_2.getText() + "*");
//                doubleValueOne = Double.parseDouble(String.valueOf(monitor_2.getText()));
//                monitor_2.setText(null);
//                operation = "*";
//            } else {
                monitor.append(monitor_2.getText() + "*");
                intValueOne = Integer.parseInt(String.valueOf(monitor_2.getText()));
                monitor_2.setText(null);
                operation = "*";
//            }
        });

        buttonClear.setOnClickListener(view -> {
            monitor_2.setText(null);
            monitor.setText(null);
            intValueOne = 0;
            intValueTwo = 0;
        });

        buttonBack.setOnClickListener(view -> {
            StringBuilder st = new StringBuilder(monitor_2.getText());
            st.deleteCharAt(st.length() - 1);
            monitor_2.setText(st.toString());
        });

        buttonDot.setOnClickListener(view -> {
            if (operation == "=") {
                monitor_2.setText(null);
                monitor.setText(null);
                operation = "";
            }
            monitor_2.append(buttonDot.getText());
            isComma = true;
        });


        buttonEqual.setOnClickListener(view -> {
//            if (isComma) {
//                switch (operation) {
//                    case "+":
//                        doubleValueTwo = Double.parseDouble(String.valueOf(monitor_2.getText()));
//                        doubleResult = doubleValueOne + doubleValueTwo;
//                        monitor_2.setText(String.valueOf(doubleResult));
//                        monitor.setText(monitor.getText() + String.valueOf(doubleValueTwo) + "=");
//                        break;
//
//                    case "-":
//                        doubleValueTwo = Double.parseDouble(String.valueOf(monitor_2.getText()));
//                        doubleResult = doubleValueOne - doubleValueTwo;
//                        monitor_2.setText(String.valueOf(doubleResult));
//                        monitor.setText(monitor.getText() + String.valueOf(doubleValueTwo) + "=");
//                        break;
//
//                    case "÷":
//                        doubleValueTwo = Double.parseDouble(String.valueOf(monitor_2.getText()));
//                        doubleResult = doubleValueOne / doubleValueTwo;
//                        monitor_2.setText(String.valueOf(doubleResult));
//                        monitor.setText(monitor.getText() + String.valueOf(doubleValueTwo) + "=");
//
//                    case "*":
//                        doubleValueTwo = Double.parseDouble(String.valueOf(monitor_2.getText()));
//                        doubleResult = doubleValueOne * doubleValueTwo;
//                        monitor_2.setText(String.valueOf(doubleResult));
//                        monitor.setText(monitor.getText() + String.valueOf(doubleValueTwo) + "=");
//                }
//
//            } else {
                switch (operation) {
                    case "+":
                        intValueTwo = Integer.parseInt(String.valueOf(monitor_2.getText()));
                        intResult = intValueOne + intValueTwo;
                        monitor_2.setText(String.valueOf(intResult));
                        monitor.setText(monitor.getText() + String.valueOf(intValueTwo) + "=");
                        break;

                    case "-":
                        intValueTwo = Integer.parseInt(String.valueOf(monitor_2.getText()));
                        intResult = intValueOne - intValueTwo;
                        monitor_2.setText(String.valueOf(intResult));
                        monitor.setText(monitor.getText() + String.valueOf(intValueTwo) + "=");
                        break;

                    case "÷":
                        intValueTwo = Integer.parseInt(String.valueOf(monitor_2.getText()));
                        intResult = intValueOne / intValueTwo;
                        monitor_2.setText(String.valueOf(intResult));
                        monitor.setText(monitor.getText() + String.valueOf(intValueTwo) + "=");
                        break;

                    case "*":
                        intValueTwo = Integer.parseInt(String.valueOf(monitor_2.getText()));
                        intResult = intValueOne * intValueTwo;
                        monitor_2.setText(String.valueOf(intResult));
                        monitor.setText(monitor.getText() + String.valueOf(intValueTwo) + "=");
                        break;
                }
//            }

            operation = "=";
            isComma = false;

            intValueOne = 0;
            intValueTwo = 0;
            doubleValueOne = 0;
            doubleValueTwo = 0;
        });



    }

}