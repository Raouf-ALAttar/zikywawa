package com.raouf.statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.pow;

public class Task31 {
    public static final Logger LOGGER = LogManager.getLogger(Task31.class);

    public void execute() {
        LOGGER.info("task 31 has been started!");
        Scanner scan = new Scanner(System.in);
        Double a = null;
        Double b = null;
        Double x = null;
        Double y = null;
        Double z = null;
        while (a == null){
            try {
                System.out.println("Enter a: ");
                a = scan.nextDouble();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!! ");
            }
        }
        while (b == null){
            try {
                System.out.println("Enter b: ");
                b = scan.nextDouble();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!! ");
            }
        }
        while (x == null){
            try {
                System.out.println("Enter x: ");
                x = scan.nextDouble();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!! ");
            }
        }
        while (y == null){
            try {
                System.out.println("Enter y: ");
                y = scan.nextDouble();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!!");
            }
        }
        while (z == null){
            try {
                System.out.println("Enter z: ");
                z = scan.nextDouble();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Only Numbers!!!");
            }
        }

        boolean result = false;

        double halfPerimeter = (x + y + z) /2.;
        double x1 = Math.abs(halfPerimeter - x);
        double y1 = Math.abs(halfPerimeter - y);
        double z1 = Math.abs(halfPerimeter - z);
        System.out.println(x1 + " " + y1 + " " + z1);
        double temp = x1;
        if (y1 > temp){
            temp = y1;
        }
        if(z1 > temp){
            temp = z1;
        }
        double areaTriangle =Math.sqrt (Math.abs(halfPerimeter * x1 * y1 * z1));
        double triangleHeight =(2 * areaTriangle)/temp;
        double rectangleDiameter = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        if (triangleHeight <= rectangleDiameter){
            result = true;
        }
        System.out.println("halfPerimeter: " + halfPerimeter);
        System.out.println("areaTriangle: " + areaTriangle);
        System.out.println("triangleHeight: " + triangleHeight);
        System.out.println("rectangleDiameter: " + rectangleDiameter);
        System.out.println("Result Is: " +result );
    }
}
