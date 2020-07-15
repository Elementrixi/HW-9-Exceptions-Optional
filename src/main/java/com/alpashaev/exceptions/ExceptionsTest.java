package main.java.com.alpashaev.exceptions;

import java.io.IOException;

public class ExceptionsTest {
    private static final boolean enableA = false;

    public static void exceptionsTest() {
        exceptionA();
        exceptionB(true);
        nullPointerException(enableA, false);
        ioException();
    }

    public static void exceptionA() {
        if (!ExceptionsTest.enableA) {
            try {
                throw new ExceptionA();
            } catch (ExceptionA exceptionA) {
                System.out.println("Exception type A caught ");
            }
        }
    }

    public static void exceptionB(boolean enableB) {
        if (enableB) {
            try {
                throw new ExceptionB();
            } catch (ExceptionB exceptionB) {
                System.out.println("Exception type B caught ");
            }
        }
    }

    public static void nullPointerException(boolean enableA, boolean enableB) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }

    public static void ioException() {
        try {
            throw new IOException();
        } catch (NullPointerException | IOException e) {
            System.out.println("IOException caught");
        }
    }
}
