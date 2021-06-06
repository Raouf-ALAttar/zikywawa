package com.raouf.statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task16 extends Task {
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
                System.out.println("Enter Only Numbers!");
            }
        }
        while (y == null){
            try {
                System.out.println("Enter Value y:");
                y = scan.nextInt();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Enter Only Numbers!");
            }
        }
        double radians = 0;
        double hypotenuse = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        radians = Math.acos(x /hypotenuse);
        System.out.println("radians: " + Math.toDegrees(radians));

    }

}
