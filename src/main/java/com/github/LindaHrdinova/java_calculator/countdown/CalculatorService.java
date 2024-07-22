package com.github.LindaHrdinova.java_calculator.countdown;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    private int numberOne;
    private int numberTwo;
    private int numberResume;

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberResume() {
        return numberResume;
    }

    public void setNumberResume(int numberResume) {
        this.numberResume = numberResume;
    }
}