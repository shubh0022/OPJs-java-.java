// Import the Scanner class from the java.util package to read user input.
import java.util.Scanner;
// Main class that contains the program's entry point.
public class Main {
public static void main(String[] args){
// Print a message to the console.
System.out.println("yadav.shubham.j");
// Create a Scanner object to read user input.
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter coefficients a, b, and c for a quadratic equation.
System.out.print("Enter the coefficient a: ");
double a = scanner.nextDouble();
System.out.print("Enter the coefficient b:");
double b = scanner.nextDouble();
System.out.print("Enter the coefficient c:");
double c = scanner.nextDouble();
// Calculate the discriminant of the quadratic equation.
double discriminant = b * b - 4 * a * c;
// Check the discriminant to determine the type of solutions.
if (discriminant > 0) {
// Calculate and display real solutions if the discriminant is positive.
double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
System.out.println("Real solutions:");
System.out.println("Root 1:" + root1);
System.out.println("Root 2:" + root2);
} else if (discriminant == 0) {
// Calculate and display a real solution if the discriminant is zero.
double root = -b / (2 * a);
System.out.println("Real solution:");
System.out.println("Root:" + root);
} else {
// Display a message indicating no real solutions if the discriminant is negative.
System.out.println("No real solutions.");
}
}
}
