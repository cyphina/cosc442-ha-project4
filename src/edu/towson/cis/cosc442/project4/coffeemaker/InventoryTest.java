package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 3/22/18 6:59 PM
 * @author Cyphina
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	
	Inventory fixture;
	/**
	 * Run the Inventory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		
		assertNotNull(fixture);
		assertEquals("Coffee: 15nullMilk: 15nullSugar: 15nullChocolate: 15null", fixture.toString());
		assertEquals(15, fixture.getSugar());
		assertEquals(15, fixture.getCoffee());
		assertEquals(15, fixture.getChocolate());
		assertEquals(15, fixture.getMilk());
		
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testEnoughIngredients_1()
		throws Exception {
		
		Recipe r = new Recipe();
		r.setAmtChocolate(1);
		r.setAmtCoffee(1);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setName("Coffee");
		
		CoffeeMaker cm = new CoffeeMaker();
		cm.checkInventory().setChocolate(1); 
		cm.checkInventory().setMilk(1); 
		cm.checkInventory().setSugar(1); 
		cm.checkInventory().setCoffee(1); 
		
		boolean result = fixture.enoughIngredients(r);
		assertEquals(true, result);
	}

	/**
	 * Run the boolean enoughIngredients(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testEnoughIngredients_2()
		throws Exception {
		Recipe r = new Recipe();

		boolean result = fixture.enoughIngredients(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int getChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testGetChocolate_1()
		throws Exception {
		int result = fixture.getChocolate();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testGetCoffee_1()
		throws Exception {
		int result = fixture.getCoffee();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testGetMilk_1()
		throws Exception {
		int result = fixture.getMilk();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the int getSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testGetSugar_1()
		throws Exception {
		int result = fixture.getSugar();

		// add additional test code here
		assertEquals(15, result);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testSetChocolate_1()
		throws Exception {
		int chocolate = -1;

		fixture.setChocolate(chocolate);

		assertEquals(fixture.getChocolate(), 0);
	}

	/**
	 * Run the void setChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testSetChocolate_2()
		throws Exception {
		int chocolate = 0;
		int amtChocolateBefore = fixture.getChocolate();
		fixture.setChocolate(chocolate);
		assertEquals(fixture.getChocolate(), chocolate);
		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testSetCoffee_1()
		throws Exception {
		int coffee = -1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testSetCoffee_2()
		throws Exception {
		int coffee = 1;

		fixture.setCoffee(coffee);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testSetMilk_1()
		throws Exception {
		int milk = -1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testSetMilk_2()
		throws Exception {
		int milk = 1;

		fixture.setMilk(milk);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testSetSugar_1()
		throws Exception {
		int sugar = -1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the void setSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testSetSugar_2()
		throws Exception {
		int sugar = 1;

		fixture.setSugar(sugar);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {

		String result = fixture.toString();

		// add additional test code here
		assertEquals("Coffee: 15nullMilk: 15nullSugar: 15nullChocolate: 15null", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		fixture = new Inventory();
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/22/18 6:59 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}