package com.raouf.dynamic.task1.calculator;

public class ScientificCalculator extends Calculator {

    public Integer odd(int number) {
        int res =0;
        for (int x=0; x <= number; x++) {
            if (x % 2 == 0){
                res++;
            }
        }
        return res;

    }
    public Integer even(int number){
        int res =0;
        for (int i=0 ;i <= number ; i++){
            if (i % 2 == 0){
                res++;
            }
        }
        return res;
    }
    public Integer mod(int number1 , int number2){
        return number1 % number2;
    }
    public int log (int number){
        return(int) Math.log10(number)+1;
    }
}
