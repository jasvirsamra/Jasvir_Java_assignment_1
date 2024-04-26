/*Write an application that inputs from the user the radius 
of a circle as an integer and prints the circle’s diameter, 
circumference and area using the floating-point value 3.14159 for π */

import java.util.Scanner;

public class chap2_ex228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();
        double factor = 3.14159;
        double diameter = 2 * radius;
        double circumference = 2 * factor * radius;
        double area = factor * radius * radius;

        System.out.println("Diameter of the circle: " + diameter);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        input.close();
    }
}