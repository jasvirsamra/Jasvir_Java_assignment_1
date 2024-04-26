/*Write an application that reads an integer and determines and prints whether it’s odd or even */

import java.util.Scanner;

public class chap2_ex225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        input.close();
    }
}