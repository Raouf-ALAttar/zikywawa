package com.raouf.dynamic.task1.factory;

import com.raouf.dynamic.task1.calculator.Calculator;
import com.raouf.dynamic.task1.calculator.ScientificCalculator;
import com.raouf.dynamic.task1.calculator.StandardCalculator;

public class CalculatorFactory {
    public Calculator getCalculator(int numbers){

        if (numbers == 1 ){
            return new StandardCalculator();
        }else if (numbers == 2){
            return new ScientificCalculator();
        }
        return null;
    }

}
