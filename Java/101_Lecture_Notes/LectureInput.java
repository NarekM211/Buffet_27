/*
    Lecture note example - Input!!
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        System.out.println("🐻🍕 Welcome to Freadbears Family Diner 🍕🐻");
        double item1Price = 6.99;
        System.out.println("Large Peperoni Pizza - " + item1Price);
        double item2Price = 0.83;
        System.out.println("Vanilla Cupcake - " + item2Price);
        double item3Price = 2.82;
        System.out.println("Pepsi - " + item3Price);
        //javac lecture input.java

        Scanner sc = new Scanner(System.in);
        System.out.println("Who is purchasing?");
        String name = sc.nextLine();
        System.out.println("How many Large Peperoni Pizzas would you like?");
        int item1Amt = sc.nextInt();
        System.out.println("How many Vanilla Cupcakes would you like?");
        int item2Amt = sc.nextInt();
        System.out.println("How many Pepsis would you like?");
        int item3Amt = sc.nextInt();

        double item1Total = item1Price * item1Amt;
        double item2Total = item2Price * item2Amt;
        double item3Total = item3Price * item3Amt;
        System.out.println("Total is: " + (item1Total + item2Total + item3Total));
	}
}
