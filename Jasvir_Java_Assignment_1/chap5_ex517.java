/*An online retailer sells five products whose retail prices are as follows:
 Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and
  product 5, $6.87. Write an application that reads a series of pairs of numbers as follows:
product number
quantity sold 
Your program should use a switch statement to determine the retail price for each product.
 It should calculate and display the total retail value of all products sold. 
Use a sentinel-controlled loop to determine when the program should stop looping and display the final results. */

import java.util.Scanner;

public class chap5_ex517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalValue = 0.0;
        int productNumber;

        do {
        System.out.print("Enter product number and find total value (1-5, or 0 to exit): ");
        productNumber = input.nextInt();

        switch (productNumber) {
                case 0:
                    break; 
                case 1:
                    totalValue += 2.98;
                    break;
                case 2:
                    totalValue += 4.50;
                    break;
                case 3:
                    totalValue += 9.98;
                    break;
                case 4:
                    totalValue += 4.49;
                    break;
                case 5:
                    totalValue += 6.87;
                    break;
                default:
                    System.out.println("Invalid product number. Please enter a number between 1 and 5.");
                    break;
            }
        } 
        while (productNumber != 0);
     System.out.println("Total retail value of products sold: $" + totalValue);
     input.close();
    }
}


