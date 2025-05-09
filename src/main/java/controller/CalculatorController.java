package controller;

import javafx.fxml.FXML;

public class CalculatorController {

    @FXML
    private double firstNumber = 0;

    @FXML
    private double secondNumber = 0;

    @FXML
    private String operator;



    // Example method to perform addition
    public double add(double a, double b) {
        return a + b;
    }

    // Example method to perform subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Example method to perform multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Example method to perform division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

}
