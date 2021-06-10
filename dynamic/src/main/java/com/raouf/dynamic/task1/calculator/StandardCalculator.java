package com.raouf.dynamic.task1.calculator;

import java.util.Scanner;

public class StandardCalculator extends Calculator {
    int res;

    public Double add(double number1, double number2) {
        return number1 + number2;
    }

    public Double sub(double number1, double number2) {
        return number1 - number2;
    }

    public Double multi(double number1, double number2) {
        return number1 * number2;
    }

    public Double div(double number1, double number2) {
        if (number2 == 0) {
            number2 = 1;
        }
        return number1 / number2;
    }
}
