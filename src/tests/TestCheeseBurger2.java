package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CheeseBurger;
import model.CustomerOrder;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Spring 2023 Jan 17, 2023
 */

public class TestCheeseBurger2 {

	CustomerOrder order = new CustomerOrder();
	CheeseBurger burger = new CheeseBurger("Burger2");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHasCheese() {
		burger.setCheese(true);
		assertTrue(order.hasCheese(burger));
	}

	@Test
	public void testHasNoCheese() {
		burger.setCheese(false);
		assertFalse(order.hasCheese(burger));
	}

}
