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
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();

		System.out.println("Enter another number");
		int num2 = input.nextInt();

		if(num1 == num2){
			System.out.println("The values are equal.");
		}
		if(num1!= num2){
			System.out.println("The values are different.");
			}
		}

	}