package com.raouf.linear;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task19 {
    public static final Logger LOGGER = LogManager.getLogger(Task19.class);
    public void execute() {
        LOGGER.info("Task 19 has been started!");

        Scanner scan = new Scanner(System.in);
        Integer a = null;
        while (a == null) {
            try {
                System.out.println("a");
                a = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }

        double area = a *Math.sqrt(3)/4;
        double height = (a * Math.sqrt(3)/2);
        double radius =  (a/2. * Math.sqrt(3));
        System.out.println("area = " + area);
        System.out.println("height = "+ height);
        System.out.println("radius = "+ radius);
    }
}
