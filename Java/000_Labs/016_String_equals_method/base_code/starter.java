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
		System.out.println("Dear traveler, who would you like to be for this quest?");
		System.out.println("1. Wizard");
		System.out.println("2. Warrior");
		System.out.println("3. Rogue");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if(name.equals("wizard")){
			System.out.println("You have chosen to be a wizard, good luck to you on your journey.");
		}else if(name.equals("warrior")){
			System.out.println("You have chosen to be a warrior, good luck to you on your journey.");
		}else if(name.equals("rogue")){
			System.out.println("You have chosen to be a rogue, good luck to you on your journey.");
		}else{
			System.out.println("Im sorry but this role doesnt exist, try another role.");
		}
	}
}
