// Import the Scanner class from the java.util package to read user input.
import java.util.Scanner;
// Main class that contains the program's entry point.
public class Main {
// Recursive function to calculate the nth Fibonacci number
public static int recursiveFibonacci(int n) {
// Base case: If n is 0 or 1, return n.
if (n <= 1) {
return n;
}
// Recursive step: Calculate Fibonacci(n-1) + Fibonacci(n-2).
return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
}
// Non-recursive function to calculate the nth Fibonacci number
public static int nonRecursiveFibonacci(int n) {
// Base case: If n is 0 or 1, return n
if (n <= 1) {
return n;
}
// Initialize variables to store the previous two Fibonacci numbers.
int prev1 = 1;
int prev2 = 1;
int fib = 0;
// Calculate the nth Fibonacci number iteratively.
for (int i = 2; i < n; i++) {
fib = prev1 + prev2;
prev1 = prev2;
prev2 = fib;
}
return fib;
}
public static void main(String[] args){
// Print a message to the console.
System.out.println("yadavshubhamj");// Create a Scanner object to read user input.
Scanner scanner = new Scanner(System.in);
// Prompt the user to enter the value of n.
System.out.print("Enter the value of n: ");
int n = scanner.nextInt();
// Check if n is non-positive and prompt the user to enter a positive integer.
if (n <= 0) {
System.out.println("Please enter a positive integer.");
return;
}
// Calculate the nth Fibonacci number using both recursive and non-recursive methods.
int recursiveResult = recursiveFibonacci(n);
int nonRecursiveResult = nonRecursiveFibonacci(n);
// Display the results using both methods.
System.out.println("Using Recursive Function:");
System.out.println("Fibonacci(" + n + ") = " + recursiveResult);
System.out.println("\nUsing Non-Recursive Function:");
System.out.println("Fibonacci(" + n + ") = " + nonRecursiveResult);
}
}
