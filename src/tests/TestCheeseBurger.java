package tests;

import model.CustomerOrder;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import model.CheeseBurger;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Spring 2023 Jan 17, 2023
 */

public class TestCheeseBurger {

	CustomerOrder order = new CustomerOrder();
	CheeseBurger burger = new CheeseBurger("Burger1");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTotalOrderPrice() {
		burger.setPrice(10.99);
		double price = order.totalOrderPrice(burger);
		assertEquals(11.7593, price, 0.0);
	}

}
