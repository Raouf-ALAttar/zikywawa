package com.raouf.linear;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task35 {
    public static final Logger LOGGER = LogManager.getLogger(Task35.class);

    public void execute() {
        LOGGER.info("Task 35 has been started!");
        Scanner scan = new Scanner(System.in);

        Double m = null;
        Double n = null;
        while (m == null) {
            try {
                System.out.println("m");
                m = scan.nextDouble();
            } catch (Exception e) {
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }
        while (n == null) {
            try {
                System.out.println("n");
                n = scan.nextDouble();
            } catch (Exception e) {
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }
        double div = m/n;
        double minimum = (div % 10);
        double maximum = (div %10) * 10;

        System.out.println("Result = " + div);
        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);

    }
}
