/*Write an application that asks the user to enter two integers, obtains them from the user and displays the larger 
number followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal" */
import java.util.Scanner;

public class chap2_ex216 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //   Enter the first integer
        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();

        // Enter the second integer
        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();

        // Compare the two numbers
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is larger");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }

        input.close();
    }
}
