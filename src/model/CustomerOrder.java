package model;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Spring 2023 Jan 17, 2023
 */

public class CustomerOrder {

	private double tax = .07;

	public double totalOrderPrice(CheeseBurger cheeseburger) {
		double totalPrice = 0.0;
		totalPrice = cheeseburger.getPrice() + (cheeseburger.getPrice() * tax);
		return totalPrice;
	}

	public boolean hasCheese(CheeseBurger cheeseburger) {

		if (cheeseburger.isCheese() == true) {
			return true;
		} else
			return false;
	}

}
