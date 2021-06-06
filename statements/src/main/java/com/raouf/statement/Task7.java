package com.raouf.statement;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 extends Task {
    public static final Logger LOGGER = LogManager.getLogger(Task7.class);


    public void execute() {
        LOGGER.info("task 7 has been started!");

        Scanner scan = new Scanner(System.in);
        Integer a = null;
        Integer b = null;
        Integer c = null;
        Integer x = null;
        while (a == null) {
            try {
                System.out.println("Please Enter Number a: ");
                a = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println(" Please Enter Only Numbers: ");
            }
        }
        while (b == null) {
            try {
                System.out.println("Please Enter Number b:");
                b = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Please Enter Only Numbers: ");
            }
        }
        while (c == null) {
            try {
                System.out.println("Please Enter Number c:");
                c = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Please Enter Only Numbers: ");
            }
        }
        while (x == null) {
            try {
                System.out.println("Please Enter Number x:");
                x = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Please Enter Only Numbers: ");
            }
        }
        double z = a * Math.pow(x, 2) + b * x + c;
        System.out.println(" Result Is: " + z);


    }




}
