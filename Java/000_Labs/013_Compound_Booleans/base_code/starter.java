/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int Largest = a;
		int smallest = a;
		if (a > Largest)
			Largest = a;
		if (b > Largest)
			Largest = b;
		if (c > Largest)
			Largest = c;
		if (a > smallest)
			smallest = a;
		if (b > smallest)
			smallest = b;
		if (c > smallest)
			smallest = c;
		System.out.println("Largest: " + Largest);
		System.out.println("Smallest: " + smallest);
		
	}
}
