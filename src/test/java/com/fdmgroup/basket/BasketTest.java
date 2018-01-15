package com.fdmgroup.basket;

import static org.junit.Assert.*;


import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class BasketTest {

	private Fruit fruit;

	@Test
	public void Test_AddOneAppleToBasket() {

		//Arrange 
		List<Fruit> fruits = new ArrayList<Fruit>();
		double totalPrice = 0;

		//Act
		Fruit apple = new Fruit("Apple", 0.25);
		
		totalPrice = totalPrice + apple.getPrice();
		
		fruits.add(apple);
		//Assert
		
		assertEquals(0.25, totalPrice, 0.0);
	}

	@Test
	public void Test_AddOneAppleAndOneBananaToBasket() {

		//Arrange
		List<Fruit> fruits = new ArrayList<Fruit>();
		double totalPrice = 0;
		
		//Act
		Fruit apple = new Fruit("Apple", 0.25);
		Fruit banana = new Fruit("Banana", 0.15);

		totalPrice = totalPrice + apple.getPrice();
		totalPrice = totalPrice + banana.getPrice();

		fruits.add(apple);
		fruits.add(banana);
		
		//Assert
		assertEquals(0.40, totalPrice, 0.0);
	}

	@Test
	public void Test_AddAppleAndBananaAndOrangeToBasket() {

		//Arrange
		List<Fruit> fruits = new ArrayList<Fruit>();
		double totalPrice = 0;

		//Act
		Fruit apple = new Fruit("Apple", 0.25);
		Fruit banana = new Fruit("Banana", 0.15);
		Fruit orange = new Fruit("Orange", 0.30);
		
		totalPrice = totalPrice + apple.getPrice();
		totalPrice = totalPrice + banana.getPrice();
		totalPrice = totalPrice + orange.getPrice();

		fruits.add(apple);
		fruits.add(banana);

		//Assert
		assertEquals(0.70, totalPrice, 0.0);
	}

	@Test
	public void Test_AddTwoLemonsToBasket() {

		//Arrange
		List<Fruit> fruits = new ArrayList<Fruit>();
		double totalPrice = 0;

		//Act
		Fruit lemon = new Fruit("Lemon", 0.40);

		totalPrice = totalPrice + lemon.getPrice();
		totalPrice = totalPrice + lemon.getPrice();

		fruits.add(lemon);
		fruits.add(lemon);

		//Assert
		assertEquals(0.80, totalPrice, 0.0);
	}
}
