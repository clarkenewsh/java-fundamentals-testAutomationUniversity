package chapter3;

import java.util.Scanner;

/*
 Chapter 3a - Salary Calculator using if statement
    IF Statement
    All sales people get a payment of $1000 per week
    Salespeople who exceed 10 sales get a bonus of $250
 */
public class SalaryCalculator {

    public static void main(String[] args) {

        // Initialise known values
        int salary = 1000;
        int bonus = 250;
        int salesTarget = 10;

        // Get values for the unknown
        System.out.println("How many sales did the employee make this month");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for bonus earners
        if(sales > salesTarget) {
            salary = salary + bonus;
        }

        //output
        System.out.println("The employees pay is $" + salary);
    }
}
