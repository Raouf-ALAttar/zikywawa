package com.raouf.linear;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {
    static {
        DOMConfigurator.configure("log4j.xml");
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task11 task11 = new Task11();
        Task19 task19 = new Task19();
        Task27 task27 = new Task27();
        Task35 task35 = new Task35();
        task3.execute();

    }
}
