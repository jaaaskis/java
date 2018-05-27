package OOP;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ObjectsPizzaArrayList {
	
	static DecimalFormat df = new DecimalFormat("##.00");

	public static class Pizza {

		private String name;
		private double price;

		public Pizza(String name, double price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public double getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return name + " (" + df.format(price).replaceAll("\\.", ",") + " euros)";
		}

	}

	public static void main(String[] args) {
		
		ArrayList<Pizza> pizzaArray = new ArrayList<Pizza>();
		
		pizzaArray.add(new Pizza("Diavolo", 8.75));
		pizzaArray.add(new Pizza("Frutti al Mare", 9.00));
		pizzaArray.add(new Pizza("Alla Pollo", 7.50));
		
		for (Pizza pizzaObject : pizzaArray) {
			System.out.println(pizzaObject);
		}

	}

}
