package com.github.LindaHrdinova.java_calculator.countdown;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private double numberOne;
    private double numberTwo;
    private double numberResult;
    private char calcOperator;

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double getNumberResult() {
        return numberResult;
    }

    public void setNumberResult(double numberResult) {
        this.numberResult = numberResult;
    }

    public char getCalcOperator() {
        return calcOperator;
    }

    public void setCalcOperator(char calcOperator) {
        this.calcOperator = calcOperator;
    }

    public double calculatorOperation(double a, double b, char operation) {
        double result = 0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*': //&times
                result = a * b;
                break;
            case '/':
                result = ((a * 100) / b) / 100;
                break;
            case '^':
                result = Math.pow(a, b); // Math.pow je fce pro exponent
            break;
            default:
                System.err.println("Neznámý operátor");
                break;
        }
        return result;
    }
}