/*Write a program that inputs five numbers and determines and 
prints the number of negative numbers input, the number of positive
 numbers input and the number of zeros input. */

import java.util.Scanner;

public class chap2_ex232 {
public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);

        input.close();
    }
}
