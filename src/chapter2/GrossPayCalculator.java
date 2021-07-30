package chapter2;

import java.util.Scanner;

/**
 * Program to calculate gross pay - Java Programming Chapter 2
 */

public class GrossPayCalculator {

    public static void main(String[] args) {

        //  1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee works");
        // Scanner enables user input int he terminal
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // 2. Get the hourly pay rate
        System.out.println("Enter the employee payrate");
        double rate = scanner.nextDouble();
        scanner.close();

        // 3. Multiply hours and pay rate
        double grossPay = hours * rate;

        // 4. Display result
        System.out.println("The employees gross pay is $" + grossPay);




    }

}
