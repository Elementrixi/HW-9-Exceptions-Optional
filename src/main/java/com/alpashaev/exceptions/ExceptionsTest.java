package main.java.com.alpashaev.exceptions;

import java.io.IOException;

public class ExceptionsTest {
    private static final boolean enableA = false;
    private static final boolean enableB = false;


    public ExceptionsTest() {
    }

    public static void exceptionA() {
        if (ExceptionsTest.enableA) {
            try {
                throw new ExceptionA();
            } catch (ExceptionA exceptionA) {
                System.out.println("Exception typo A caught ");
            }
        }
    }

    public static void exceptionB() {
        if (ExceptionsTest.enableB) {
            try {
                throw new ExceptionB();
            } catch (ExceptionB exceptionB) {
                System.out.println("Exception typo A caught ");
            }
        }
    }
    public static void nullPointerException(boolean enableA, boolean enableB){
        try {
            throw new NullPointerException();
        } catch (NullPointerException e){
            System.out.println("NullPointerException caught");
        }
    }
    public static void ioException(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
