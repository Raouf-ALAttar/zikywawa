package com.raouf.linear;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task3 {
    public static final Logger LOGGER = LogManager.getLogger(Task3.class);

    public void execute() {
        LOGGER.info("task 3 has been started!");

        Scanner scan = new Scanner(System.in);
        Integer x = null;
        Integer y = null;
        while (x == null) {
            try {
                System.out.println("Enter number X");
                x = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }
        while (y == null){

            try {
                System.out.println("Enter number Y");
                y = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }
        int z = (2 * x) + (y - 2) * 5;
        System.out.println("Z = " + z);
    }
}
