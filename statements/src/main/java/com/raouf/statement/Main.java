package com.raouf.statement;

import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    static {
        DOMConfigurator.configure("log4j.xml");
    }
    public static void main(String[] args) {
        Task7 task7 = new Task7();
//        task7.execute();
        double radians = Math.acos(0.6);
        System.out.println(Math.toDegrees(0.99987));
    }
}
