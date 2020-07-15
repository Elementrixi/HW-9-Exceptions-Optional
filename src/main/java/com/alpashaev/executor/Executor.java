package main.java.com.alpashaev.executor;

import main.java.com.alpashaev.division.SafeDivision;
import main.java.com.alpashaev.exceptions.ExceptionsTest;
import main.java.com.alpashaev.rethrowing.RethrowingException;

public class Executor {
    public static void start() {
        ExceptionsTest.exceptionsTest();
        SafeDivision.safeDivision();
        RethrowingException.someMethod();
    }
}
