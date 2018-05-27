package OOP;

import java.text.DecimalFormat;

public class ObjectsPizzaProgram {
	
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
			return name + " (" + df.format(price).replaceAll("\\.",",") + " euros)";
		}

	}

	public static void main(String[] args) {
		
		Pizza diavolo = new Pizza("Diavolo", 8.75);
		Pizza fruttiDiMare = new Pizza("Frutti di mare", 9.00);
		Pizza allaPollo = new Pizza("Alla Pollo", 7.50);

		System.out.println(diavolo.toString());
		System.out.println(fruttiDiMare.toString());
		System.out.println(allaPollo.toString());

	}
	

}
