package com.raouf.statement;

import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    static {
        DOMConfigurator.configure("log4j.xml");
    }
    public static void main(String[] args) {
        Task7 task7 = new Task7();
        Task16 task16 = new Task16();
        Task23 task23 = new Task23();
        Task31 task31 = new Task31();
        task31.execute();
//        double radians = Math.acos(0.6);
//        System.out.println(Math.toDegrees(0.99987));
    }
}
