package com.example.gbpw2ivanov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonComma;
    private Button buttonSeven, buttonEight, buttonNine, buttonZero, buttonClear, buttonBack;
    private Button buttonPercent, buttonDiv, buttonMulti, buttonMinus, buttonPlus, buttonEqual;
    private TextView monitor;
    private String stringValueOne = "";
    private int intValueOne;
    private String stringValueTwo = "";
    private int intValueTwo;
    private int intResult;
    private String stringResult;
    private String operation;

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
        buttonComma = findViewById(R.id.buttonComma);
        buttonClear = findViewById(R.id.buttonClear);
        buttonBack = findViewById(R.id.buttonBack);
        buttonPercent = findViewById(R.id.percent);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonEqual = findViewById(R.id.buttonEqual);
        monitor = findViewById(R.id.monitor);




        buttonOne.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonOne.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonOne.getText();
                monitor.setText(stringValueOne);
            }
        });


        buttonTwo.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonTwo.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonTwo.getText();
                monitor.setText(stringValueOne);
            }
        });

        buttonThree.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonThree.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonThree.getText();
                monitor.setText(stringValueOne);
            }
        });

        buttonFour.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonFour.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonFour.getText();
                monitor.setText(stringValueOne);
            }
        });

        buttonFive.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonFive.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonFive.getText();
                monitor.setText(stringValueOne);
            }
        });

        buttonSix.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonSix.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonSix.getText();
                monitor.setText(stringValueOne);
            }
        });

        buttonSeven.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonSeven.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonSeven.getText();
                monitor.setText(stringValueOne);
            }
        });

        buttonEight.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonEight.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonEight.getText();
                monitor.setText(stringValueOne);
            }
        });

        buttonNine.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonNine.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonNine.getText();
                monitor.setText(stringValueOne);
            }
        });

        buttonZero.setOnClickListener(view -> {
            if (intValueOne > 0) {
                stringValueTwo += (String) buttonZero.getText();
                monitor.setText(stringValueTwo);
            } else {
                stringValueOne += (String) buttonZero.getText();
                monitor.setText(stringValueOne);
            }
        });



        buttonPlus.setOnClickListener(view -> {
            intValueOne = Integer.parseInt(String.valueOf(monitor.getText()));
            monitor.setText(null);
            operation = "+";
        });

        buttonMinus.setOnClickListener(view -> {
            intValueOne = Integer.parseInt(String.valueOf(monitor.getText()));
            monitor.setText(null);
            operation = "-";
        });

        buttonDiv.setOnClickListener(view -> {
            intValueOne = Integer.parseInt(String.valueOf(monitor.getText()));
            monitor.setText(null);
            operation = "÷";
        });

        buttonMulti.setOnClickListener(view -> {
            intValueOne = Integer.parseInt(String.valueOf(monitor.getText()));
            monitor.setText(null);
            operation = "*";
        });

        buttonClear.setOnClickListener(view -> {
            monitor.setText(null);
            intValueOne = 0;
            intValueTwo = 0;
            stringValueOne = "";
            stringValueTwo = "";
        });


        buttonEqual.setOnClickListener(view -> {

            switch (operation) {
                case "+":
                    intValueTwo = Integer.parseInt(String.valueOf(monitor.getText()));
                    intResult = intValueOne + intValueTwo;
                    stringResult = String.valueOf(intResult);
                    monitor.setText(stringResult);
                    break;

                case "-":
                    intValueTwo = Integer.parseInt(String.valueOf(monitor.getText()));
                    intResult = intValueOne - intValueTwo;
                    stringResult = String.valueOf(intResult);
                    monitor.setText(stringResult);
                    break;

                case "÷":
                    intValueTwo = Integer.parseInt(String.valueOf(monitor.getText()));
                    intResult = intValueOne / intValueTwo;
                    stringResult = String.valueOf(intResult);
                    monitor.setText(stringResult);
                    break;

                case "*":
                    intValueTwo = Integer.parseInt(String.valueOf(monitor.getText()));
                    intResult = intValueOne * intValueTwo;
                    stringResult = String.valueOf(intResult);
                    monitor.setText(stringResult);
                    break;
            }

            intValueOne = 0;
            intValueTwo = 0;
            stringValueOne = "";
            stringValueTwo = "";
        });


    }
}