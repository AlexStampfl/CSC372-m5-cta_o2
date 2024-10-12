package m5_cta;

import java.util.Scanner;

/**
 * This program is to find the sum of 5 numbers recursively
 * - allow user to enter 5 numbers
 * - use recursion to provide the sum of numbers
 */

public class recursion_cta_m5 {
	
	public static int getSum(Scanner scanner, int numbersLeft) {
		if (numbersLeft == 0) { // if 'numbersleft' is 0, return, else, enter number (less numbers left)
			return 0; // base case, stops recursion
		}
		// recursive case
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		return number + getSum(scanner, numbersLeft - 1); // decrementing 'numbersleft' with each iteration
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = getSum(scanner, 5); // gives arguments for getSum's parameters
		System.out.println("The sum of the numbers is: " + sum);	
	}
}
