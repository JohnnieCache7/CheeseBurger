package model;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Spring 2023 Jan 17, 2023
 */

public class CheeseBurger {

	private String type;
	private double price;
	private boolean cheese;

	public CheeseBurger() {

	}

	public CheeseBurger(String type) {
		setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

}
