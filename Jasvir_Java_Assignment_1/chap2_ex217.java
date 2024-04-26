/*Write an application that
 inputs three integers from the user and displays 
 the sum, average, product, smallest and largest of the numbers */
 import java.util.Scanner;

public class chap2_ex217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        // Calculate the sum, average, product, smallest, and largest
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        int product = num1 * num2 * num3;
        int smallest;
        if (num1 <= num2) {
            if (num1 <= num3) {
                smallest = num1;
            } else {
                smallest = num3;
            }
        } else {
            if (num2 <= num3) {
                smallest = num2;
            } else {
                smallest = num3;
            }
        }

        int largest;
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        };
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        input.close();
    }
}