package com.raouf.statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task16 {
    public static final Logger LOGGER = LogManager.getLogger(Task16.class);
    public void execute () {
        LOGGER.info("task 16 has been started!");
        Scanner scan = new Scanner(System.in);
        Integer x = null;
        Integer y = null;
        while (x == null){
            try {
                System.out.println("Enter Value x:");
                x = scan.nextInt();
            }catch (Exception e){
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }
        while (y == null){
            try {
                System.out.println("Enter Value y:");
                y = scan.nextInt();
            }catch (Exception e){
                scan.nextLine();
                LOGGER.error(e.getMessage());
            }
        }
        double radians = 0;
        double hypotenuse = Math.sqrt(x) + Math.sqrt(y);
        radians = Math.cos(y) / Math.cos(hypotenuse);
        System.out.println(Math.toDegrees(radians));

    }
}
