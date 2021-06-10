package com.raouf.dynamic.task1;

import com.raouf.dynamic.task1.calculator.Calculator;
import com.raouf.dynamic.task1.factory.CalculatorFactory;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.Scanner;

public class Main {
    static {
        DOMConfigurator.configure("log4j.xml");
    }
    public static int getInt(String message) {
        Scanner scan = new Scanner(System.in);
        Integer number1 = null;
        while (number1 == null) {
            try {
                System.out.println(message);
                number1 = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Enter Only Numbers!");
            }
        }
        return number1;
    }
    
    public static void main(String[] args) {
        int num = getInt("Enter 1 For Standard Calculator or Enter 2 For Scientific Calculator: ");
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        Calculator calculator = calculatorFactory.getCalculator(num);
        int opId = 0;
        if (num == 1){
            opId = getInt("Enter Operation\n 1 for +\n 2 for -\n 3 for  *\n 4 for  /");
        }else if (num == 2){
            opId = getInt("Enter Operation\n 1 for odd\n 2 for even\n 3 for mod\n 4 for log") + 4;
        }
        
        if (calculator != null) {
            if (opId == 1) {
                double number1 = getInt("Enter Number One: ");
                double number2 = getInt("Enter Number Two: ");
                double res = calculator.add(number1, number2);
                System.out.println(res);
            } else if (opId == 2) {
                double number1 = getInt("Enter Number One: ");
                double number2 = getInt("Enter Number Two: ");
                double res = calculator.sub(number1, number2);
                System.out.println(res);
            } else if (opId == 3) {
                double number1 = getInt("Enter Number One: ");
                double number2 = getInt("Enter Number Two: ");
                double res = calculator.multi(number1, number2);
                System.out.println(res);
            } else if (opId == 4) {
                double number1 = getInt("Enter Number One: ");
                double number2 = getInt(" Enter Number Two: ");
                double res = calculator.div(number1, number2);
                System.out.println(res);
            } else if (opId == 5) {
                int number = getInt("Enter The Number: ");
                int res = calculator.odd(number);
                System.out.println(res);
            } else if (opId == 6) {
                int number = getInt("Enter The Number: ");
                int res = calculator.even(number);
                System.out.println(res);
            } else if (opId == 7) {
                int number1 = getInt("Enter Number One: ");
                int number2 = getInt("Enter Number Two: ");
                int res = calculator.mod(number1, number2);
                System.out.println(res);
            }else if (opId == 8) {
                int number = getInt("Enter The Number: ");
                int res = calculator.log(number);
                System.out.println(res);
            }
        }
    }
}
