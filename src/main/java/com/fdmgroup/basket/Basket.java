package com.fdmgroup.basket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Basket {

	static String item; // This variable is the item selection.
	static String answer; // Answer 'yes or no' for prompted question after item
							// selection.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##.00");
		List<Fruit> fruits = new ArrayList<Fruit>();

		boolean selection = false;

		double sum = 0;

		Fruit apple = new Fruit("Apple", 0.25);
		Fruit banana = new Fruit("Banana", 0.15);
		Fruit orange = new Fruit("Orange", 0.30);
		Fruit lemon = new Fruit("Lemon", 0.40);
		Fruit peach = new Fruit("Peach", 0.35);

		System.out.println("Please select from the following:");
		System.out.println("A = Apple (£" + apple.getPrice() + ")");
		System.out.println("B = Banana (£" + banana.getPrice() + ")");
		System.out.println("O = Orange (£" + orange.getPrice() + ")");
		System.out.println("L = Lemon (£" + lemon.getPrice() + ")");
		System.out.println("P = Peach (£" + peach.getPrice() + ")");
		System.out.println(" ");
		System.out.println("Enter A,B,O,L,P");
		System.out.println(" ");

		do {
			item = scanner.next();

			if (item.equalsIgnoreCase("a")) {

				System.out.print("Apple selected");
				selection = true;
				fruits.add(apple);
			} else if (item.equalsIgnoreCase("b")) {

				System.out.print("Banana selected");
				selection = true;

				fruits.add(banana);
			} else if (item.equalsIgnoreCase("o")) {

				System.out.print("Orange selected");
				selection = true;

				fruits.add(orange);
			} else if (item.equalsIgnoreCase("l")) {

				System.out.print("Lemon selected");
				selection = true;

				fruits.add(lemon);
			} else if (item.equalsIgnoreCase("p")) {

				System.out.print("Peach selected");
				selection = true;

				fruits.add(peach);

			} else
				System.out.println("Invalid Selection. Please select from the above");

		} while (selection != true);

		if (selection = true) {
			System.out.println(" ");
			System.out.println("Have you finished. Enter Y/N");
			answer = scanner.next();

			do {
				System.out.println("Select next item please.");
				do {
					item = scanner.next();

					if (item.equalsIgnoreCase("a")) {

						System.out.print("Apple selected");
						selection = true;

						fruits.add(apple);
					} else if (item.equalsIgnoreCase("b")) {

						System.out.print("Banana selected");
						selection = true;

						fruits.add(banana);
					} else if (item.equalsIgnoreCase("o")) {

						System.out.print("Orange selected");
						selection = true;

						fruits.add(orange);
					} else if (item.equalsIgnoreCase("l")) {

						System.out.print("Lemon selected");
						selection = true;

						fruits.add(lemon);
					} else if (item.equalsIgnoreCase("p")) {

						System.out.print("Peach selected");
						selection = true;

						fruits.add(peach);

					} else
						System.out.println("Invalid Selection.");

				} while (selection != true);

				System.out.println(" ");
				System.out.println("Have you finished. Enter Y/N");
				answer = scanner.next();

			} while (answer.equalsIgnoreCase("n"));

			if (answer.equalsIgnoreCase("y")) {
				for (Fruit fruit : fruits) {
					System.out.println("Item: " + fruit.getName() + " £" + fruit.getPrice());
					sum += fruit.getPrice();
				}
				System.out.println("Your total is : £" + f.format(sum));

			}
		}
	}
}
