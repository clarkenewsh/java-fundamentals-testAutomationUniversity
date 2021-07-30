package chapter3;

/*
 * Chapter 3a - If-else statement tutorial
 * IF ELSE
 * All sales people are expected to make 10 sales each week
 * For those who do they receive a congrats message
 * For those who dont they are informed how many sales short they were

 */

import java.util.Scanner;

public class quotaCalculator {

    public static void main(String[] args) {

        // Initialise known value
        int quota = 10;

        // Get the values we dont know
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        // Make a decision on the path to take - outout
        if(sales >= quota) {
            System.out.println("Congrats you have made your bonus quota this week");
        } else {
            int salesShort = quota - sales;
            System.out.println("Unfortunately you did not make your $250 bonus this week " + salesShort + " sales short");
        }
    }
}

