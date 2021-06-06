package com.raouf.statement;

import org.apache.log4j.xml.DOMConfigurator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static {
        DOMConfigurator.configure("log4j.xml");
    }
    public static void main(String[] args){
        /*
        Task7 task7 = new Task7();
        Task16 task16 = new Task16();
        Task23 task23 = new Task23();
        Task31 task31 = new Task31();
        Task39 task39 = new Task39();
        task39.execute();
//        double radians = Math.acos(0.6);
//        System.out.println(Math.toDegrees(0.99987));
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number Task: ");
        int number = scan.nextInt();
        FactoryTask factoryTask = new FactoryTask();
        Task task = factoryTask.getTask(number);
        if (task != null){
            task.execute();
        }

    }
}
