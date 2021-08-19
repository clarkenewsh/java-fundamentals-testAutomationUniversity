package chapter3;

/*
 * Chapter 3b - nested if statements
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String[] args) {

        // Initialise values we know
        int requiredSalary = 30000;
        int requiredYearsEmployee = 2;


        // Values we do not know
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        Double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        Double years = scanner.nextDouble();
        scanner.close();

        // Decision statement
        if(salary >= requiredSalary && years >= requiredYearsEmployee) {
                System.out.println("You have met the requirements for the loan");
        }
        else {
            System.out.println("Sorry you must earn at least $ "
                    + requiredSalary + " to qualify for the loan.");
        }
    }
}
