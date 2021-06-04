package com.raouf.statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task31 {
    public static final Logger LOGGER = LogManager.getLogger(Task31.class);

    public void execute() {
        LOGGER.info("task 31 has been started!");
        Scanner scan = new Scanner(System.in);
        Integer a = null;
        Integer b = null;
        Integer x = null;
        Integer y = null;
        Integer z = null;
        while (a == null){
            try {
                System.out.println("Enter a: ");
                a = scan.nextInt();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!! ");
            }
        }
        while (b == null){
            try {
                System.out.println("Enter b: ");
                b = scan.nextInt();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!! ");
            }
        }
        while (x == null){
            try {
                System.out.println("Enter x: ");
                x = scan.nextInt();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!! ");
            }
        }
        while (y == null){
            try {
                System.out.println("Enter y: ");
                y = scan.nextInt();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!!");
            }
        }

        boolean result = false;
        double areaTriangle = 1/2. *x *y;
        double triangleHeight =(2 * areaTriangle)/x;
        double rectangleDiameter = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        if (triangleHeight < rectangleDiameter){
            result = true;
        }
        System.out.println("Result Is: " + result);
    }
}
