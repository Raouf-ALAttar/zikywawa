package com.raouf.statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task39 {
    public static final Logger LOGGER = LogManager.getLogger(Task39.class);
    public void execute(){
        LOGGER.info("Task 39 Has Been Started!");
        Scanner scan = new Scanner(System.in);
        Integer x = null;
        while (x == null){
            try {
                System.out.println("Enter x: ");
                x = scan.nextInt();
            }catch (Exception e){
                scan.nextLine();
                System.out.println("Enter Only Number!!");
            }
        }
        double res = 0;
        if (x >= 8){
            System.out.println("result is: " + (-Math.pow(x,2)- (x-9)));
        }else {
            System.out.println("result is: " + (1/Math.pow(x,4)- 6));
        }
    }

}
