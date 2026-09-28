/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        int Largest = 255;
        int smallest = 0;
        int r = (int)(Math.random() * (Largest-smallest) + smallest);
        int g = (int)(Math.random() * (Largest-smallest) + smallest);
        int b = (int)(Math.random() * (Largest-smallest) + smallest);
        
        System.out.println("Original: " + r + ", " + g + ", " + b);
        getColor(r, g, b);

        int R = 255 - r;
        int G = 255 - g;
        int B = 255 - b;
        
        System.out.println("Complementary: " + R + ", " + G + ", " + B);
        getColor(R, G, B);
        System.out.println("Triadic: " + r + ", " + g + ", " + b);
        getColor(r, g, b);
        System.out.println("BRG Swap: " + b + ", " + r + ", " + g);
        getColor(b, r, g);
        System.out.println("GBR Swap: " + g + ", " + b + ", " + r);
        getColor(g, b, r);

        
        int darkR = (int)(Math.random() * 129);
        int darkG = (int)(Math.random() * 129);
        int darkB = (int)(Math.random() * 129);
        System.out.println("Dark Color: " + darkR + ", " + darkG + ", " + darkB);
        getColor(darkR, darkG, darkB);

        int lightR = (int)(Math.random() * 128) + 128;
        int lightG = (int)(Math.random() * 128) + 128;
        int lightB = (int)(Math.random() * 128) + 128;
        System.out.println("Light Color: " + lightR + ", " + lightG + ", " + lightB);
        getColor(lightR, lightG, lightB);

        int blueR = (int)(Math.random() * 129);
        int blueG = (int)(Math.random() * 129);
        int blueB = (int)(Math.random() * 128) + 128;
        System.out.println("Bluer Color: " + blueR + ", " + blueG + ", " + blueB);
        getColor(blueR, blueG, blueB);

        int myR = (int)(Math.random() * 128) + 128;
        int myG = (int)(Math.random() * 100);
        int myB = (int)(Math.random() * 50);
        System.out.println("Custom Warm Color: " + myR + ", " + myG + ", " + myB);
        getColor(myR, myG, myB);
		// Call getColor(#, #, #);

	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
