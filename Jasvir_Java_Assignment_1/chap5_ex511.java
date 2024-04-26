/*Write an application that finds the smallest of several integers.
 Assume that the first value read specifies the number of values to input from the user. */

import java.util.Scanner;

public class chap5_ex511 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers to compare: ");
        int count = input.nextInt();
        int smallest = 0;
        switch (count) {
            case 0:
                System.out.println("Invalid input. Please enter a valid positive number.");
                break;
            default:
                System.out.print("Enter the first integer: ");
                smallest = input.nextInt();
                for (int i = 1; i < count; i++) {
                    System.out.print("Enter the next integer: ");
                    int num = input.nextInt();
                    if (num < smallest) {
                        smallest = num;
                    }
                }
                System.out.println("The smallest integer entered is: " + smallest);
                break;
        }

        input.close();
    }
}
