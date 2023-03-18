package org.example;

import org.example.models.AmericanoCoffee;
import org.example.models.Coffee;
import org.example.models.EverythingAllAtOnceCoffee;
import org.example.models.LatteCoffee;

public class Main {
	public static void main(String[] args) {
		Coffee coffee1 = new AmericanoCoffee.Builder()
			.type(Coffee.Type.ICED)
			.shot(3)
			.water(200)
			.build();
		Coffee coffee2 = new LatteCoffee.Builder()
			.type(Coffee.Type.HOT)
			.shot(2)
			.milk(100)
			.build();
		Coffee coffee3 = new EverythingAllAtOnceCoffee.Builder()
			.type(Coffee.Type.ICED)
			.shot(3)
			.carrot(15)
			.chocolate(20)
			.cinnamon(5)
			.magicPowder(5)
			.pineapple(50)
			.syrup(2)
			.tomato(10)
			.message("Happy Birthday!")
			.sugar(100)
			.build();

		System.out.println(coffee1);
		System.out.println(coffee2);
		System.out.println(coffee3);
	}
}
