package com.raouf.linear;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task27 {
    public static final Logger LOGGER = LogManager.getLogger(Task27.class);
    public void execute() {
        LOGGER.info("task 27 has been is started!");

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
        int ap8 = (a*a*a)*(a*a*a)*(a*a);
        int ap10 = (a*a*a)*(a*a*a)*(a*a)*(a*a);

        System.out.println("aP8 = " + ap8);
        System.out.println("aP10 = " + ap10);
    }
}
