/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		double x = sc.nextDouble();

		System.out.print("Enter y: ");
		double y = sc.nextDouble();

		System.out.println("Max: " + Math.max(x, y));
		System.out.println("Square Root of y: " + Math.sqrt(y));
		System.out.println("x to the power of y: " + Math.pow(x, y));
	}
}
