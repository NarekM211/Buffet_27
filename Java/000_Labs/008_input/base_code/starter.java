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
		System.out.print("First Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Birthday Month: ");
        int month = sc.nextInt();

        System.out.print("Birthday Day: ");
        int day = sc.nextInt();

        System.out.print("Birthday Year: ");
        int year = sc.nextInt();

        System.out.print("How much is a buck fifty? ");
        double money = sc.nextDouble();

        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My birthday month is " + month + ".");
        System.out.println("My birthday day is " + day + ".");
        System.out.println("My birthday year is " + year + ".");
        System.out.println("A buck fifty is $" + money + ".");
	}
}
