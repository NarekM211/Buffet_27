/*
    Lecture note example - Input!!
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        System.out.println("🐻🍕 Welcome to Freadbears Family Diner 🍕🐻");
        double item1Price = 4.99;
        //System.out.println("Pizza Pasta - " + item1Price);
        double item2Price = 4.99;
        //System.out.println("Alfredo Pasta - " + item2Price);
        double item3Price = 4.49;
        //System.out.println("Spinich Pasta - " + item3Price);
        double item4Price = 4.30;
        //System.out.println("Plain Pasta - " + item4Price);
        //double item5Price = 2.99;
        //System.out.println("Small Pizza - " + item5Price);
        //double item6Price = 4.99;
        //System.out.println("Medium Pizza - " + item6Price);
        //double item7Price = 6.99;
        //System.out.println("Large Pizza - " + item7Price);
        double item8Price = 3.99;
        //System.out.println("Birthday Cake - " + item8Price);
        double item9Price = 0.83;
        //System.out.println("Cupcake - " + item9Price);
        double item10Price = 0.99;
        //System.out.println("Yogurt - " + item10Price);
        double item11Price = 0.97;
        //System.out.println("Cookie - " + item11Price);
        double item12Price = 2.84;
        //System.out.println("Cheese Cake - " + item12Price);
        double item13Price = 4.49;
        //System.out.println("Milkshake - " + item13Price);
        double item14Price = 3.20;
        //System.out.println("Sprite - " + item14Price);
        double item15Price = 2.99;
        //System.out.println("7 Up - " + item15Price);
        double item16Price = 2.82;
        //System.out.println("Pepsi - " + item16Price);
        double item17Price = 3.29;
        //System.out.println("Squrirt - " + item17Price);
        double item18Price = 3.00;
        //System.out.println("Lemonade - " + item18Price);
        double item19Price = 3.09;
        //System.out.println("Fruit Punch - " + item19Price);
        //the menu items and price
        //javac LectureInput.java

        Scanner sc = new Scanner(System.in);
        //SOP(edgjakl)
        //String answer = 
        //if(answer.equals("yes")){            
        //}
        //if(answer.equals("no"){            
        //}
        //System.out.println("Who is purchasing?");
        //String name = sc.nextLine();
        //System.out.println("How many Large Peperoni Pizzas would you like?");
        //int item1Amt = sc.nextInt();
        //System.out.println("How many Vanilla Cupcakes would you like?");
        //int item2Amt = sc.nextInt();
        //System.out.println("How many Pepsis would you like?");
        //int item3Amt = sc.nextInt();
        System.out.println("Who is purchasing?");
        String name = sc.nextLine();
        System.out.println("Would you like any pizza?");
        String = sc.nextLine();
        if(answer.equals("yes")){
        double item5Price = 2.99;
        System.out.println("Small Pizza - " + item5Price);
        double item6Price = 4.99;
        System.out.println("Medium Pizza - " + item6Price);
        double item7Price = 6.99;
        System.out.println("Large Pizza - " + item7Price);
        }

        double item1Total = item1Price * item1Amt;
        double item2Total = item2Price * item2Amt;
        double item3Total = item3Price * item3Amt;
        double item4Total = item4Price * item4Amt;
        double grandtotal = (item1Total + item2Total + item3Total + item4Total);
        System.out.println("Total is: " + grandtotal);

        System.out.println("how much would you like to tip?");
        double tip = sc.nextDouble();
        tip = (tip/100)*grandtotal;

        System.out.println("Tip and total is " + (tip + grandtotal));
	}
}
