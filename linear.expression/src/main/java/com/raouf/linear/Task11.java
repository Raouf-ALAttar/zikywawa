package com.raouf.linear;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task11 {
    public static final Logger LOGGER = LogManager.getLogger(Task11.class);

    public void execute() {
        LOGGER.info("task 11 has been started!");

        Scanner scan = new Scanner(System.in);
        Integer a = null;
        Integer b = null;
        while (a == null) {

            try {
                System.out.println("A");
                a = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }
        while (b == null) {
            try {
                System.out.println("B");
                b = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }


        int c = a^2 + b^2;
        int area = (a *b)/2;
        int perimeter = a + b +c;
        System.out.println("perimeter =" + perimeter);
        System.out.println("area =" + area);
    }
}


