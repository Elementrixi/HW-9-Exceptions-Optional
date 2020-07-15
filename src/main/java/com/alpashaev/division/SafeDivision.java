package main.java.com.alpashaev.division;

import java.util.Scanner;

public class SafeDivision {

    public static void safeDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Please enter 2 integers. DoubleA and doubleB ");
        double doubleA = scanner.nextDouble();
        double doubleB = scanner.nextDouble();
        double result = doubleA / doubleB;

        try {
            System.out.println(result);
            if (doubleB == 0) {
                throw new ArithmeticException("Exception");
            }
        } catch (ArithmeticException e) {
            System.out.println("Result is infinity. Please enter number doubleB bigger than 0 or it's end of the task");
            doubleB = scanner.nextDouble();
            double newResult = doubleA / doubleB;
            System.out.println(newResult);
        }
    }
}
