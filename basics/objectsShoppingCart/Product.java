package objectsShoppingCart;

public class Product {

	private int productNumber;
	private String productName;
	private double price;

	public Product(int productNumber, String productName, double price) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.price = price;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
