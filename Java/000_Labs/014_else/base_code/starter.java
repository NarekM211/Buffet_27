/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int num1 = (int)(Math.random() * 1000) + 1;
		Scanner input = new Scanner (System.in);
		System.out.println("guess the number im thinking of.");
		int Narek = input.nextInt();
		if(Narek == (num1)){
			System.out.println("You got it!");
		}else{
			System.out.println("No, the number was " + num1 );
		}
	}
}
