package com.epam;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type math (with gaps) :");
        String mathString = scanner.nextLine();
        scanner.close();

        double result = Calculator.calculate(mathString);
        System.out.println("\nResult: ");
        System.out.printf(mathString + " = %.3f", result);
    }

}
