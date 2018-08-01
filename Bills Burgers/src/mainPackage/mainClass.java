package mainPackage;

import burgerConfig.burgerConfig;
import burgerClass.classicalBurger;
import burgerClass.healthyBurger;
import burgerClass.premiumBurger;
import burgerClass.superBurger;

import java.util.*;

public class mainClass {
	public static int takeAdditionalItem() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many additional vegetable do you want to add ???");
		System.out.println("1--Tomatoes\n2--Onion\n3--Mushroom"
				+ "\n4--Lettuce\n5--Cucumber\n6--Green onion"
				+ "\n7--Cocain\n8--Chip and drink");
		int choice = Integer.parseInt(userInput.nextLine());
		return choice;
	}
	
	public static void takeOrder() {		
		superBurger clientBurger = new superBurger();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Client name: ");
		String name = userInput.nextLine();
		System.out.println("Kind of burger: \n1--Normal burger\n2--Special burger");
		int burgerKind = Integer.parseInt(userInput.nextLine());	
		
		if (burgerKind == 1) {
			System.out.println("\n");
			System.out.println("Would you like to choose the special combo of our store ???");
			String choice = userInput.nextLine();
			choice = choice.toLowerCase();
			
			if (choice.equals("yes")) {
				System.out.println("\n");
				System.out.println("=== BURGER COMBO ===");
				System.out.println("1--TUNA BURGER COMBO");
				System.out.println("2--MEATBALL BURGER COMBO");
				System.out.println("===      DONE     ===");
				System.out.println("\n");
				int burgerChoice = Integer.parseInt(userInput.nextLine());
				if (burgerChoice == 1) {
					clientBurger = new classicalBurger(name, 0, 0, 0);
					clientBurger.setBurgerType(burgerConfig.COMBOTUNA);
					clientBurger.findTotalprice();
					clientBurger.showInfo();
				}
				else if (burgerChoice == 2) {
					clientBurger = new classicalBurger(name, 0, 0, 0);
					clientBurger.setBurgerType(burgerConfig.COMBOMEATBALL);
					clientBurger.findTotalprice();
					clientBurger.showInfo();
				}
			}
			else if (choice.equals("no")) {
				System.out.println("\n");
				int additionalVegetable = takeAdditionalItem();
				clientBurger = new classicalBurger(name, 0, 0, additionalVegetable);
				clientBurger.setBurgerType(burgerConfig.BASICBURGER);
				clientBurger.findTotalprice();
				clientBurger.showInfo();
			}
		}
		else if (burgerKind == 2) {
			System.out.println("\n");
			System.out.println("=== SPECIAL COMBO ===");
			System.out.println("1--HEALTHY BURGER");
			System.out.println("2--PREMIUM BURGER");
			System.out.println("===      DONE     ===");
			System.out.println("\n");
			int burgerChoice = Integer.parseInt(userInput.nextLine());
			if (burgerChoice == 1) {
				int additionalVegetable = takeAdditionalItem();
				clientBurger = new healthyBurger(name, 0, 0, additionalVegetable);
				clientBurger.getBurgerType();
				clientBurger.findTotalprice();
				clientBurger.showInfo();
			}
			else if (burgerChoice == 2) {
				int additionalVegetable = takeAdditionalItem();
				clientBurger = new premiumBurger(name, 0, 0, additionalVegetable);
				clientBurger.getBurgerType();
				clientBurger.findTotalprice();
				clientBurger.showInfo();
			}
		}
	}
	
	public static void main(String args[]) {
		takeOrder();
	}
}
