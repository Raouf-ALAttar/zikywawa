package com.raouf.statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import sun.util.resources.cldr.CalendarData;

import java.text.SimpleDateFormat;
import java.util.*;

public class Task23 {
    public static final Logger LOGGER = LogManager.getLogger(Task23.class);
    public void execute(){
        LOGGER.info("task 23 has been started!");
        Scanner scan = new Scanner(System.in);
        Integer day = null;
        Integer month = null;
        while (day == null){
            try {
                System.out.println(" Please Enter Day: ");
                day = scan.nextInt();
            }catch (InputMismatchException e){
                scan.nextLine();
                System.out.println("Just Enter Numbers!!! ");
            }
        }
        while (month == null) {
            try {
                System.out.println("Please Enter Month: ");
                month = scan.nextInt();
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Just Enter Numbers!!!");
            }

        }
        String numberOfMonths30Days = "4,6,9,11";
        boolean res = false;
        if (month <= 12 && month >0 && day <= 31 && day > 0){
            if (month == 2 && day >28){
                res = false;
            }else if (numberOfMonths30Days.contains(month+"") && day > 30){
                res = false;
            }else {
                res = true;
            }
        }
        System.out.println(res);
    }
}
