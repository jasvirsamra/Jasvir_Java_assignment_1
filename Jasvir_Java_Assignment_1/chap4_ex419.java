/*A large company pays its salespeople on a commission basis. 
The salespeople receive $200 per week plus 9% of their gross sales for that week. 
For example, a salesperson who sells $5,000 worth of merchandise in a week receives
 $200 plus 9% of $5,000, or a total of $650. You’ve been supplied with a list of the 
 items sold by each salesperson. The values of these items are shown in Fig. 4.33. 
 Develop a Java application that inputs one salesperson’s items sold for last week and 
calculates and displays that salesperson’s earnings. 
There’s no limit to the number of items that can be sold. */

import java.util.Scanner;

public class chap4_ex419 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items sold: ");
        int items = input.nextInt();

        double totalSales = 0;
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter the price of item " + i + ": $");
            double price = input.nextDouble();
            totalSales += price;
        }

        double commission = calculate(totalSales);
        System.out.println("Salesperson's earnings: $" + commission);

        input.close();
    }

    public static double calculate(double totalSales) {
        double baseSalary = 200.0;
        double commissionRate = 0.09;
        return baseSalary + (commissionRate * totalSales);
    }
}
