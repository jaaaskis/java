package objectsShoppingCart;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> itemList = new ArrayList<Item>();

	public ShoppingCart() {

	}

	public void add(Product product, int quantity) {
		Item itemAdded = new Item(product, quantity);

		this.itemList.add(itemAdded);
	}

	public void remove(Product product) {

		for (Item itemRemoved : itemList) {
			if (itemRemoved.getProduct() == product) {
				this.itemList.remove(itemRemoved);
				return;
			}
		}

	}

	public double getTotalPrice() {

		double output = 0;

		for (Item items : itemList) {
			output += items.getSubtotal();
		}

		return output;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("##.00");

		String output = "";
		String totalPrice = "TOTAL PRICE: ";

		for (Item items : itemList) {
			output += items.getProduct().getProductNumber() + ": " + items.getProduct().getProductName()
					+ ", quantity: " + items.getQuantity() + ", unit price: "
					+ df.format(items.getProduct().getPrice()).replace('.', ',') + ", subtotal: "
					+ df.format(items.getSubtotal()).replace('.', ',') + "\n";
		}

		if (output == "") {
			System.out.print("There are no items in the shopping cart.\n");
			return output;
		}

		output += totalPrice + df.format(this.getTotalPrice()).replace('.', ',') + "\n";

		System.out.print("=== Shopping cart ===\n");

		return output;
	}
}
