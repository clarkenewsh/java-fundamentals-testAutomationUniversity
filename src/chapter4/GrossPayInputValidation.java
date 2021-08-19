package chapter4;

import java.util.Scanner;

/*        WHILE LOOP:
        Each employee gets paid $15 hour. Write a program that allows the employee enter the number of hours worked per week.
        Do not allow overtime!
 */

public class GrossPayInputValidation {
    public static void main(String[] args) {
        // Initialise known variables
        int rate = 15;
        int maxHours = 40;

        // Get input from known variables
        System.out.println("How many hours did you work this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();


        // Validate user input
        while(hoursWorked > maxHours) {
            System.out.println("Invalid entry. Your hours must equal between 1 & 40");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        // Calculate gross pay
        double gross = rate * hoursWorked;
        System.out.println("Your gross pay was : " + gross);

    }
}


