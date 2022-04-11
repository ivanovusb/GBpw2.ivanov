package com.example.gbpw2ivanov;

public class Calculation {

    public int intResult;
    public double doubleResult;

    public Calculation(StringBuilder valOne, StringBuilder valTwo, String operation, boolean isDot) {

        if (!isDot) {
            switch (operation) {
                case ("+"):
                    intResult = Integer.parseInt(String.valueOf(valOne)) + Integer.parseInt(String.valueOf(valTwo));
                    break;

                case ("-"):
                    intResult = Integer.parseInt(String.valueOf(valOne)) - Integer.parseInt(String.valueOf(valTwo));
                    break;

                case ("÷"):
                    intResult = Integer.parseInt(String.valueOf(valOne)) / Integer.parseInt(String.valueOf(valTwo));
                    break;

                case ("*"):
                    intResult = Integer.parseInt(String.valueOf(valOne)) * Integer.parseInt(String.valueOf(valTwo));
                    break;
            }

            if (isDot) {
                switch (operation) {
                    case ("+"):
                        doubleResult = Double.parseDouble(String.valueOf(valOne)) + Double.parseDouble(String.valueOf(valTwo));
                        break;

                    case ("-"):
                        doubleResult = Double.parseDouble(String.valueOf(valOne)) - Double.parseDouble(String.valueOf(valTwo));
                        break;

                    case ("÷"):
                        doubleResult = Double.parseDouble(String.valueOf(valOne)) / Double.parseDouble(String.valueOf(valTwo));
                        break;

                    case ("*"):
                        doubleResult = Double.parseDouble(String.valueOf(valOne)) * Double.parseDouble(String.valueOf(valTwo));
                        break;
                }
            }
        }
    }
}
