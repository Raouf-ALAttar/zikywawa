package com.raouf.statement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task23 {
    public static final Logger LOGGER = LogManager.getLogger(Task23.class);

    public void execute() {
        LOGGER.info("task 23 has been started!");
        Scanner scan = new Scanner(System.in);
        Integer day = null;
        Integer month = null;
        while (day == null) {
            try {
                System.out.println(" Please Enter Day: ");
                day = scan.nextInt();
            } catch (InputMismatchException e) {
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

//            GregorianCalendar gc = new GregorianCalendar(day,month);

            switch (month) {
                case 1:
                    System.out.println("January " + day);
                    break;
                case 2:
                    System.out.println("February" + day);
                    break;
                case 3:
                    System.out.println("March " + day);
                    break;
                case 4:
                    System.out.println("April " + " 30 days");
                    break;
                case 5:
                    System.out.println("May " + " 31 days");
                    break;
                case 6:
                    System.out.println("June " + " 30 days");
                    break;
                case 7:
                    System.out.println("July " + "31 days");
                    break;
                case 8:
                    System.out.println("August " + "31 days");
                    break;
                case 9:
                    System.out.println("September " + "30 days");
                    break;
                case 10:
                    System.out.println("October " + "31 days");
                    break;
                case 11:
                    System.out.println("November " + "30 days");
                    break;
                case 12:
                    System.out.println("December " + "31 days");
                    break;

            }
        }
    }
}
