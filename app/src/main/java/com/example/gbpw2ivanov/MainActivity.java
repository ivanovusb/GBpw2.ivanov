package com.example.gbpw2ivanov;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button buttonClear;
    private Button buttonBack;
    private Button buttonDiv;
    private Button buttonMulti;
    private Button buttonMinus;
    private Button buttonPlus;
    private Button buttonEqual;
    private Button buttonPercent;
    private Button buttonDot;
    private Button[] digits;
    private TextView monitor, monitor2;
    private StringBuilder valueOne, valueTwo, buffer;
    private String operation = "";
    private boolean isDot = false;
    private Calculation calculation;
    public static final String MONITOR = "monitor";
    public static final String MONITOR_2 = "monitor_2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initialize();
        signsType();
        digitsType();

        if (savedInstanceState != null) {
            monitor.setText(savedInstanceState.getString(MONITOR));
            monitor2.setText(savedInstanceState.getString(MONITOR_2));
        }
    }

    private void digitsType() {
        for (int i = 0; i < digits.length; i++) {
            int lastI = i;
            digits[i].setOnClickListener(view -> {
                buffer.append(digits[lastI].getText().toString());
                monitor2.append(digits[lastI].getText().toString());
            });
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(MONITOR, String.valueOf(monitor.getText()));
        outState.putString(MONITOR_2, String.valueOf(monitor2.getText()));
    }

    private void signsType() {


        buttonClear.setOnClickListener(view -> {
            monitor.setText(null);
            monitor2.setText(null);
            valueOne.delete(0, valueOne.length());
            valueTwo.delete(0, valueTwo.length());
            buffer.delete(0, buffer.length());
        });

        buttonBack.setOnClickListener(view -> {
            valueOne.deleteCharAt(valueOne.length() - 1);
            monitor2.setText(valueOne);
        });

//        buttonPercent.setOnClickListener(view -> {
//
//        });

        buttonDiv.setOnClickListener(view -> {
            valueOne.append(buffer);
            monitor.append(valueOne + "÷");
            buffer.delete(0, buffer.length());
            monitor2.setText(null);
            operation = "÷";
        });

        buttonMulti.setOnClickListener(view -> {
            valueOne.append(buffer);
            monitor.append(valueOne + "*");
            buffer.delete(0, buffer.length());
            monitor2.setText(null);
            operation = "*";
        });

        buttonMinus.setOnClickListener(view -> {
            valueOne.append(buffer);
            monitor.append(valueOne + "-");
            buffer.delete(0, buffer.length());
            monitor2.setText(null);
            operation = "-";
        });

        buttonPlus.setOnClickListener(view -> {
            valueOne.append(buffer);
            monitor.append(valueOne + "+");
            buffer.delete(0, buffer.length());
            monitor2.setText(null);
            operation = "+";
        });

        buttonEqual.setOnClickListener(view -> {
            valueTwo.append(monitor2.getText());
            calculation = new Calculation(valueOne, valueTwo, operation, isDot);
            monitor.append(valueTwo + "=");
            if (!isDot) {
                monitor2.setText(String.valueOf(calculation.getIntResult()));
            }
            if (isDot) {
                monitor2.setText(String.valueOf(calculation.getDoubleResult()));
            }
        });

        buttonDot.setOnClickListener(view -> {
            isDot = true;
            buffer.append(buttonDot.getText());
            monitor2.append(buttonDot.getText());
        });
    }

    public void initialize() {
        digits = new Button[10];
        valueOne = new StringBuilder();
        valueTwo = new StringBuilder();
        buffer = new StringBuilder();

        digits[0] = findViewById(R.id.button_zero);
        digits[1] = findViewById(R.id.button_one);
        digits[2] = findViewById(R.id.button_two);
        digits[3] = findViewById(R.id.button_three);
        digits[4] = findViewById(R.id.button_four);
        digits[5] = findViewById(R.id.button_five);
        digits[6] = findViewById(R.id.button_six);
        digits[7] = findViewById(R.id.button_seven);
        digits[8] = findViewById(R.id.button_eight);
        digits[9] = findViewById(R.id.button_nine);

        buttonDot = findViewById(R.id.button_dot);
        buttonClear = findViewById(R.id.button_clear);
        buttonBack = findViewById(R.id.button_back);
        buttonPercent = findViewById(R.id.percent);
        buttonDiv = findViewById(R.id.button_div);
        buttonMulti = findViewById(R.id.button_multi);
        buttonMinus = findViewById(R.id.button_minus);
        buttonPlus = findViewById(R.id.button_plus);
        buttonEqual = findViewById(R.id.button_equal);
        monitor = findViewById(R.id.monitor);
        monitor2 = findViewById(R.id.monitor_2);

    }
}