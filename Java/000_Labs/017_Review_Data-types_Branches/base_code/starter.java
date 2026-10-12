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
		if(name.equals("Wizard")){
			System.out.println("You have chosen to be a Wizard.");
		}else if(name.equals("Warrior")){
			System.out.println("You have chosen to be a Warrior.");
		}else if(name.equals("Rogue")){
			System.out.println("You have chosen to be a Rogue.");
		}else{
			System.out.println("Im sorry but this role doesnt exist, try another role.");
			name = sc.nextLine();
		}	
		
		//NAME
		System.out.println("And what should i call you " + name + "?");
		String callName = sc.nextLine();
		
		//INFO
		System.out.println("ok " + callName + " lets see your traits you can only use 1-10 points for each");
		System.out.println("Strength - Buff and able to carry larger items");
		System.out.println("Dexterity - Quick and agile");
		System.out.println("Intelligence - Better at magic");
		System.out.println("Charisma - How personable");
		System.out.println("You only have 20 points to use");
		int totalPoints = 20;
		int strength = 0;
		int dexterity = 0;
		int intelligence = 0;
		int charisma = 0;

		//STRENGTH
		System.out.print("Strength: ");
		strength = sc.nextInt();
		if(strength > 10||strength < 0) {
			System.out.println("That's too much strength! try again.");
			strength = sc.nextInt();
		}
		if (totalPoints > 0){
			totalPoints = totalPoints - strength;
			System.out.println("You have " + totalPoints + " points left to use");
			}
			else if(totalPoints <= 0){
			System.out.println("You have no points let to use");
			strength = 0;
		}
		
		
		//DEXTERITY
		System.out.print("Dexterity: ");
		dexterity = sc.nextInt();
		if(dexterity > 10||dexterity < 0) {
			System.out.println("That's too much dexterity! try again.");
			dexterity = sc.nextInt();
		}
		if (totalPoints > 0){
			totalPoints = totalPoints - dexterity;
			System.out.println("You have " + totalPoints + " points left to use");
			}
			else if(totalPoints <= 0){
			System.out.println("You have no points let to use");
			dexterity = 0;
		}
		
			
			//INTELLIGENCE
			System.out.print("Intelligence: ");
			intelligence = sc.nextInt();
			if(intelligence > 10||intelligence < 0) {
			System.out.println("That's too much intelligence! try again.");
			intelligence = sc.nextInt();
			}
			if (totalPoints > 0){
			totalPoints = totalPoints - intelligence;
			System.out.println("You have " + totalPoints + " points left to use");
			}
			else if(totalPoints <= 0){
			System.out.println("You have no points let to use");
			intelligence = 0;
			}
	
				
				//CHARISMA
				System.out.print("Charisma: ");
				charisma = sc.nextInt();
				if(charisma > 10||charisma < 0) {
				System.out.println("That's too much charisma! try again.");
				charisma = sc.nextInt();
				}
				if (totalPoints > 0){
				totalPoints = totalPoints - charisma;
				System.out.println("You have " + totalPoints + " points left to use");
				}
				else if(totalPoints <= 0){
				System.out.println("You have no points let to use");
				charisma = 0;
				}

				System.out.println(callName + ": Wizard," + " Strength: " + strength + " Dexterity: " + dexterity + " Intelligence: " + intelligence + " Charisma: " + charisma);
				System.out.println("Nice to meet you " + callName + "! And good luck on your journey!");
			}
		
		
	}

